package seleniumsessions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LinkHrefDemo {

	public static WebDriver driver;

	public static void main(String[] args) {

		BrowserUtil br = new BrowserUtil();

		driver = br.initDriver("chrome");
		br.luanchURL("https://www.amazon.in/");
		By links = By.tagName("img");
		
		ElementUtil el= new ElementUtil(driver);
		el.getAttributeList(links, "src");
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

}
