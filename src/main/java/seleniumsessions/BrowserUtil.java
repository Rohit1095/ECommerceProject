package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtil {

	public static WebDriver driver;

	/**
	 * this method will initialize the browser based on the browser name passed from
	 * the program
	 * 
	 */
	public WebDriver initDriver(String browserName) {
		System.out.println("Browser name is " + browserName);

		switch (browserName) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;

		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;

		default:
			System.out.println("please pass a valid browser");
			break;
		}

		return driver;
	}
	
	public void maximizeWindow() {
		driver.manage().window().maximize();
	}

	public void luanchURL(String url) {

		if (url.isEmpty())
			return;
		if (url == null)
			return;

		driver.get(url);
	}

	public String getPageTitle() {
		return driver.getTitle();
	}

	public String pageURL() {
		return driver.getCurrentUrl();
	}

		public void closeBrowser() {
		driver.close();
	}

	public void quiteBrowser() {
		driver.quit();
	}

}
