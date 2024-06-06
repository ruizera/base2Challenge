package actions;

import java.time.Duration;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import driverManager.DriverManager;
import pages.PageCriarTarefa;

public class ActionsCriarTarefa extends PageCriarTarefa {
	WebDriver driver = new DriverManager().getDriver();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	String caminhoImagem = System.getProperty("user.dir") + "/src/test/resources/imagens/";

	public void preencherFormulario(Map<String, String> map) {
		Select selectCategoria = new Select(wait.until(ExpectedConditions.elementToBeClickable(cbxCategoria)));
		Select selectFrequencia = new Select(driver.findElement(cbxFrequencia));
		Select selectGravidade = new Select(driver.findElement(cbxGravidade));
		Select selectPrioridade = new Select(driver.findElement(cbxPrioridade));

		selectCategoria.selectByVisibleText(map.get("categoria"));
		selectFrequencia.selectByVisibleText(map.get("frequencia"));
		selectGravidade.selectByVisibleText(map.get("gravidade"));
		selectPrioridade.selectByVisibleText(map.get("prioridade"));

		String styleDivFechada = driver.findElement(divPerfilFechado).getAttribute("style");
		if (styleDivFechada.equals("display: block;") || styleDivFechada.equals("")) {
			wait.until(ExpectedConditions.elementToBeClickable(btnExpandirPerfil)).click();
		}

		driver.findElement(txtPlataforma).sendKeys(map.get("plataforma"));
		driver.findElement(txtSo).sendKeys(map.get("so"));
		driver.findElement(txtVersaoSo).sendKeys(map.get("versao so"));
		driver.findElement(txtResumo).sendKeys(map.get("resumo"));
		driver.findElement(txtDescricao).sendKeys(map.get("descricao"));
		driver.findElement(txtPassos).sendKeys(map.get("passos"));
		driver.findElement(txtInformacoes).sendKeys(map.get("informacoes"));
		driver.findElement(txtMarcadores).sendKeys(map.get("marcadores"));

		driver.findElement(radVisibilidade(map.get("visibilidade"))).click();

		if (!map.get("arquivos").isBlank()) {
			driver.findElement(inpImagem).sendKeys(caminhoImagem + map.get("arquivos"));
		}
		driver.findElement(btnCriarTarefa).click();
	}

	public boolean validarCriacaoTarefa() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(lblConfirmacao));
		return driver.findElement(lblConfirmacao).isDisplayed();
	}

	public boolean validarErroTarefa() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(lblCampoNecessario));
		return driver.findElement(lblCampoNecessario).isDisplayed();
	}
}
