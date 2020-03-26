package br.com.rsinet.hub_bdd.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class BuscaLupaPageObject {
	private WebDriver driver;

	public BuscaLupaPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public BuscaLupaPageObject clicarLupa() {
		driver.findElement(By.id("menuSearch")).click();
		return this;
	}

	public BuscaLupaPageObject campoDePesquisa(String pesquisa) {
		driver.findElement(By.id("autoComplete")).sendKeys(pesquisa + Keys.ENTER);
		return this;
	}

	public BuscaLupaPageObject selecionaProduto() {

		driver.findElement(By.linkText("HP ZBook 17 G2 Mobile Workstation")).click();
		return this;
	}

	public BuscaLupaPageObject addAoCarrinho() {
		driver.findElement(By.name("save_to_cart")).click();
		return this;
	}

	public BuscaLupaPageObject checkOut() {
		driver.findElement(By.id("checkOutPopUp")).click();
		return this;
	}

	public BuscaLupaPageObject next() {
		driver.findElement(By.id("next_btn")).click();
		return this;
	}

	public BuscaLupaPageObject confirmaPagamento() {
		driver.findElement(By.id("pay_now_btn_SAFEPAY")).click();
		return this;
	}

	public String validação() {
		String mensagem = driver.getPageSource();
		return mensagem;
	}
	public String produtoInexistente() {
		String mensagem = driver.getPageSource();
		return mensagem;
	}
}
