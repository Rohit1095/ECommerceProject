package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JQueryDropDownHandle {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

//		WebDriverManager.firefoxdriver().setup();
//		driver = new FirefoxDriver();
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		Thread.sleep(2000);
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@id='justAnInputBox']")).click();
		Thread.sleep(2000);
		By choices = By.cssSelector(".comboTreeItemTitle");

		// doSelectFromDropDown(choices, "choice 1", "choice 6 2 1", "choice 7");
		// doSelectFromDropDown(choices, "choice 1");
		//doSelectFromDropDown(choices, "all");
	}


}
