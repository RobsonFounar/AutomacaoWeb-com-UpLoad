package ElementosPages;

import org.openqa.selenium.By;

import coreMetodos.Metodos;

public class idLogin extends Metodos {

	Metodos metodos = new Metodos();

	// Login na Pagina Backoffice
	By loginEmail = By.id("email");
	By loginPassword = By.id("password");
	By loginButton = By.cssSelector(
			"#root > main > div.MuiPaper-root.MuiGrid-root.MuiGrid-item.MuiGrid-grid-xs-12.MuiGrid-grid-sm-8.MuiGrid-grid-md-5.MuiPaper-elevation6 > div > form > button");

	// ---------------------------------------------------------------------------------------------------------

	// By userName = By.name("usernameRegisterPage");

	public void login(String loginName, String loginPassword) {
		metodos.escrever(this.loginEmail, loginName, "Login da Pagina");
		metodos.escrever(this.loginPassword, loginPassword, "Password da pagina de login");
		metodos.clicar(this.loginButton, "Botão de Login");
	}	
}