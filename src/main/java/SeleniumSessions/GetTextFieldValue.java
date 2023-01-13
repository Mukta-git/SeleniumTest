package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextFieldValue {

static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\MuktaSeth\\Downloads\\drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	
	driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	
	WebElement emailId= driver.findElement(By.id("input-email"));
	
			emailId.sendKeys("test@gmail.com");
			String val= emailId.getAttribute("value");
			System.out.println(val);
			
			WebElement pswd= driver.findElement(By.id("input-password"));	
			pswd.sendKeys("test@123");
			System.out.println(pswd.getAttribute("value"));

	}

}
