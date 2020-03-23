package br.com.rsinet.hub_bdd.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import br.com.rsinet.hub_bdd.suporte.Driver;

public class LoginPageObject {
	//WebDriver driver;
	
	public LoginPageObject(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public LoginPageObject user() {
		Driver.driver.findElement(By.name("username")).click();
		return this;
	}

	public LoginPageObject usuario() {
		Driver.driver.findElement(By.id("username")).sendKeys("cauasantana");
		return this;
	}

	public LoginPageObject senha() {
		Driver.driver.findElement(By.name("password")).sendKeys("Caique1");
		return this;
	}
	public LoginPageObject singin() {
		Driver.driver.findElement(By.id("sign_in_btnundefined")).click();
		return this;
	}
}
