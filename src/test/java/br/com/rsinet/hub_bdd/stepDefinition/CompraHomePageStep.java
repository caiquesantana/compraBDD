package br.com.rsinet.hub_bdd.stepDefinition;

import org.openqa.selenium.WebDriver;

import br.com.rsinet.hub_bdd.pageObject.BuscaPaginaInicialPageObject;
import br.com.rsinet.hub_bdd.pageObject.LoginPageObject;
import br.com.rsinet.hub_bdd.suporte.Driver;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class CompraHomePageStep {
	private WebDriver driver;
	
	@Dado("^que estou na tela inicial$")
public void que_estou_na_tela_inicial() throws Throwable {
		driver = Driver.createChrome();
}
@Dado("^faco o login$")
public void faco_o_login() throws Throwable {
	LoginPageObject login = new LoginPageObject(driver);
	login.user().usuario().senha();
}

@Dado("^clico na categoria LAPTOPS$")
public void clico_na_categoria_LAPTOPS() throws Throwable {
	BuscaPaginaInicialPageObject compra = new BuscaPaginaInicialPageObject(driver);
	compra.categoriaLaptop();
	
}

@Dado("^seleciono o produto$")
public void seleciono_o_produto() throws Throwable {
	BuscaPaginaInicialPageObject compra = new BuscaPaginaInicialPageObject(driver);
	compra.produtoSelecionado().selecionaProduto();
	
}

@Dado("^adiciono ao carrinho$")
public void adiciono_ao_carrinho() throws Throwable {
	BuscaPaginaInicialPageObject compra = new BuscaPaginaInicialPageObject(driver);
	compra.addAoCarrinho();
	
}

@Dado("^vou para a pagina de chekout$")
public void vou_para_a_pagina_de_chekout() throws Throwable {
	BuscaPaginaInicialPageObject compra = new BuscaPaginaInicialPageObject(driver);
	compra.checkOut();
	
}

@Dado("^valido os dados de entrega$")
public void valido_os_dados_de_entrega() throws Throwable {
	BuscaPaginaInicialPageObject compra = new BuscaPaginaInicialPageObject(driver);
	compra.next();
	
}

@Quando("^confirmo o pagamento$")
public void confirmo_o_pagamento() throws Throwable {
	BuscaPaginaInicialPageObject compra = new BuscaPaginaInicialPageObject(driver);
	compra.confirmaPagamento();
	
}

@Então("^eu valido a compra feita$")
public void eu_valido_a_compra_feita() throws Throwable {
	BuscaPaginaInicialPageObject compra = new BuscaPaginaInicialPageObject(driver);
	
}

@Dado("^escolho produto na tela inicial$")
public void escolho_produto_na_tela_inicial() throws Throwable {
	BuscaPaginaInicialPageObject compra = new BuscaPaginaInicialPageObject(driver);
	
}

@Dado("^adiciono mais de (\\d+) unidades no carrinho$")
public void adiciono_mais_de_unidades_no_carrinho(int arg1) throws Throwable {
	BuscaPaginaInicialPageObject compra = new BuscaPaginaInicialPageObject(driver);
	
}

@Então("^eu comparo a quantidade de produto no carrinho$")
public void eu_comparo_a_quantidade_de_produto_no_carrinho() throws Throwable {
	BuscaPaginaInicialPageObject compra = new BuscaPaginaInicialPageObject(driver);
	
}


}
