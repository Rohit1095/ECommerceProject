package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ECommerceSuggestion2 {
	
	public static WebDriver driver;
	
	public static void main(String[] args) throws Exception{
	
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		Thread.sleep(2000);
		driver.findElement(By.id("search_query_top")).sendKeys("Dress");
		Thread.sleep(2000);
         driver.findElement(By.xpath("//div[@class='ac_results']//li[text()='T-shirts > Faded Short Sleeve T-shirts']")).click();
	}

}
