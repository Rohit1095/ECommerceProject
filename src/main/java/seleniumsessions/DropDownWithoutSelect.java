package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DropDownWithoutSelect {
	
	public static WebDriver driver;
	public static void main(String[] args) {
		
		BrowserUtil br= new BrowserUtil();
		driver=br.initDriver("chrome");
		br.luanchURL("https://demo.guru99.com/test/newtours/reservation.php");
//		List<WebElement>list=driver.findElements(By.xpath("//select[@name='fromPort']/option"));
//		for(WebElement e: list)
//		{
//			if(e.getText().equals("Seattle"))
//			{
//				e.click();
//				break;
//			}
//		}
//		
//		
	
		By locator=By.name("passCount");
		ElementUtil el= new ElementUtil(driver);
		el.doSelectValues(locator, "2");
		
	}

}
