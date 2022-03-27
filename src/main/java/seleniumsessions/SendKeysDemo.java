package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SendKeysDemo {

	public static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	    driver.get("https://demo.opencart.com/index.php?route=account/login");
	    WebElement email=driver.findElement(By.id("input-email"));
	    WebElement password=driver.findElement(By.id("input-password"));
	    Actions act= new Actions(driver);
	    act.sendKeys(email, "email").perform();
	    act.sendKeys(password, "test@123").perform();
	    WebElement button=driver.findElement(By.xpath("//input[@type='submit']"));
	    act.click(button).perform();
	}
}
