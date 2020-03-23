package br.com.rsinet.hub_bdd.suporte;

import org.openqa.selenium.WebDriver;

import br.com.rsinet.hub_bdd.pageObject.BuscaLupaPageObject;
import br.com.rsinet.hub_bdd.pageObject.BuscaPaginaInicialPageObject;
import br.com.rsinet.hub_bdd.pageObject.LoginPageObject;

public class PageManager {
	private WebDriver driver;
	
	private LoginPageObject loginPage;
	private BuscaPaginaInicialPageObject buscaHome;
	private BuscaLupaPageObject lupa;
	
	public PageManager(WebDriver driver) {
		this.driver = driver;
	}

	public LoginPageObject getLoginPage() {
		return(loginPage == null) ? loginPage = new LoginPageObject (driver) : loginPage;
	}
	
	public BuscaPaginaInicialPageObject getBuscaHome() {
		return (buscaHome == null) ? buscaHome = new BuscaPaginaInicialPageObject(driver) : buscaHome;
	}

	public BuscaLupaPageObject getLupa() {
		return (lupa == null) ? lupa = new BuscaLupaPageObject(driver) : lupa;
	}
}