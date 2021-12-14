package coreMetodos;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Metodos {

// criamos um objeto tipo WebDrive chamado driver; seria um ponteiro das classe WebDriver;	
	public static WebDriver driver;

	/**
	 * Metodo responsavel por abrir o navegador
	 * 
	 * @author Robson Founar
	 * @param site
	 * @param navegador
	 * @param descricao
	 */
	public void abrirNavegador(String site, String navegador, String descricao) {

		try {

			if (navegador == "CHROME") {
				// configurando o navegador
				System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver");
				// abrir o navegador
				driver = new ChromeDriver();
				// entrar em site
				driver.get(site);

				// maximizar o navegador dentro da classe abri navegador.
				driver.manage().window().maximize();

			} else if (navegador == "FIREFOX") {
				// configurando o navegador
				System.setProperty("WebDriver.gecko.driver", "./Drivers/geckodriver.exe");
				// abrir o navegador
				driver = new FirefoxDriver();
				// entrar em site
				driver.get(site);

				// maximizar o navegador dentro da classe abri navegador.
				driver.manage().window().maximize();

			} else
				System.out.println("Navegador Indisponivel digite CHROME ou FIREFOX");

		} catch (Exception e) {
			System.out.println("****** error ******* no passo " + descricao + "  " + e);

		}

	}

	/**
	 * UpLoad Arquivo
	 * 
	 * @author Robson Founar
	 * @param elemento
	 * @param descricao
	 */
	public void upload(By elemento, String caminho, String descricao) {
		try {
			WebElement chooseFile = driver.findElement(elemento);
			chooseFile.sendKeys(caminho);

		} catch (Exception e) {
			System.out.println("****** error ******* no passo " + descricao + "  " + e);
		}
	}

	/**
	 * Clicar no Elemento
	 * 
	 * @author Robson Founar
	 * @param elemento
	 * @param descricao
	 */
	public void clicar(By elemento, String descricao) {
		// Clicar no elemento do site para cadastro
		try {
			driver.findElement(elemento).click();
		} catch (Exception e) {
			System.out.println("****** error ******* no passo " + descricao + "  " + e);
		}
	}

	/**
	 * Escrever um Texto
	 * 
	 * @author Robson Founar
	 * @param elemento
	 * @param texto
	 * @param descricao
	 */
	public void escrever(By elemento, String texto, String descricao) {
		// Escrever no formulario os dados do cadastro
		try {
			driver.findElement(elemento).sendKeys(texto);
		} catch (Exception e) {
			System.out.println("****** error ******* no passo " + descricao + "  " + e);
		}
	}

	/**
	 * Pausa o Teste
	 * 
	 * @author Robson Founar
	 * @param tempo
	 * @param descricao
	 */
	public void pausa(int tempo, String descricao) {
		try {
			Thread.sleep(tempo);
		} catch (Exception e) {
			System.out.println("****** error ******* no passo " + descricao + "  " + e);
		}
	}

	/**
	 * Aguardar Elemento visivel ficar disponivel
	 * 
	 * @author Robson Founar
	 * @param elemento
	 * @param descricao
	 */
	public void esperar(By elemento, String descricao) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 15);
			WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(elemento));
		} catch (Exception e) {
			System.out.println("****** error ******* no passo " + descricao + "  " + e);
		}

	}

	/**
	 * Selecionar ComboBox
	 * 
	 * @author Robson Founar
	 * @param elemento
	 * @param descricao
	 */
	public void combo(By elemento, String text, String descricao) {
		try {
			driver.findElement(elemento).clear();
			driver.findElement(elemento).sendKeys(text);
			driver.findElement(elemento).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(elemento).sendKeys(Keys.ENTER);
		} catch (Exception e) {
			System.out.println("****** error ******* no passo " + descricao + "  " + e);
			
			/*OU
			combobox.selectByValue("150");*/
		}

	}

	/**
	 * Ecerrar teste com sucesso
	 * 
	 * @author Robson Founar
	 * @param elemento
	 * @param descricao
	 */
	public void fechar(String descricao) {

		try {
			driver.close();

		} catch (Exception e) {
			System.out.println("****** error ******* no passo " + descricao + "  " + e);
		}
	}

}
