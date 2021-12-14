package Testes;

import ElementosPages.idLogin;
import ElementosPages.idPesquisa;
import ElementosPages.idRascunho;
import coreMetodos.Metodos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Rascunho {

	Metodos metodos = new Metodos();
	idLogin login = new idLogin();
	idPesquisa pesquisa = new idPesquisa();
	idRascunho rascunho = new idRascunho();
	
	// ValidarUser validar = new ValidarUser();

	@Given("Esteja na tela de cadastro de Rascunho")
	public void esteja_na_tela_de_cadastro_de_rascunho() {
		metodos.abrirNavegador("https://front-backoffice-stg-ioglxjjbfa-ue.a.run.app/login", "CHROME",
				"acessando site do loja");
		// Login no BackOffice
	
	}

	@When("Quero realizar o cadastro de uma PROMOCAO")
	public void quero_realizar_o_cadastro_de_uma_promocao() throws Exception  {

		login.login("robson@ideamaker.com.br", "123456");
		rascunho.menuDraft();
		rascunho.selectMegaMania();
		rascunho.writeDraft("20112021", "TESTE AUTOMACAO COMPLETO", "1900", "16112021090000", "20112021200000", "10", null);
		rascunho.selectDraft();		

	}

	@Then("Apos a PROMOCAO feita e aprovada quero fechar o BackOficce")
	public void apos_a_promocao_feita_e_aprovada_quero_fechar_o_back_oficce() {

		// validar.validarUser();
	}
}