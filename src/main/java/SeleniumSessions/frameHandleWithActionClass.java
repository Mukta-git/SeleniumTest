package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class frameHandleWithActionClass {
static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\MuktaSeth\\Downloads\\drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	
	driver.navigate().to("https://classic.crmpro.com/index.html");
	driver.findElement(By.name("username")).sendKeys("newautomation");
	driver.findElement(By.name("password")).sendKeys("Selenium@12345");
	driver.findElement(By.xpath("//input[@value='Login']")).click();
	Thread.sleep(3000);
	driver.switchTo().frame("mainpanel");
	
	Actions act= new Actions(driver);
	act.moveToElement(driver.findElement(By.linkText("CONTACTS"))).build().perform();
	act.click(driver.findElement(By.linkText("New Contact"))).build().perform();
	
	//WebElement title= driver.findElement(By.name("title"));
	Select select = new Select( driver.findElement(By.name("title")));
	select.selectByValue("Miss");
	
	driver.findElement(By.id("first_name")).sendKeys("test");
	driver.findElement(By.id("surname")).sendKeys("Surname");
	Select select1 = new Select( driver.findElement(By.name("suffix")));
	select1.selectByValue("Sr.");
	
	driver.findElement(By.name("client_lookup")).sendKeys("Google");
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@value='Lookup' and @type='button'])[1]")).click();
	
	Set<String>handles=driver.getWindowHandles();
	Iterator<String>it= handles.iterator();
	
	String parentWindowId=it.next();
	String childWindow=it.next();
	
	driver.switchTo().window(childWindow);
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	
	driver.findElement(By.linkText("Google")).click();
	driver.switchTo().window(parentWindowId);
	
	driver.switchTo().frame("mainpanel");
	
	driver.findElement(By.xpath("//input[@type='radio' and @value='N']")).click();
	
	driver.findElement(By.xpath("//input[contains(@value,'Create Another')]/preceding-sibling::input[@value= 'Save']")).click();
	
	
	//https://classic.freecrm.com/system/lookup.cfm
		
	driver.close();
	
	
	
	
	}

}
