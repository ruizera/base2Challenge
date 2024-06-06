package driverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverManager {
	private static WebDriver driver;
	private static DriverType driverType;
	private static final String CHROME_DRIVER_PROPERTY = "webdriver.chrome.driver";
	private static final String IE_DRIVER_PROPERTY = "webdriver.ie.driver";
	private static final String FIREFOX_DRIVER_PROPERTY = "webdriver.gecko.driver";

	public DriverManager() {
		driverType = FileReaderManager.getInstance().getConfigReader().getBrowser();
	}

	public WebDriver getDriver() {
		if (driver == null)
			driver = createDriver();
		return driver;
	}
	
	public void resetDriver() {
		if (driver != null) {
			driver.quit();
			driver = null;
		}
	}

	private WebDriver createDriver() {
		switch (driverType) {
		case FIREFOX:
			System.setProperty(FIREFOX_DRIVER_PROPERTY,
					FileReaderManager.getInstance().getConfigReader().getProperty("driverPath"));
			driver = new FirefoxDriver();
			break;
		case CHROME:
			System.setProperty(CHROME_DRIVER_PROPERTY,
					FileReaderManager.getInstance().getConfigReader().getProperty("driverPath"));
			driver = new ChromeDriver();
			break;
		case IE:
			System.setProperty(IE_DRIVER_PROPERTY, FileReaderManager.getInstance().getConfigReader().getProperty("driverPath"));
			driver = new InternetExplorerDriver();
			break;
		}

		driver.manage().window().maximize();
		return driver;
	}

	public void closeDriver() {
		driver.close();
		driver.quit();
	}

}