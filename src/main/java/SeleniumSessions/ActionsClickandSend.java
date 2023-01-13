package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClickandSend {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\MuktaSeth\\Downloads\\drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	
	driver.navigate().to("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	
	By emailId= By.id("input-email");
	By pswd= By.id("input-password");
	
	By loginBtn=By.xpath("//input[@value='Login']");
	
	
//	Actions Act=new Actions(driver);
//	Act.sendKeys(driver.findElement(emailId), "test@gmail.com").build().perform();;
//	Act.sendKeys(driver.findElement(pswd), "test@123").build().perform();;
//	Act.click(driver.findElement(loginBtn)).build().perform();
	doActionSendKeys(emailId, "test@gmail.com");
	doActionSendKeys(pswd, "test@123");
	
	doActionClick(loginBtn);
	
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doActionSendKeys(By locator, String value) {
		Actions Act=new Actions(driver);
		Act.sendKeys(getElement(locator),value ).build().perform();
	}
	
	public static void doActionClick(By locator) {
		Actions Act=new Actions(driver);
		Act.click(getElement(locator)).click().build().perform();
		
	}

}
