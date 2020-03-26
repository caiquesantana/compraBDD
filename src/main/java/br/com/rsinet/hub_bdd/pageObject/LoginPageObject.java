package br.com.rsinet.hub_bdd.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.rsinet.hub_bdd.suporte.Driver;

public class LoginPageObject {
	private WebDriver driver = Driver.driver;
	private WebDriverWait aguardar;
	
	public LoginPageObject(WebDriver driver1) {
		this.driver = driver1;
		aguardar = new WebDriverWait(driver, 5);
	}

	public LoginPageObject user() {
		Driver.driver.findElement(By.id("menuUser")).click();
		return this;
	}

	public LoginPageObject usuario(String login) {
		Driver.driver.findElement(By.name("username")).sendKeys(login);
		return this;
	}

	public LoginPageObject senha(String senha) {
		Driver.driver.findElement(By.name("password")).sendKeys(senha);
		return this;
	}
	public LoginPageObject singin() {
		Driver.driver.findElement(By.id("sign_in_btnundefined")).click();
		return this;
	}
	public LoginPageObject esperaSingin() {
		aguardar.until(ExpectedConditions.elementToBeClickable(By.id("sign_in_btnundefined")));
		return this;
		
	}
}
