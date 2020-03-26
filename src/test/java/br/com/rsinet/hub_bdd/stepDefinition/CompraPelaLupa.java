package br.com.rsinet.hub_bdd.stepDefinition;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import br.com.rsinet.hub_bdd.pageObject.BuscaLupaPageObject;
import br.com.rsinet.hub_bdd.pageObject.LoginPageObject;
import br.com.rsinet.hub_bdd.suporte.Context;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class CompraPelaLupa {
	private Context context;
	private BuscaLupaPageObject lupa;
	private LoginPageObject login;
	
	  public CompraPelaLupa(Context getContext) {
	    	context = getContext;
	    	lupa = context.getManager().getLupa();
	    	login = context.getManager().getLoginPage();
		}
	
	  @Dado("^que estou na tela inicial\\.$")
	  public void que_estou_na_tela_inicial() {
		  login.user();
	    
	  }

	  @Dado("^insiro o login \"([^\"]*)\"$")
	  public void insiro_o_login(String usuario) {
		  login.usuario(usuario);
	    
	  }

	  @Dado("^insiro a senha \"([^\"]*)\"$")
	  public void insiro_a_senha(String senha) {
		  login.senha(senha);

	  }

	  @Dado("^digito o nome do produto desejado no campo de pesquisa \"([^\"]*)\"$")
	  public void digito_o_nome_do_produto_desejado_no_campo_de_pesquisa(String arg1) {
	     lupa.campoDePesquisa(arg1);
	  }

	  @Dado("^clico no produto\\.$")
	  public void clico_no_produto() {
		  lupa.selecionaProduto();

	  }

	  @Dado("^adiciono ao carrinho\\.$")
	  public void adiciono_ao_carrinho() {
		  lupa.addAoCarrinho();

	  }

	  @Dado("^faco chekout\\.$")
	  public void faco_chekout() {
		  lupa.checkOut();

	  }

	  @Dado("^valido os dados de entrega\\.$")
	  public void valido_os_dados_de_entrega() {
		  lupa.next();

	  }

	  @Quando("^confirmo o pagamento\\.$")
	  public void confirmo_o_pagamento() {
		  lupa.confirmaPagamento();

	  }

	  @Então("^eu valido a compra feita\\.$")
	  public void eu_valido_a_compra_feita() throws InterruptedException {
		  assertTrue(lupa.validação().contains("Thank you for buying with Advantage"));
		  Thread.sleep(5000);
	  }

	  @Entao("^constata que o produto nao existe \"([^\"]*)\"$")
	  public void constata_que_o_produto_nao_existe(String arg1) throws Throwable {
		  assertFalse(lupa.produtoInexistente().contains("No results for" + arg1+ ""));
		  Thread.sleep(3000);
	  }
}