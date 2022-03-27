package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ECommerceSuggestion1 {

	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		driver.findElement(By.id("search_query_top")).sendKeys("Dress");
		Thread.sleep(2000);
		List<WebElement> list=driver.findElements(By.xpath("//div[@class='ac_results']//li"));
		for(WebElement e: list)
		{
			String text=e.getText();
			if(text.equals("Blouses > Blouse"))
			{
				e.click();
				System.out.println(driver.getTitle());
              By price=By.xpath("//span[@id='our_price_display']");
              String  priceValue=driver.findElement(price).getText();
              
              if(priceValue.equals("$27.20"))
              {
            	  System.out.println("test case pass with value"+priceValue);
              }
              else
            	  System.out.println("test case failed");
			}
		}
		
	}
}
