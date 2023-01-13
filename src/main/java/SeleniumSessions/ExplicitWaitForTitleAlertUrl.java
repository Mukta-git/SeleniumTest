package SeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitForTitleAlertUrl {

	static WebDriver driver;

	public static void main(String[] args) {
		// Explicit wait- not a global wait and can be used for specific elements and can be applied across non web elements too
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MuktaSeth\\Downloads\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.ca");
		//driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		driver.findElement(By.linkText("Careers")).click();
		waitForUrlContains("jobs",10);
		waitForUrlIs("https://www.amazon.jobs/en/",10);
		
		waitForTitleContains("jobs",10);
		//System.out.println(driver.getTitle());
		//waitForTitleIs("Amazon.jobs: Help us build Earth’s most customer-centric company.",10);
		waitForTitleIsWithFW("Amazon.jobs: Help us build Earth’s most customer-centric company.",10,1);
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.urlContains("jobs"));
//		System.out.println(driver.getCurrentUrl());
		
		//String actTitle= waitForTitleContains("Account",5);
		//System.out.println(driver.getTitle());
//		
	//	driver.findElement(By.linkText("Login")).click();
	//	waitForTitleIs("Register Account",10);
		
	}
	public static String waitForUrlContains(String urlFractionValue, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		if(wait.until(ExpectedConditions.urlContains(urlFractionValue))) {
			String url=driver.getCurrentUrl();
			System.out.println(url);
			return url;
		}
		else {
			System.out.println("expected url is not visible...");
			return null;
		}
	}
	
	public static String waitForUrlIs(String urlValue, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		if(wait.until(ExpectedConditions.urlToBe(urlValue))) {
			System.out.println("url is correct");
			return driver.getCurrentUrl();
		}
		else {
			System.out.println("expected url is not visible...");
			return null;
		}
	}
	
	
	public static String waitForTitleContains(String titleFractionValue, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		if(wait.until(ExpectedConditions.titleContains(titleFractionValue))) {
			System.out.println("title contains "+ titleFractionValue);
			return driver.getTitle();
		}
		else {
			System.out.println("expected title is not visible...");
			return null;
		}
	}
	
	public static String waitForTitleIs(String titleVal, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		if(wait.until(ExpectedConditions.titleIs(titleVal))) {
			System.out.println("Title is "+ titleVal);
			return driver.getTitle();
		}
		else {
			System.out.println("expected title is not visible...");
			return null;
		}
	}
	
	public static String waitForTitleIsWithFW(String titleVal, int timeOut, int intervalTime) {
		Wait<WebDriver>wait=new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(timeOut)).pollingEvery(Duration.ofSeconds(intervalTime));
		if(wait.until(ExpectedConditions.titleIs(titleVal))) {
			System.out.println("Title is "+ titleVal);
			return driver.getTitle();
		}
		else {
			System.out.println("expected title is not visible...");
			return null;
		}
	}
}
