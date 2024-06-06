package pages;

import org.openqa.selenium.By;

public class PageCriarTarefa {

	protected By cbxCategoria = By.id("category_id");
	protected By cbxFrequencia = By.id("reproducibility");
	protected By cbxGravidade = By.id("severity");
	protected By cbxPrioridade = By.id("priority");
	protected By btnExpandirPerfil = By.id("profile_closed_link");
	protected By divPerfilFechado = By.id("profile_closed");
	protected By txtPlataforma = By.id("platform");
	protected By txtSo = By.id("os");
	protected By txtVersaoSo = By.id("os_build");
	protected By txtResumo = By.id("summary");
	protected By txtDescricao = By.id("description");
	protected By txtPassos = By.id("steps_to_reproduce");
	protected By txtInformacoes = By.id("additional_info");
	protected By txtMarcadores = By.id("tag_string");
	//protected By divImagem = By.xpath("//*[contains(@class,'dropzone center')]");
	protected By inpImagem = By.className("dz-hidden-input");
	protected By lblConfirmacao = By.xpath("//*[text()='Operação realizada com sucesso.']");
	protected By btnCriarTarefa = By.xpath("//*[@value='Criar Nova Tarefa']");
	protected By lblCampoNecessario = By.xpath("//*[contains(text(),\"Um campo necessário 'category' estava vazio.\")]");
	
	protected By radVisibilidade(String visibilidade) {
		return By.xpath("//*[text()='" + visibilidade + "']");
	}

}