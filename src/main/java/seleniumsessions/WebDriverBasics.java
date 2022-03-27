package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		
//	System.setProperty("webdriver.chrome.driver", "D:\\lastest selenium sofwares\\chromedriver_win32/chromedriver.exe");
//	WebDriver driver= new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("https://google.com");

		
	System.setProperty("webdriver.gecko.driver", "D:\\lastest selenium sofwares\\geckodriver/geckodriver.exe");
	WebDriver driver= new FirefoxDriver();
	
	driver.get("https://www.crickbuzz.com");
	}
}
