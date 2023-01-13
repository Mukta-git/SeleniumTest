package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowWithAllWindows {

static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\MuktaSeth\\Downloads\\drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	
	driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
	Thread.sleep(4000);
	String parentWindowId=driver.getWindowHandle();
	
	//window handler api
	//target=_blank, opens in new tab
	WebElement LkdLink= driver.findElement(By.xpath("//a[contains(@href, 'linkedin')]"));
	WebElement fcbookLink= driver.findElement(By.xpath("//a[contains(@href, 'facebook')]"));
	WebElement twitterLink=driver.findElement(By.xpath("//a[contains(@href, 'twitter')]"));
	WebElement youtubeLink= driver.findElement(By.xpath("//a[contains(@href, 'youtube')]"));
	LkdLink.click();
	fcbookLink.click();
	twitterLink.click();
	youtubeLink.click();
	
	//child window opens, switch driver to child window
	
	Set<String>handles= driver.getWindowHandles();
	Iterator<String>it= handles.iterator();
	
	while(it.hasNext()) {
		String windowId=it.next();
		driver.switchTo().window(windowId);
		System.out.println(driver.getCurrentUrl());
		
		Thread.sleep(1000);
		
		if(!windowId.equals(parentWindowId)){
			driver.close();
		}
	}
	driver.switchTo().window(parentWindowId);
	System.out.println(driver.getTitle());
	
	
	
//	String parentWindowId=it.next();
//	System.out.println("Parent window id: "+parentWindowId);
//	
//	String childWindowId=it.next();
//	System.out.println("Child window id: "+childWindowId);
//	
//	//switch to child window
//	driver.switchTo().window(childWindowId);
//	System.out.println(driver.getCurrentUrl());
//	
	driver.close();
//	
//	//switch to parent window
//	driver.switchTo().window(parentWindowId);
//	System.out.println("Parent window url"+driver.getCurrentUrl());
	
	//driver.quit();


//	
	}

}
