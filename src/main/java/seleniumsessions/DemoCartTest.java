package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DemoCartTest {

	public static void main(String[] args) {

		BrowserUtil br = new BrowserUtil();
		WebDriver driver = br.initDriver("firefox");
		br.luanchURL("https://demo.opencart.com/index.php?route=account/login");
		ElementUtil ele=new ElementUtil(driver);
		By register=By.linkText("Register");
		ele.doClick(register);
		
		
       By firstName=By.id("input-firstname");
       By lastName=By.id("input-lastname");
       By email=By.id("input-email");
       By telephone=By.name("telephone");
       By password=By.xpath("//input[@id='input-password']");
       By confirmPassword=By.xpath("//input[@name='confirm']");
       By continueBtn=By.xpath("//input[@type='submit']");
       
       ele.doSendKeys(firstName, "nametest");
       ele.doSendKeys(lastName, "testlast");
       ele.doSendKeys(email, "email@gmail.com");
       ele.doSendKeys(telephone, "0731123852147");
       ele.doSendKeys(password, "password123");
       ele.doSendKeys(confirmPassword, "confirmpassword");
       ele.doClick(continueBtn);
	
	
	}

}
