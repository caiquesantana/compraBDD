package br.com.rsinet.hub_bdd.suporte;

import java.net.MalformedURLException;

public class Context {
	private Driver createDriver;
	private PageManager manager;
	
	public Context() throws MalformedURLException {
		createDriver = new Driver();
		manager = new PageManager(Driver.createChrome());
	}
	public Driver getDriver() {
		return createDriver;
	}
	public PageManager getManager() {
		return manager;
	}

}
