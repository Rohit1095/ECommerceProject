package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectBasedDropDown {
	
	public static WebDriver driver;
	
	public static void main(String[] args) {
		BrowserUtil br= new BrowserUtil();
		driver= br.initDriver("chrome");
		br.maximizeWindow();
		br.luanchURL("https://demo.guru99.com/test/newtours/reservation.php");
//		
//		WebElement country=driver.findElement(By.xpath("//select[@id='Form_submitForm_Country']"));
//		Select selectCountry= new Select(country);
//		selectCountry.selectByVisibleText("Afghanistan");
//		//br.closeBrowser();
		
	    By countrySelection=By.id("Form_submitForm_Country");
	    //selectByIndex(countrySelection, 5);
	   // selectByValue(countrySelection, "Algeria");
	    
	    By passenger= By.xpath("//select[@name='passCount']");
	    By departingFrom=By.xpath("//select[@name='fromPort']");
	    ElementUtil el= new ElementUtil(driver);
//	    el.doSelectDropDownByVisibleText(passenger, "3");
//	    el.doSelectDropDownByVisibleText(departingFrom, "Paris");
	    
	    el.doSelectDropDownByIndex(passenger, 1);
	    el.doSelectDropDownByIndex(departingFrom, 2);
	    
	}
	
	

}
