package Testes;

import ElementosPages.idLogin;
import coreMetodos.Metodos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {

	Metodos metodos = new Metodos();
	idLogin login = new idLogin();

	// ValidarUser validar = new ValidarUser();

	@Given("esteja na tela de login")
	public void esteja_na_tela_de_login() {
		metodos.abrirNavegador("https://front-backoffice-stg-ioglxjjbfa-ue.a.run.app/login", "CHROME",
				"acessando site do loja");

	}

	@When("Fazer o login com os dados corretos")
	public void fazer_o_login_com_os_dados_corretos() {

		//metodos.pausa(900, "Esperar parar aparecer o Login");
		login.login("robson@ideamaker.com.br", "123456");

	}

	@Then("Concluir e sair da tela de BackOffice")
	public void concluir_e_sair_da_tela_de_back_office() {
		
		metodos.pausa(2000, null);
		metodos.fechar("fechar o Browser");
		throw new io.cucumber.java.PendingException();
	}
}