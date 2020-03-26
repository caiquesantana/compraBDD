package br.com.rsinet.hub_bdd.stepDefinition;

import static org.testng.Assert.assertTrue;

import org.junit.Assert;

import br.com.rsinet.hub_bdd.pageObject.BuscaPaginaInicialPageObject;
import br.com.rsinet.hub_bdd.pageObject.LoginPageObject;
import br.com.rsinet.hub_bdd.suporte.Context;
import cucumber.api.java.jv.Menawa;
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
	public void que_estou_na_tela_inicial()  {
		login.user();
		
	}

	@Dado("^coloco o login \"([^\"]*)\"$")
	public void coloco_o_login(String arg1)  {
		login.usuario(arg1);
	    
	}

	@Dado("^coloco a senha \"([^\"]*)\"$")
	public void coloco_a_senha(String arg1)  {
		login.senha(arg1);
		login.singin();
	}

	@Dado("^clico na categoria LAPTOPS$")
	public void clico_na_categoria_LAPTOPS()  {
		home.categoriaLaptop();

	}

	@Dado("^seleciono o produto$")
	public void seleciono_o_produto()  {
		home.produtoSelecionado();

	}

	@Dado("^adiciono ao carrinho$")
	public void adiciono_ao_carrinho()  {
		home.addAoCarrinho();

	}

	@Dado("^vou para a pagina de chekout$")
	public void vou_para_a_pagina_de_chekout()  {
		home.checkOut();

	}

	@Dado("^valido os dados de entrega$")
	public void valido_os_dados_de_entrega()  {
		home.next();
		
	}

	@Quando("^confirmo o pagamento$")
	public void confirmo_o_pagamento()  {
		home.confirmaPagamento();
		
	}

	//Teste de Sucesso
	@Então("^eu valido a compra feita$")
	public void eu_valido_a_compra_feita() throws InterruptedException  {
		assertTrue(home.validação().contains("Thank you for buying with Advantage"));
		Thread.sleep(2000);
	}

	@Dado("^escolho produto na tela inicial$")
	public void escolho_produto_na_tela_inicial()  {
		home.categoriaLaptop().produtoSelecionado();

	}

	@Dado("^adiciono mais de \"([^\"]*)\" unidades no carrinho$")
	public void adiciono_mais_de_unidades_no_carrinho(String arg1) {
	   home.quantidade(arg1);
	}

	@Então("^eu comparo a quantidade de produto no carrinho$")
	public void eu_comparo_a_quantidade_de_produto_no_carrinho()  {
		home.addAoCarrinho();
	}

}
