package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.locators.RelativeLocator;


public class cmrPROTableAss {

static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\MuktaSeth\\Downloads\\drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	
	driver.navigate().to("https://classic.crmpro.com/index.html");
	driver.manage().window().maximize();
	
	driver.findElement(By.name("username")).sendKeys("newautomation");
	driver.findElement(By.name("password")).sendKeys("Selenium@12345");
	driver.findElement(By.xpath("//input[@value='Login']")).click();
	Thread.sleep(3000);
	
	driver.switchTo().frame("mainpanel");
	
	Actions act= new Actions(driver);
	act.click(driver.findElement(By.linkText("CONTACTS"))).build().perform();
	
	////a[text()='Romi singh']/parent::td/preceding-sibling::td//input[@type='checkbox']
//	selectUserTable("Romi singh");
//	
//	selectUserTable("Sneha k");
//	System.out.println(getCompanyName("Romi singh"));
//	System.out.println(getPhone("Romi singh"));
//	System.out.println(getHomePhone("Romi singh"));
//	System.out.println(getMobile("Romi singh"));
//	System.out.println(getEmail("Romi singh"));
	
	WebElement ele=driver.findElement(By.xpath("//a[text()='IBM']"));
	
	//Relative locators
	
	String rightIndex = driver.findElement(RelativeLocator.with(By.tagName("td")).toRightOf(ele)).getText();
	System.out.println(rightIndex);
	
	String leftIndex = driver.findElement(RelativeLocator.with(By.tagName("td")).toLeftOf(ele)).getText();
	System.out.println(leftIndex);
	

	String aboveIndex = driver.findElement(RelativeLocator.with(By.tagName("td")).above(ele)).getText();
	System.out.println(aboveIndex);
	

	String bottomIndex = driver.findElement(RelativeLocator.with(By.tagName("td")).below(ele)).getText();
	System.out.println(bottomIndex);
	
	String nearEleText = driver.findElement(RelativeLocator.with(By.tagName("td")).near(ele)).getText();
	System.out.println(nearEleText);
	
	
	////a[text()='Sneha k']/parent::td/following-sibling::td/a[@context='company']
	//a[text()='Sneha k']/parent::td/following-sibling::td/span[@context='phone']
	
			
	
	}
	
	public static void selectUserTable(String userName) {
		driver.findElement(By.xpath("//a[text()='"+userName+"']/parent::td/preceding-sibling::td//input[@type='checkbox']")).click();
	}
	public static String getCompanyName(String userName) {
		return driver.findElement(By.xpath("//a[text()='"+userName+"']/parent::td/following-sibling::td/a[@context='company']")).getText();
	}
	
	public static String getPhone(String userName) {
		return driver.findElement(By.xpath("//a[text()='"+userName+"']/parent::td/following-sibling::td/span[@context='phone']")).getText();
	}
	public static String getHomePhone(String userName) {
		return driver.findElement(By.xpath("(//a[text()='"+userName+"']/parent::td/following-sibling::td[@class='datalistrow'])[3]")).getText();
	}
	public static String getMobile(String userName) {
		return driver.findElement(By.xpath("(//a[text()='"+userName+"']/parent::td/following-sibling::td[@class='datalistrow'])[4]")).getText();
	}
	public static String getEmail(String userName) {
		return driver.findElement(By.xpath("(//a[text()='"+userName+"']/parent::td/following-sibling::td[@class='datalistrow'])[last()-1]")).getText();
	}
}
