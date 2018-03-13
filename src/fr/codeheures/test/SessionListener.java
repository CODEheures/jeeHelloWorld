package fr.codeheures.test;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class SessionListener implements HttpSessionListener {

	public static final Logger LOG = Logger.getLogger(SessionListener.class.getName());
	private int sessionCounter = 0;
	
	
	@Override
	public void sessionCreated(HttpSessionEvent se) {
		this.sessionCounter++;
		LOG.log(Level.INFO, "Session created. {0} session(s) in memory", sessionCounter);
	}
	
	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		this.sessionCounter--;
		LOG.log(Level.INFO, "Session destroyed. {0} session(s) in memory", sessionCounter);
	}
	
	
}
