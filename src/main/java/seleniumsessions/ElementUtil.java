package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementUtil {

	private WebDriver driver;

	public ElementUtil(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	/**
	 * 
	 * this method will take the By locator and will return the list of elements
	 * 
	 * @param locator
	 */
	public List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	/**
	 * this method will take the list of WebElement and will return the text of
	 * element list
	 */
	public List<String> getElementsTextList(By locator) {
		List<WebElement> elementList = getElements(locator);
		List<String> linksText = new ArrayList<String>();
		for (WebElement e : elementList)

		{
			String text = e.getText();
			if (!text.isEmpty()) {
				linksText.add(text);
			}
		}

		return linksText;
	}

	public void printElementText(By locator) {
		getElementsTextList(locator).stream().forEach(e -> System.out.println(e));
	}

	public void getAttributeList(By locator, String attributeName) {
		List<WebElement> attributeList = getElements(locator);
		for (int i = 0; i < attributeList.size(); i++) {
			String attributeValue = attributeList.get(i).getAttribute(attributeName);
			System.out.println(attributeValue);
		}
	}

	public void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}

	public void doClick(By locator) {
		getElement(locator).click();
	}

	public String doGetText(By locator) {
		return getElement(locator).getText();
	}

//	-----------------------drop down related utilities---------------------------------------------------------

	public WebElement getWebElement(By locator) {
		return driver.findElement(locator);
	}

	public void doSelectDropDownByIndex(By locator, int index) {

		Select selectOption = new Select(getWebElement(locator));
		selectOption.selectByIndex(index);
	}

	public void doSelectDropDownByVisibleText(By locator, String text) {

		Select selectOption = new Select(getWebElement(locator));
		selectOption.selectByVisibleText(text);
	}

	public void doSelectDropDownByValue(By locator, String value) {

		Select selectOption = new Select(getWebElement(locator));
		selectOption.selectByValue(value);
	}

	public void printDropDownOptions(By locator) {
		getElementsTextList(locator).stream().forEach(e -> System.out.println(e));
	}

	public List<String> getDropDownOptions(By locator) {
		Select select = new Select(getElement(locator));
		List<WebElement> OptionsList = select.getOptions();
		List<String> OptionsTextList = new ArrayList<String>();

		for (WebElement e : OptionsList) {
			OptionsTextList.add(e.getText());
		}
		return OptionsTextList;
	}

	public void doSelectValueFromDropDown(By locator, String value) {
		Select select = new Select(getElement(locator));
		List<WebElement> optionsList = select.getOptions();
		for (WebElement e : optionsList) {
			if (e.getText().equals(value)) {
				e.click();
				break;
			}
		}
	}

	/**
	 * this method will be use to select the value from a drop down where the Select
	 * class is not available
	 */
	public void doSelectValues(By locator, String value) {
		List<WebElement> optionsList = getElements(locator);
		for (WebElement e : optionsList) {
			if (e.getText().equals(value)) {
				e.click();
				break;
			}
		}
	}

	/**
	 * this method will be used to single selection, multiple select or all the
	 * selection from drop down using jquery based drop down where Select class is
	 * not available
	 * 
	 * @param locator
	 * @param value
	 */
	public void selectChoice(By locator, String... value) {
		List<WebElement> choiceList = driver.findElements(locator);

		if (!value[0].equals("all")) {
			for (int i = 0; i < choiceList.size(); i++) {
				String text = choiceList.get(i).getText();
				for (int j = 0; j < value.length; j++) {
					if (text.equals(value[j])) {
						choiceList.get(i).click();
						break;
					}
				}
			}
		} else
			try {
				for (WebElement e : choiceList) {
					e.click();
				}
			} catch (Exception e) {

			}

	}

	/*
	 * move to element related utilities
	 * 
	 */
	public void doRightClick(By locator) {
		Actions act = new Actions(driver);
		act.contextClick(getElement(locator)).perform();
	}

	/****************************************
	 * wait utilities
	 *************************************************/
	/**
	 * @author Rohit This utility will be taking the WebElement as input and will
	 *         apply the WebDriverWait when the element is present using element
	 *         located by the specific strategy this will also take the time unit
	 *         till which the wait should be applied
	 */
	public WebElement waitForPresenceOfElementLocated(By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}

	/**
	 * using the interval time or polling time in the above method
	 */

	public WebElement waitForPresenceOfElementLocated(By locator, int timeout, int intervalTime) {
		WebDriverWait wait = new WebDriverWait(driver, timeout, intervalTime);
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}

	/**
	 * An expectation for checking that an element is present on the DOM of a page
	 * and visible.Visibility means that the element is not only displayed but also
	 * has a height and width that isgreater than 0.
	 * 
	 * @param locator
	 * @param timeout
	 * @return
	 */
	public WebElement waitForVisibilityOfElement(By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

	public List<WebElement> waitForVisibilityOfElements(By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
	}
	
	public void printElementsText(By locator, int timeout)
	{
         waitForVisibilityOfElements(locator, timeout).stream().forEach(e->System.out.println(e.getText()));
	}

	/**
	 * Alert utilities
	 * 
	 * @param timeout
	 * @return
	 */
	// alertIsPresent will switch to alert automatically
	public Alert waitForAlert(int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		return wait.until(ExpectedConditions.alertIsPresent());
	}

	public void acceptAlert(int timeout) {
		waitForAlert(timeout).accept();
	}

	public void dismissAlert(int timeout)

	{
		waitForAlert(timeout).dismiss();
	}

	public String getAlertText(int timeout) {
		return waitForAlert(timeout).getText();
	}

	/**
	 * URL utilities
	 * 
	 * @param timeout
	 */

	public boolean waitForURLContains(String urlFraction, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		return wait.until(ExpectedConditions.urlContains(urlFraction));
	}

	/**
	 * this method will match the URL exactly
	 * 
	 * @param timeout
	 * @param url
	 * @return
	 */
	public boolean waitForURLMatching(int timeout, String url) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		return wait.until(ExpectedConditions.urlToBe(url));
	}

	public boolean waitForURL(int timeout, String regularExpression) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		return wait.until(ExpectedConditions.urlMatches(regularExpression));
	}

	/**
	 * title waits
	 */

	// this method will match the exact title
	public boolean waitForTitleMatch(int timeout, String title) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		return wait.until(ExpectedConditions.titleIs(title));
	}

	public String getPageTitle(int timeout, String titleFraction) {
		waitForTitle(timeout, titleFraction);
		return driver.getTitle();
	}

	public boolean waitForTitle(int timeout, String titleFraction) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		return wait.until(ExpectedConditions.titleContains(titleFraction));
	}

	/**
	 * wait for frame
	 */

	public void waitForFrameAndSwitchToIt(String frameIdORName, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameIdORName));
	}

	public void waitForFrameAndSwitchToIt(int frameIndex, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameIndex));
	}

	public WebElement waitForElementToBeClickable(By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		return wait.until(ExpectedConditions.elementToBeClickable(locator));
	}

	public void clickWhenReady(By locator, int timeout) {
		waitForElementToBeClickable(locator, timeout).click();
	}
}
