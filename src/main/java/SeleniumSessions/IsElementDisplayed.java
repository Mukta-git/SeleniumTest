package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsElementDisplayed {


	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MuktaSeth\\Downloads\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.navigate().to("https://naveenautomationlabs.com/opencart/");
		
		By search= By.name("search");
		By logo= By.className("img-responsive");
		
//		boolean flag=driver.findElement(By.name("search")).isDisplayed();
//		
//		if(flag) { System.out.println("Element is displayed");}
//
//	
//	else {
//		System.out.println("Element is not displayed");
//	}
		if(doIsDisplayed(search)) {System.out.println("PASS");}
		if(doIsDisplayed(logo)) {System.out.println("PASS");}
		
//		int count= driver.findElements(search).size();
//		if(count==1) { System.out.println("Element is displayed");}
		

}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	public static boolean doIsDisplayed(By locator) {
		return getElement(locator).isDisplayed();
	}
	
	public static boolean isSingleElementExist(By locator) {
		int count=getElements(locator).size();
		if(count==1) {
			return true;
		}
		else return false;
	}
	
	public static boolean isMultipleElementExist(By locator) {
		int count=getElements(locator).size();
		if(count>1) {
			return true;
		}
		else return false;
	}
	
	public static boolean isMultipleElementExist(By locator, int expcount) {
		int count=getElements(locator).size();
		if(count==expcount) {
			return true;
		}
		else return false;
	}
	
	public static boolean isTwoElementExist(By locator) {
		int count=getElements(locator).size();
		if(count==2) {
			return true;
		}
		else return false;
	}
}