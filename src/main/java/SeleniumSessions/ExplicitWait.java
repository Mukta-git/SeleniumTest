package SeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	static WebDriver driver;

	public static void main(String[] args) {
		// Explicit wait- not a global wait and can be used for specific elements and can be applied across non web elements too
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MuktaSeth\\Downloads\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		

		//By.linkText("MacBook");
		By emailId= By.id("input-email");
		By pswd= By.id("input-password");
		By loginbtn= By.xpath("//input[@value='Login']");
		waitForElementPresence(emailId, 10).sendKeys("test@gmail.com");
		getElement(pswd).sendKeys("test@123");
		getElement(loginbtn).click();
	
	}

	
	
	public static WebElement waitForElementPresence(By locator, int timeout) {
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	public static WebElement waitForElementVisible(By locator, int timeout) {
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
}
