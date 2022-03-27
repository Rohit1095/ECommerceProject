package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownOptionsWithSelect {
	
	public static WebDriver driver;
	public static void main(String[] args) {
		BrowserUtil br= new BrowserUtil();
		driver=br.initDriver("chrome");
		br.luanchURL("https://demo.guru99.com/test/newtours/reservation.php");

		By airline=By.name("airline");
		By destination=By.name("toPort");
		
		
		
		ElementUtil el= new ElementUtil(driver);
		//el.printDropDownOptions(dropdown);
		el.doSelectValueFromDropDown(destination, "New York");
		el.doSelectValueFromDropDown(airline, "Unified Airlines");
//		WebElement element=driver.findElement(By.name("airline"));
//		Select select= new Select(element);
//		List<WebElement> selectOptions=select.getOptions();
////		for(WebElement e: selectOptions)
////		{
////			System.out.println(e.getText());
////		}
//		
////		for(int i=0;i<selectOptions.size();i++)
////		{
////			System.out.println(selectOptions.get(i).getText());
////		}
//		
//		selectOptions.stream().forEach(e->System.out.println(e.getText()));
		
	}
	
	

}
