package io.github.lzhr.webviewt;

import org.eclipse.jetty.server.Connector;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.nio.SelectChannelConnector;
import org.eclipse.jetty.webapp.WebAppContext;

public class HelloJettyServer
{
    public static void main(String[] args) throws Exception
    {
        Server server = new Server();
        //设置连接参数
        Connector connector = new SelectChannelConnector();
        //设置监听端口
        connector.setPort(8000);
        server.setConnectors(new Connector[] { connector });
        WebAppContext context = new WebAppContext();
        //访问项目地址
        context.setContextPath("/");
        //启动的war包
       // context.setWar("D:\\WorkSpace\\Android\\WebviewT\\app\\src\\main\\res\\Curricula_cjw.war");
        context.setWar("4.war");
        server.setHandler(context);
        server.setStopAtShutdown(true);
        server.setSendServerVersion(true);

        server.start();
        server.join();
    }
}