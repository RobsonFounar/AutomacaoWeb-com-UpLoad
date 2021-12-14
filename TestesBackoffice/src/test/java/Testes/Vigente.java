package Testes;

import ElementosPages.idLogin;
import ElementosPages.idPesquisa;
import coreMetodos.Metodos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Vigente {

	Metodos metodos = new Metodos();
	idLogin login = new idLogin();
	idPesquisa pesquisa = new idPesquisa();
	
	// ValidarUser validar = new ValidarUser();

	@Given("Esteja na Aba Vigente")
	public void esteja_na_aba_vigente() {
		metodos.abrirNavegador("https://front-backoffice-stg-ioglxjjbfa-ue.a.run.app/login", "CHROME",
				"acessando site do loja");
	}

	@When("Quero alterar uma promocao")
	public void quero_alterar_uma_promocao(){

		// Login no BackOffice
		login.login("robson@ideamaker.com.br", "123456");

		// Pesquisar Cliente
		

		// Clicar no Botão Rascunho e Selecao de Praca
	

		// Criacao de Draft
		//create.writeDraft("20112021", "TESTE AUTOMACAO COMPLETO", "1900", "16112021090000", "20112021200000", "10", null);
		

	}

	@Then("Depois de alterado quero fechar o BackOffice")
	public void depois_de_alterado_quero_fechar_o_back_office() {

		// validar.validarUser();
	}
}