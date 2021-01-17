package br.com.franca.listener;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletContextEvent;

/**
 * Application Lifecycle Listener implementation class MeuListener
 *
 */
public class MeuListener implements ServletContextAttributeListener {

	@Override
	public void attributeAdded(ServletContextAttributeEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void attributeRemoved(ServletContextAttributeEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void attributeReplaced(ServletContextAttributeEvent arg0) {
		// TODO Auto-generated method stub

	}

	public void contextInitialized(ServletContextEvent event) {
		System.out.println("Contexto iniciado...");
	}

	public void contextDestroyed(ServletContextEvent event) {
		System.out.println("Contexto desligado...");
	}

}
