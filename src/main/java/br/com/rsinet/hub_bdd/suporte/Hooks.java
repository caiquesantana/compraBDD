package br.com.rsinet.hub_bdd.suporte;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	private Context context;
	private WebDriver driver;
	
	public Hooks(Context getContext) {
		context = getContext;
	}
	
	@SuppressWarnings("static-access")
	@Before
	public void iniciaApp() throws MalformedURLException {
		context.getDriver();
		Driver.createChrome();
	}
	@After()
	public void finalizaApp() {
		context.getDriver().fecharDriver();
	}
}
