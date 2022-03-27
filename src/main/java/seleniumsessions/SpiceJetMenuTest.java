package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SpiceJetMenuTest {

	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://www.scientecheasy.com/2020/01/move-element-in-selenium.html/");
		Thread.sleep(2000);
		WebElement Interview= driver.findElement(By.linkText("Interview"));
		Actions act= new Actions(driver);
		act.moveToElement(Interview).perform();
		Thread.sleep(2000);
		act.moveToElement(driver.findElement(By.linkText("Selenium"))).perform();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Java IQ")).click();
	}
}
