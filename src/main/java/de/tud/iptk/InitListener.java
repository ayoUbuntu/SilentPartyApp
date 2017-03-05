package de.tud.iptk;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class InitListener implements ServletContextListener {	
	
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("Server has been started.");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println("Server has been stopped.");
    }

}