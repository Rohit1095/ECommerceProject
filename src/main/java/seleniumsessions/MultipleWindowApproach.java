package seleniumsessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleWindowApproach {

	public static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
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
		
		Set<String>windows=driver.getWindowHandles();
		Iterator<String>itr=windows.iterator();
		String parent=itr.next();
		String child=itr.next();
		driver.switchTo().window(child);
		System.out.println("first window title "+driver.getTitle());
		driver.close();
		driver.switchTo().window(parent);
		
		String child2=itr.next();
		driver.switchTo().window(child2);
		System.out.println("Second window title "+driver.getTitle());
		driver.close();
		driver.switchTo().window(parent);
		String child3=itr.next();
		driver.switchTo().window(child3);
		System.out.println("Third window title "+driver.getTitle());
		driver.close();
		driver.switchTo().window(parent);
		String child4=itr.next();
		driver.switchTo().window(child4);
		System.out.println("Fourth window title "+driver.getTitle());
		driver.close();
		driver.switchTo().window(parent);
		
		
		
		
		
		
		
		
	}
	
}
