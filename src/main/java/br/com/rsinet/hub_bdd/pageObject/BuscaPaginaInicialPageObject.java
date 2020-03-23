package br.com.rsinet.hub_bdd.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BuscaPaginaInicialPageObject {
	private WebDriver driver;
	private WebDriverWait aguardar;
	private String mensagem;

	public BuscaPaginaInicialPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public BuscaPaginaInicialPageObject categoriaLaptop() {
		driver.findElement(By.id("laptopsImg")).click();
		return this;
	}

	public BuscaPaginaInicialPageObject produtoSelecionado() {
		driver.findElement(By.id("9")).click();
		return this;
	}

	public BuscaPaginaInicialPageObject addAoCarrinho() {
		driver.findElement(By.name("save_to_cart")).click();
		return this;
	}

	public BuscaPaginaInicialPageObject checkOut() {
		driver.findElement(By.id("checkOutPopUp")).click();
		return this;
	}

	public BuscaPaginaInicialPageObject next() {
		driver.findElement(By.id("next_btn")).click();
		return this;
	}

	public BuscaPaginaInicialPageObject confirmaPagamento() {
		driver.findElement(By.id("pay_now_btn_SAFEPAY")).click();
		return this;
	}

//	public BuscaPaginaInicialPageObject Expected() throws InterruptedException {
//		aguardar.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/header/nav/ul/li[3]/a/a/svg")));
//		return this;
//	}
	public BuscaPaginaInicialPageObject quantidade(String qtd) {
		WebElement quantidade = driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText"));
		quantidade.click();
		quantidade.sendKeys(qtd);
		return this;
	}
	public BuscaPaginaInicialPageObject validação () {
	String mensagem = driver.getPageSource();
		mensagem.contains("Thank you for buying with Advantage");
		return this;
	}
}
