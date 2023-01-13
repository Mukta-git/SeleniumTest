package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowHandleOneByOne {

static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\MuktaSeth\\Downloads\\drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	
	driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
	Thread.sleep(5000);
	
	
	//window handler api
	//target=_blank, opens in new tab
	//1
	WebElement LkdLink= driver.findElement(By.xpath("//a[contains(@href, 'linkedin')]"));
	LkdLink.click();
	
	Set<String>handles=driver.getWindowHandles();
	Iterator<String>it= handles.iterator();
	
	String parentWindowId=it.next();
	String childWindow=it.next();
	
	driver.switchTo().window(childWindow);
	System.out.println(driver.getTitle());
	driver.close();
	
	driver.switchTo().window(parentWindowId);
	
	//2
	WebElement fcbookLink= driver.findElement(By.xpath("//a[contains(@href, 'facebook')]"));
	fcbookLink.click();
	Set<String>handles2=driver.getWindowHandles();
	Iterator<String>it2= handles2.iterator();
	
	parentWindowId=it2.next();
	childWindow=it2.next();
	
	driver.switchTo().window(childWindow);
	System.out.println(driver.getTitle());
	driver.findElement(By.linkText("Google")).click();
	driver.close();
	
	
//	WebElement twitterLink=driver.findElement(By.xpath("//a[contains(@href, 'twitter')]"));
//	WebElement youtubeLink= driver.findElement(By.xpath("//a[contains(@href, 'youtube')]"));
	
	
	
	
	
	}

}
