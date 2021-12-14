package ElementosPages;

import org.openqa.selenium.By;

import coreMetodos.Metodos;

public class idRascunho extends Metodos {

	Metodos metodos = new Metodos();

	// Menu Rascunho
	
	By draftButton = By.xpath("/html/body/div/div[1]/div/div/div[15]");

	// Selecionar a Praça
	By selectProduct = By.xpath("/html/body/div/div[1]/header/div/span[1]/button/span[1]");

	// Produtos Praças
	By selectMegaMania = By.xpath("/html/body/div[2]/div[3]/ul/div[15]");
	By selectVidaCap = By.cssSelector(
			"body > div.MuiDrawer-root.MuiDrawer-modal > div.MuiPaper-root.MuiDrawer-paper.MuiDrawer-paperAnchorRight.MuiPaper-elevation16 > ul > div:nth-child(35)");
	By selectSabadao = By.cssSelector(
			"body > div.MuiDrawer-root.MuiDrawer-modal > div.MuiPaper-root.MuiDrawer-paper.MuiDrawer-paperAnchorRight.MuiPaper-elevation16 > ul > div:nth-child(22)");

	// Area do Draft Adicionar nova PROMO
	By buttonAdd = By.xpath("/html/body/div/div[1]/main/div[1]/div[2]/button");

	// Tela de Cadastro dos dados da PROMOÇAO
	By addDataRefe = By.id("data.promotion.dataReferencia");
	By titlePromotion = By.id("data.promotion.tituloPromocao");
	By hoursPromotion = By.id("data.promotion.horarioSorteio");
	By category = By.id("data.promotion.categoria");
	By startPromotion = By.id("data.promotion.dataVigenciaInicio");
	By endPromotion = By.id("data.promotion.dataVigenciaFim");
	By extractionNumber = By.id("data.promotion.extracao");
	By titleValue = By.id("data.promotion.valorProduto");
	By institution = By.id("mui-28592");
	By susep = By.xpath(
			"/html/body/div/div[1]/main/div[2]/div[2]/div/div[2]/div/div/div/form/div[2]/div[8]/div[1]/div/div/input");
	By serialNumber = By.id("data.promotion.numeroSerie");

	// Tela de Upload de PDF
	By pdfUpload = By.name("regulamento");
	By sendPdf = By
			.xpath("/html/body/div/div[1]/main/div[2]/div[2]/div/div[2]/form/div/div/div/div[1]/div/div[2]/button");

	// Tela de Banner e Capa
	By bannerUpload = By.xpath("/html/body/div/div[1]/main/div[2]/div[2]/div/div[2]/div[1]/div[1]/section/div/input");
	By sendBanner = By.xpath("/html/body/div/div[1]/main/div[2]/div[2]/div/div[2]/div[1]/div[1]/button");
	By capaUpload = By.xpath("/html/body/div/div[1]/main/div[2]/div[2]/div/div[2]/div[2]/div[1]/section/div/input");
	By sendCapa = By.xpath("/html/body/div/div[1]/main/div[2]/div[2]/div/div[2]/div[2]/div[1]/button");

	// Tela de seleção de Premiação
	By choosePromo = By.xpath(
			"/html/body/div/div[1]/main/div[2]/div[2]/div/div[2]/div/div/div/div[2]/div/div/div/div[1]/div/div/div/input");
	By insertPromo = By
			.xpath("/html/body/div/div[1]/main/div[2]/div[2]/div/div[2]/div/div/div/div[2]/div/div/div/div[3]/button");

	// Tela de aprovação de Promoção
	By sendToAprove = By.xpath("/html/body/div/div[1]/main/div[2]/div[2]/div/div[1]/div[2]/button");
	By confirmPromo = By.xpath("/html/body/div/div[1]/main/div[2]/div[2]/div/div[1]/div[2]/button");

	// Botão de Confirmarção em POPUP
	By yesSend = By.xpath("/html/body/div[2]/div[3]/div/div[3]/button[2]");

	// Botão Next (usado na classe inteira)
	By buttonNext = By.xpath("/html/body/div/div[1]/main/div[2]/div[2]/div/div[1]/div[2]/button");

	// Botão Save
	By buttonSave = By
			.xpath("/html/body/div/div[1]/main/div[2]/div[2]/div/div[2]/div/div/div/form/div[3]/div[2]/button");

	// ---------------------------------------------------------------------------------------------------------

	
	// Clicar no Menu Draft (Rascunhos)
	public void menuDraft() {
		metodos.pausa(900, "Espera do botão rascunho");
		metodos.clicar(this.draftButton, "Clicar no botão Rascunho");
	}

	// Clicar na Praça que deseja independente do Menu
	public void selectMegaMania() {
		metodos.pausa(900, "Esperar até ficar visivel o Elemento Selecionar Produto");
		metodos.clicar(this.selectProduct, "Clicar na Aba para abrir os produtos");
		metodos.pausa(900, "Esperar até ficar visivel o Elemento Selecionar Produto");
		metodos.clicar(this.selectMegaMania, "Clicar na aba Megamania");
	}

	// Area do Draft Escrita
	public void writeDraft(String dataReferencia, String tituloPromocao, String horarioSorteio, String inicioVigencia,
			String fimVigencia, String valorTitulo, String numeroSerio) {

		metodos.clicar(this.buttonAdd, "Adicionar uma nova Promocao");
		metodos.pausa(900, "Esperar até ficar visivel o Elemento Rascunho");
		metodos.escrever(this.addDataRefe, dataReferencia, "Data Referencia");
		metodos.escrever(this.titlePromotion, tituloPromocao, "Titulo da Promocao");
		metodos.escrever(this.hoursPromotion, horarioSorteio, "Horario do Sorteio");
		// metodos.escrever(this.startPromotion, inicioVigencia, "Inicio da Vigencia");
		// metodos.escrever(this.endPromotion, fimVigencia, "Fim da Vigencia");
		metodos.escrever(this.titleValue, valorTitulo, "Valor do Titulo");
	}

	// Area do Draft que é seleção
	public void selectDraft() throws Exception {
		// metodos.pausa(900, "Esperar até ficar visivel o Elemento Rascunho");
		// metodos.clicar(this.selectInstitution, "Abrir aba da Instituicoes");

		metodos.pausa(900, "Esperar até ficar visivel o Elemento Rascunho");
		metodos.combo(this.susep, "15414.607353/2021-83", "Selecionar a Suspe");
		metodos.clicar(this.buttonSave, "Botao Salvar");

		metodos.pausa(900, "Esperar até ficar viseivel o Elemento Rascunho");
		metodos.clicar(this.buttonNext, "Botao Proximo");

		metodos.pausa(900, "Esperar até ficar visivel o Elemento PDF Upload");
		metodos.upload(this.pdfUpload, "//Users//robsonfounar//Documents//TASKQA//lorem.pdf", "FAZER Upload PDF");
		metodos.clicar(this.sendPdf, "Click no Enviar PDF");
		metodos.clicar(this.buttonNext, "Next");

		metodos.pausa(900, "Esperar até ficar visivel o Elemento BANNER Upload");
		metodos.upload(this.bannerUpload, "//Users//robsonfounar//Documents//TASKQA//editarfoto.jpeg",
				"Upload de Banner");
		// metodos.pausa(900, "Esperar até ficar visivel o Elemento CAPA Upload");
		metodos.upload(this.capaUpload, "//Users//robsonfounar//Documents//TASKQA//editarfoto.jpeg",
				"Upload de Banner");
		metodos.pausa(900, "Esperar até ficar subir o Banner e Capa para enviar");
		metodos.clicar(this.sendCapa, "Clicar par enviar CAPA");
		metodos.pausa(900, "Esperar até ficar subir o Banner e Capa para enviar");
		metodos.clicar(this.sendBanner, "Clicar par enviar BANNER");
		metodos.clicar(this.buttonNext, "NEXT");

		metodos.pausa(900, "Esperar até ficar visivel o Elemento Escolher PROMO");
		metodos.combo(this.choosePromo, "500 MIL REAIS - Valor líquido", "Escolher a Promoção");
		metodos.clicar(this.insertPromo, "Botão clicar inserir PROMO");
		metodos.pausa(900, "Esperar até ficar visivel o Elemento NEXT");
		metodos.clicar(this.buttonNext, "Next");
		metodos.clicar(this.buttonNext, "Next");

		metodos.pausa(900, "Esperar até ficar visivel o Elemento Enviar para Aprovacao");
		metodos.clicar(this.sendToAprove, "Enviar para Aprovação");
		metodos.clicar(this.yesSend, "Clicar em SIM");

		metodos.pausa(900, "Esperar até ficar visivel o Elemento para Aprovacao");
		metodos.clicar(this.confirmPromo, "Confirmar Promocao");
		metodos.clicar(this.yesSend, "Clicar em SIM");

	}
}
