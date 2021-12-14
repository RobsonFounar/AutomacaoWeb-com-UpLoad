package ElementosPages;

import org.openqa.selenium.By;

import coreMetodos.Metodos;

public class idPesquisa extends Metodos {

	Metodos metodos = new Metodos();

	// Login na Pagina Backoffice
	By loginEmail = By.id("email");
	By loginPassword = By.id("password");
	By loginButton = By.cssSelector(
			"#root > main > div.MuiPaper-root.MuiGrid-root.MuiGrid-item.MuiGrid-grid-xs-12.MuiGrid-grid-sm-8.MuiGrid-grid-md-5.MuiPaper-elevation6 > div > form > button");

	// Pesquisa na Barra de Pesquisa
	By search = By.id("search");
	By searchButton = By.cssSelector(
			"#root > div.sc-bdVaJa.bSXKeH > main > div > div > div:nth-child(1) > form > div > div > div > button");


	// ---------------------------------------------------------------------------------------------------------

	// By userName = By.name("usernameRegisterPage");

	public void login(String loginName, String loginPassword) {
		metodos.escrever(this.loginEmail, loginName, "Login da Pagina");
		metodos.escrever(this.loginPassword, loginPassword, "Password da pagina de login");
		metodos.clicar(this.loginButton, "Botão de Login");
	}

	// Pesquisa pelo NOME no campo procura.

	public void search(String search) {
		metodos.esperar(this.search, "Elemento Pesquisa");
		metodos.escrever(this.search, search, "Escrever na barra de pesquisa");
		// metodos.clicar(this.searchButton, "Botao pesquisar");
	}
}