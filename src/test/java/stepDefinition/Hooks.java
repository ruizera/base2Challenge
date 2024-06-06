package stepDefinition;

import org.openqa.selenium.WebDriver;

import driverManager.ConfigFileReader;
import driverManager.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.DataTableType;

public class Hooks {
	DriverManager driverManager = new DriverManager();
	WebDriver driver = driverManager.getDriver();

	@DataTableType(replaceWithEmptyString = "[blank]")
	public String stringType(String cell) {
		return cell;
	}

	@Before
	public void setUp() {
		driver.get(new ConfigFileReader().getProperty("url"));
	}
	
	@After
	public void tearDown() {
		driverManager.resetDriver();
	}
}
