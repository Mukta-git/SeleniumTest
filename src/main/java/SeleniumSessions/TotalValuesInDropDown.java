package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TotalValuesInDropDown {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MuktaSeth\\Downloads\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.navigate().to("https://www.orangehrm.com/orangehrm-30-day-trial/?");
		Thread.sleep(3000);
		
		By locator= By.xpath("//select[@id='Form_getForm_Country']/option");
		
		//doSelectDropDownValue(country, "Brazil");
		doClickOnElement(locator, "Brazil");
		

	}
	//https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
		
	}
	public static void doSelectDropDownValue(By locator, String value) {
		
		
		Select select= new Select(getElement(locator));
		
		List<WebElement> optionList=select.getOptions();
		System.out.println(optionList.size());
		
		for(WebElement e: optionList) {
			String text=e.getText();
			System.out.println(text);
			if(text.equals(value)) {
				e.click();
				break;
			}
		}
	}
	
	public static void doClickOnElement(By locator, String linkText) {
		List<WebElement> linksList = driver.findElements(locator);
		System.out.println("total links : " + linksList.size());

		for (WebElement e : linksList) {
			String text = e.getText();
			System.out.println(text);
			if (text.contains(linkText)) {
				e.click();
				break;
			}
		}
	}

}
