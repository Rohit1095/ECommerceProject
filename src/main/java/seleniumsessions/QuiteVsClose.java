package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class QuiteVsClose {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\lastest selenium sofwares\\chromedriver_win32/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.google.com");
       // driver.close();  // will maintain the session id but the session id will become invalid
		driver.quit();  //after quite the session id will become null 
        System.out.println(driver.getTitle());
        Wait<WebDriver>wait= new FluentWait<WebDriver>(driver)
        		.withTimeout(Duration.ofSeconds(10))
        		.pollingEvery(Duration.ofMillis(2))
        		.ignoring(NoAlertPresentException.class);
      //  wait.until(isTrue)
        
	}
}
