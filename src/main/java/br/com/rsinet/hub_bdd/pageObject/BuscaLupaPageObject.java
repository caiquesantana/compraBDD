package br.com.rsinet.hub_bdd.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BuscaLupaPageObject {
	WebDriver driver;
	
	public BuscaLupaPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public BuscaLupaPageObject clicarLupa() {
		driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView")).click();
		return this;
	}
	public BuscaLupaPageObject campoDePesquisa (String pesquisa) {
		driver.findElement(By.id("com.Advantage.aShopping:id/editTextSearch")).sendKeys(pesquisa);
		return this;
	}
	public BuscaLupaPageObject selecionaProduto () {
		driver.findElement(By.id("com.Advantage.aShopping:id/imageViewProduct")).click();
		return this;
	}
	public BuscaLupaPageObject pesquisar() {
		driver.findElement(By.id("com.Advantage.aShopping:id/imageViewSearch")).click();
		return this;
	}
}
