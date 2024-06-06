package actions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import driverManager.ConfigFileReader;
import driverManager.DriverManager;
import pages.PageLogin;

public class ActionsLogin extends PageLogin {
	WebDriver driver = new DriverManager().getDriver();

	public void LogarAplicacao() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(txtUsername)).sendKeys(new ConfigFileReader().getProperty("username"));
		driver.findElement(btnEntrar).click();
		wait.until(ExpectedConditions.elementToBeClickable(txtSenha)).sendKeys(new ConfigFileReader().getProperty("senha"));
		driver.findElement(btnEntrar).click();
	}
}
