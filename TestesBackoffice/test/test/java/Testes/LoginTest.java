package Testes;

import org.junit.Test;

public class LoginTest {

	@Test
	public void esteja_na_tela_de_login() {
		metodos.abrirNavegador("https://front-backoffice-stg-ioglxjjbfa-ue.a.run.app/login", "CHROME",
				"acessando site do loja");

	}

	@Test
	public void fazer_o_login_com_os_dados_corretos() {

		//metodos.pausa(900, "Esperar parar aparecer o Login");
		login.login("robson@ideamaker.com.br", "123456");

	}

	@Test
	public void concluir_e_sair_da_tela_de_back_office() {
		
		metodos.pausa(2000, null);
		metodos.fechar("fechar o Browser");
		throw new io.cucumber.java.PendingException();

	}

}
