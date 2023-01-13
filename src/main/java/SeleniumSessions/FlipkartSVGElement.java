	package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartSVGElement {

static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\MuktaSeth\\Downloads\\drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();

	String xpath= "//*[local-name()='svg']//*[name()='g' and @fill-rule='evenodd']";
	By searchIcon= By.xpath(xpath);
	
	driver.findElement(By.name("q")).sendKeys("macbook");
	Thread.sleep(4000);
	Actions act= new Actions(driver);
	act.click(driver.findElement(searchIcon)).build().perform();
	
	//driver.findElement(searchIcon).click();
	
	}

}