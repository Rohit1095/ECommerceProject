package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserSwitchCase {
	
	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		String browser="chrome";
		switch (browser) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "D:\\lastest selenium sofwares\\chromedriver_win32/chromedriver.exe");
			driver= new ChromeDriver();
			break;
			
		case "firefox":
			System.setProperty("webdriver.gecko.driver", "D:\\lastest selenium sofwares\\geckodriver/geckodriver.exe");
			driver= new FirefoxDriver();
			break;

		default:
			
			System.out.println("please pass the valid browser");
			break;
		}
		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		System.out.println("title is  "+driver.getTitle());
		driver.close();
		
	}

}
