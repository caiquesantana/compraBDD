package br.com.rsinet.hub_bdd.suporte;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
	public static WebDriver driver;
	public static WebDriver iniciaChromer() {
		if (driver == null) {

			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://advantageonlineshopping.com/");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}
		return driver;
	}

	public static void fecharDriver() {
		if (driver != null) {
			driver.quit();}
		driver = null;
	}
}