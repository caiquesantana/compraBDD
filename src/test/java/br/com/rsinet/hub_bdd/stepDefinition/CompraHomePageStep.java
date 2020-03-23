package br.com.rsinet.hub_bdd.stepDefinition;

import br.com.rsinet.hub_bdd.pageObject.BuscaPaginaInicialPageObject;
import br.com.rsinet.hub_bdd.pageObject.LoginPageObject;
import br.com.rsinet.hub_bdd.suporte.Context;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class CompraHomePageStep {
	private Context context;
	private BuscaPaginaInicialPageObject home;
	private LoginPageObject login;
    
    public CompraHomePageStep(Context getContext) {
    	context = getContext;
    	home = context.getManager().getBuscaHome();
    	login = context.getManager().getLoginPage();
	}
	
	@Dado("^que estou na tela inicial$")
	public void que_estou_na_tela_inicial() throws Throwable {
		System.out.println(home);
		
	}

	@Dado("^faco o login$")
	public void faco_o_login() throws Throwable {
		Thread.sleep(10000);
		login.user()
		.usuario().senha().singin();
	}

	@Dado("^clico na categoria LAPTOPS$")
	public void clico_na_categoria_LAPTOPS() throws Throwable {
		home.categoriaLaptop();

	}

	@Dado("^seleciono o produto$")
	public void seleciono_o_produto() throws Throwable {
		home.produtoSelecionado().selecionaProduto();

	}

	@Dado("^adiciono ao carrinho$")
	public void adiciono_ao_carrinho() throws Throwable {
		home.addAoCarrinho();

	}

	@Dado("^vou para a pagina de chekout$")
	public void vou_para_a_pagina_de_chekout() throws Throwable {
		home.checkOut();

	}

	@Dado("^valido os dados de entrega$")
	public void valido_os_dados_de_entrega() throws Throwable {
		home.next();
		
	}

	@Quando("^confirmo o pagamento$")
	public void confirmo_o_pagamento() throws Throwable {
		home.confirmaPagamento();
		
	}

	@Então("^eu valido a compra feita$")
	public void eu_valido_a_compra_feita() throws Throwable {

	}

	@Dado("^escolho produto na tela inicial$")
	public void escolho_produto_na_tela_inicial() throws Throwable {

	}

	@Dado("^adiciono mais de (\\d+) unidades no carrinho$")
	public void adiciono_mais_de_unidades_no_carrinho(int arg1) throws Throwable {

	}

	@Então("^eu comparo a quantidade de produto no carrinho$")
	public void eu_comparo_a_quantidade_de_produto_no_carrinho() throws Throwable {

	}

}
