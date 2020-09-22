import javax.management.MBeanServer;
import javax.management.ObjectInstance;
import javax.management.ObjectName;
import javax.management.remote.JMXConnectorServer;
import javax.management.remote.JMXConnectorServerFactory;
import javax.management.remote.JMXServiceURL;
import java.io.IOException;
import java.lang.management.ManagementFactory;
import java.net.MalformedURLException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

//jmx测试服务
public class server {
    public static void main(String[] args) throws Exception {

        //创建MBeanServer
        MBeanServer mbs = ManagementFactory.getPlatformMBeanServer();
//        ObjectName helloName = new ObjectName("jmxBean:name=Evil");
        //注册MBean，client通过helloName来获取new Evil()对象
//         mbs.registerMBean(new Evil(), helloName);

        try {
            //这句话非常重要，不能缺少！注册一个端口，绑定url后，客户端就可以使用rmi通过url方式来连接JMXConnectorServer
            LocateRegistry.createRegistry(8888);
            JMXServiceURL url = new JMXServiceURL("service:jmx:rmi:///jndi/rmi://127.0.0.1:8888/jmxrmi");
            JMXConnectorServer cs = JMXConnectorServerFactory.newJMXConnectorServer(url, null, mbs);
            System.out.println("....................begin rmi start.....");
            cs.start();
            System.out.println("....................rmi start.....");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}