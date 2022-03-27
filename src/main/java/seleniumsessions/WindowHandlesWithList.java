package seleniumsessions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandlesWithList {

	public static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.firefoxdriver().setup();
		driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		By linkedin=By.xpath("//img[@alt='LinkedIn OrangeHRM group']");
		By facebook= By.xpath("//img[@alt='OrangeHRM on Facebook']");
		By twitter=By.xpath("//img[@alt='OrangeHRM on twitter']");
		By youtube=By.xpath("//img[@alt='OrangeHRM on youtube']");
		
		driver.findElement(youtube).click();
		driver.findElement(twitter).click();
		driver.findElement(facebook).click();
		driver.findElement(linkedin).click();
		
		List<String>windows=new ArrayList<String>(driver.getWindowHandles());
		String Parent=windows.get(0);
		
		Iterator<String> itr= windows.iterator();
		
		while(itr.hasNext())
		{
			String id=itr.next();
            if(!id.equals(Parent))
            {
    			driver.switchTo().window(id);
    			System.out.println("title is "+driver.getTitle());
    			driver.close();
            }
			
		}
		
		
		
		
		
	}
}
