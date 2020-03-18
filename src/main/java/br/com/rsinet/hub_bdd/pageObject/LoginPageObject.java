package br.com.rsinet.hub_bdd.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObject {
	private WebDriver driver;

	public LoginPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public LoginPageObject user () {
		driver.findElement(By.name("username")).click();
		return this;
	}

	public LoginPageObject usuario () {
		driver.findElement(By.name("username")).sendKeys("cauasantana");
		return this;
	}

	public LoginPageObject senha() {
		driver.findElement(By.name("password")).sendKeys("Caique1");
		return this;
	}
}
