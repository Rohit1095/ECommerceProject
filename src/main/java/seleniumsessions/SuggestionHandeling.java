package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SuggestionHandeling {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("http://automationpractice.com/index.php");
		By searchField = By.name("search_query");
		selectFromSuggestion(searchField, "Flip", "Flipakar app");

	}

	public static void selectFromSuggestion(By locator, String textToBeSearched, String choice)
			throws InterruptedException {
		driver.findElement(locator).sendKeys(textToBeSearched);
		Thread.sleep(2000);
		List<WebElement> suggestionList = driver
				.findElements(By.xpath("//ul[@jsname='bw4e9b']//li//div[@class='wM6W7d']/span"));

		for (WebElement e : suggestionList) {
			String text = e.getText();
			if (text.equals(choice)) {
				e.click();
				System.out.println(driver.getTitle());
				break;
			}
		}

	}

}
