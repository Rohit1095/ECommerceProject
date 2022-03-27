package seleniumsessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandeling {
	
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
		Set<String>windows=driver.getWindowHandles();
		Iterator<String >itr= windows.iterator();
		
		String parentWindow=itr.next();
		String childWindow=itr.next();
		System.out.println("Parent window id is "+parentWindow);
		System.out.println("Child Window id is "+ childWindow);
		
		driver.switchTo().window(childWindow);
		System.out.println("child window title is "+driver.getTitle());
		System.out.println("child window url is "+driver.getCurrentUrl());
		driver.close();
		
		driver.switchTo().window(parentWindow);
		
		
		
		
		
		
		
	}

}
