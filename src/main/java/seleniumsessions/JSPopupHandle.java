package seleniumsessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JSPopupHandle {

	public static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://mypage.rediff.com/login/dologin");
		By click_btn=By.xpath("//input[@type='submit']");
		
		driver.findElement(click_btn).click();
		Alert alert=driver.switchTo().alert();
		alert.accept();
	}
}
