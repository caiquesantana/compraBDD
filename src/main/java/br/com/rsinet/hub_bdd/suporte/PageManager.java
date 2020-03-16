package br.com.rsinet.hub_bdd.suporte;

import org.openqa.selenium.WebDriver;

import br.com.rsinet.hub_bdd.pageObject.BuscaLupaPageObject;
import br.com.rsinet.hub_bdd.pageObject.BuscaPaginaInicialPageObject;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class PageManager {
	private static WebDriver driver;
	private BuscaPaginaInicialPageObject buscaHome;
	private BuscaLupaPageObject lupa;
	
	public PageManager(WebDriver driver) {
		PageManager.driver = driver;
	}

	public BuscaPaginaInicialPageObject getBuscaHome() {
		return (buscaHome == null) ? buscaHome = new BuscaPaginaInicialPageObject(driver) : buscaHome;
	}

	public BuscaLupaPageObject getLupa() {
		return (lupa == null) ? lupa = new BuscaLupaPageObject(driver) : lupa;
	}
}