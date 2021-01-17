package br.com.franca.web;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("/")
public class CursoCDIApplication extends ResourceConfig {
	public CursoCDIApplication() {
		packages("br.com.franca.web.api");
	}

}
