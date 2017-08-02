package com.starfish.catcenter.util;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;

public class Starter {
	public static void main(String[] args) throws Exception {
		Server server = new Server(8080);

		WebAppContext context = new WebAppContext();
		context.setContextPath("/catcenter");
		context.setDescriptor("D:/workspace/catcenter/src/main/webapp/WEB-INF/web.xml");
		context.setResourceBase("D:/workspace/catcenter/src/main/resources");
		context.setParentLoaderPriority(true);
		server.setHandler(context);

		server.start();

		server.join();
	}
}