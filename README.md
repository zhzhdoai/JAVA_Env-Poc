# JAVA_Env-Poc







## ActiveMQ_JMX_attack

研究CVE-2020-11998 总结无认证和认证情况对ActiveMq 开启 JMX攻击

详情见项目中的PDF

## TomcatEchoEnv

搭建Tomcat通用回显靶场,利用fnmsd师傅的dfs类.方便快速测试,需要修改catlina.sh中的classpath修改恶意类依赖,

```sh
if [ -r "$CATALINA_BASE/bin/tomcat-juli.jar" ] ; then
  CLASSPATH=$CLASSPATH:$CATALINA_BASE/bin/tomcat-juli.jar
else
  CLASSPATH=$CLASSPATH:$CATALINA_HOME/bin/tomcat-juli.jar
fi
  CLASSPATH=$CLASSPATH:/Users/osword/.m2/repository/commons-collections/commons-collections/3.2.1/commons-collections-3.2.1.jar:/Users/osword/.m2/repository/commons-collections/commons-collections/3.2.1/commons-collections-3.2.1-sources.jar:/Users/osword/Downloads/javascript-1.7.2.jar:/Users/osword/.m2/repository/javax/servlet/javax.servlet-api/3.0.1/javax.servlet-api-3.0.1-sources.jar:/Users/osword/.m2/repository/javax/servlet/javax.servlet-api/3.0.1/javax.servlet-api-3.0.1.jar
```

