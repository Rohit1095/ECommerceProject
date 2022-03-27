package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveToElement {

	public static WebDriver driver;
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		By rightClick= By.xpath("//span[text()='right click me']");
		doRightClick(rightClick);
//		List<WebElement> ele=driver.findElements(By.xpath("//ul[@class='context-menu-list context-menu-root']//span"));
//		for(WebElement e: ele)
//		{
//			if(e.getText().equals("Edit"))
//			{
//				e.click();
//				break;
//			}
//		}
	}
	
	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}
	public static void doRightClick(By locator)
	{
		Actions act= new Actions(driver);
		act.contextClick(getElement(locator)).perform();
	}
}
