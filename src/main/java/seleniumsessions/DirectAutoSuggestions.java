package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DirectAutoSuggestions {

	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException  {
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("naveen automationlabs");
		Thread.sleep(2000);
		
	}
}
