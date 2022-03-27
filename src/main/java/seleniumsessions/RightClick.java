package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClick {
	public static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		WebElement ele=driver.findElement(By.xpath("//span[text()='right click me']"));
		
		Actions act= new Actions(driver);
		act.contextClick(ele).perform();
		List<WebElement>rightClick=driver.findElements(By.xpath("//ul[@class='context-menu-list context-menu-root']/li/span"));
		for(WebElement e: rightClick)
		{
			System.out.println(e.getText());
		}
	}

}
