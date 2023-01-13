package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowHandlewithList {
static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\MuktaSeth\\Downloads\\drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	
	driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
	Thread.sleep(4000);


	WebElement LkdLink= driver.findElement(By.xpath("//a[contains(@href, 'linkedin')]"));
	LkdLink.click();
	Set<String>handles=driver.getWindowHandles();
	
	//convert set to list , non order to ordered list
	List<String>handlesList=new ArrayList<String>(handles);
	String pwId=handlesList.get(0);
	String chId=handlesList.get(1);
	driver.switchTo().window(chId);
	
	System.out.println(driver.getCurrentUrl());
	driver.close();
	
	driver.switchTo().window(pwId);
	System.out.println(driver.getCurrentUrl());
	driver.quit();
	
	}

}
