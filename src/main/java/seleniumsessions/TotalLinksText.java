package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TotalLinksText {

	public static WebDriver driver;

	public static void main(String[] args) {
		BrowserUtil br = new BrowserUtil();
		driver = br.initDriver("chrome");
		br.luanchURL("https://www.flipkart.com");
		By links= By.tagName("a");
		
		ElementUtil ele= new ElementUtil(driver);
		//List<String> text=ele.getElementsTextList(links);
//		for(String text1: text)
//		{
//			System.out.println(text1);
//		}
		
		ele.printElementText(links);

		br.closeBrowser();
	}


}
