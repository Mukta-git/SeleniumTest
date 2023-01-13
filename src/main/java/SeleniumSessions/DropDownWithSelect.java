package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownWithSelect {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MuktaSeth\\Downloads\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.navigate().to("https://www.orangehrm.com/orangehrm-30-day-trial/?");
		Thread.sleep(3000);
		
//		WebElement country= driver.findElement(By.id("Form_getForm_Country"));
//		Select select= new Select(country);
//		select.selectByVisibleText("India");
//		//select.selectByValue("India");
//		//select.selectByIndex(5);
		
		By country= By.id("Form_getForm_Country");
		doSelectDropDownByIndex(country, 5);
		doSelectDropDownByValue(country, "India");
		doSelectDropDownByVisibleText(country,"Brazil");
	}

	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
		
	}
	
	public static void doSelectDropDownByIndex(By locator, int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}
	
	public static void doSelectDropDownByValue(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
	}
	
	public static void doSelectDropDownByVisibleText(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(value);
	}
}
