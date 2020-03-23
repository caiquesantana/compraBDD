package br.com.rsinet.hub_bdd.suporte;

import java.net.MalformedURLException;

public class Context {
	
	private Driver createDriver;
	private PageManager manager;
	
	public Context(){
		createDriver = new Driver();
		manager = new PageManager(Driver.iniciaChromer());
	}
	public Driver getDriver() {
		return createDriver;
	}
	public PageManager getManager() {
		return manager;
	}

}
