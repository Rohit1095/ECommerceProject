package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveToElementDemo {
	
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://mrbool.com/");
		Actions act= new Actions(driver);
		act.moveToElement(driver.findElement(By.className("menulink"))).perform();   
		 Thread.sleep(2000);
	
		driver.findElement(By.linkText("Articles")).click();
	}

}
