package Testes;

import ElementosPages.idLogin;
import ElementosPages.idPesquisa;
import coreMetodos.Metodos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Pesquisa {

	Metodos metodos = new Metodos();
	idLogin login = new idLogin();
	idPesquisa pesquisa = new idPesquisa();

	// ValidarUser validar = new ValidarUser();

	@Given("Esteja na tela de pesquisa")
	public void esteja_na_tela_de_pesquisa() {
		metodos.abrirNavegador("https://front-backoffice-stg-ioglxjjbfa-ue.a.run.app/login", "CHROME",
				"acessando site do loja");
	}

	@When("Quero pesquisar o cliente com todos os meios possivel")
	public void quero_pesquisar_o_cliente_com_todos_os_meios_possivel() {

		// Login no BackOffice
		login.login("robson@ideamaker.com.br","123456");
	
		// Pesquisar Cliente

	}

	@Then("Apos a pesquisa quero sair do app")
	public void apos_a_pesquisa_quero_sair_do_app() {
		// validar.validarUser();
		metodos.pausa(1000, "Esperar a visualizacao da tela pra fechar");
		metodos.fechar("Fechar o BackOffice");
		throw new io.cucumber.java.PendingException();
	}
}