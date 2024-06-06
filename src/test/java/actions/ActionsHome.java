package actions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import driverManager.DriverManager;
import pages.PageHome;

public class ActionsHome extends PageHome {
	WebDriver driver = new DriverManager().getDriver();

	public void acessarCriarTarefa() {
		new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(btnCriarTarefa))
				.click();
	}
}
