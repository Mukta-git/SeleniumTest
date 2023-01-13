package SeleniumSessions;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitforFrame {

static WebDriver driver;
	
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\MuktaSeth\\Downloads\\drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	
	driver.get("http://www.londonfreelance.org/courses/frames/index.html");	
	
	waitForFramePresentAndSwitchWithFW(2,10,1);
	
	String header=driver.findElement(By.xpath("/html/body/h2")).getText();
	System.out.println(header);
	driver.switchTo().defaultContent();
	
	waitForFramePresentAndSwitchWithFW("bot",10,1);
	String footer=driver.findElement(By.xpath("/html/body/h2")).getText();
	System.out.println(footer);
	}
	
	public static void waitForFramePresentAndSwitch(int frameIndex, int timeOut) {
		
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameIndex));
		}
	
public static void waitForFramePresentAndSwitch(String nameOrId, int timeOut) {
		
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(nameOrId));
		
	}

public static void waitForFramePresentAndSwitch(By frameLocator, int timeOut) {
	
	WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(timeOut));
	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameLocator));
	
}
public static void waitForFramePresentAndSwitch(WebElement frameElement , int timeOut) {
	
	WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(timeOut));
	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameElement));
	
}

public static void waitForFramePresentAndSwitchWithFW(int frameIndex, int timeOut, int intervalTime) {
	
	Wait<WebDriver> wait =new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(timeOut))
			.pollingEvery(Duration.ofSeconds(intervalTime))
			.ignoring(NoSuchElementException.class)
			.withMessage("Frame not found on the page");
	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameIndex));
	
}
public static void waitForFramePresentAndSwitchWithFW(String nameOrId, int timeOut, int intervalTime) {
	
	Wait<WebDriver> wait =new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(timeOut))
			.pollingEvery(Duration.ofSeconds(intervalTime))
			.ignoring(NoSuchElementException.class)
			.withMessage("Frame not found on the page");
	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(nameOrId));
	
}
}
