package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserIfElse {

	public static WebDriver driver;
	public static void main(String[] args) {
		
		
		String browser="firefox";
		
		if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\lastest selenium sofwares\\chromedriver_win32/chromedriver.exe");
			driver= new ChromeDriver();
		}
		
		else if(browser.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "D:\\lastest selenium sofwares\\geckodriver/geckodriver.exe");
			driver= new FirefoxDriver();
		}
		
		else {
			System.out.println("this application only supprot chrome and firefox browser");
		}
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		
		
	}
}
