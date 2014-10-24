package com.tngtech.mmu.logging.web;

import java.io.IOException;
import java.nio.file.Paths;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;

public class LogInit implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		if (Logger.getRootLogger().getAllAppenders().hasMoreElements()) {
			FileAppender fileAppender = null;
			final String catalinaBase = System.getProperty("catalina.base");
			if (catalinaBase != null) {
					try {
						String logFileName = Paths
								.get(catalinaBase, "logs", "MyWebApp.log")
								.toString();
						fileAppender = new FileAppender(new SimpleLayout(), logFileName);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			}
			if (fileAppender != null) {
				BasicConfigurator.configure(fileAppender);
			} else {
				BasicConfigurator.configure();
			}
		}
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub

	}

}
