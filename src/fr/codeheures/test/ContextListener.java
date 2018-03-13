package fr.codeheures.test;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class ContextListener implements ServletContextListener {

	public static final Logger LOG = Logger.getLogger(ContextListener.class.getName());
	
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		LOG.log(Level.INFO, "Servlet context initialized");
	}
	
	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		LOG.log(Level.INFO, "Servlet context destroyed");
	}
	
}
