package TestNGSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OpenCart {
	
	WebDriver driver;
	
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MuktaSeth\\Downloads\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
	}
	
	@Test(description="Register Account", priority=1)
	public void RegistrationTest() {
		
		driver.findElement(By.id("input-firstname")).sendKeys("Test");	
		driver.findElement(By.id("input-lastname")).sendKeys("Last");
		driver.findElement(By.id("input-email")).sendKeys("Test@gmail.com");	
		driver.findElement(By.id("input-telephone")).sendKeys("12345678");;
		driver.findElement(By.id("input-password")).sendKeys("test@123");
		driver.findElement(By.id("input-confirm")).sendKeys("test@123");
		driver.findElement(By.xpath("//input[@type='checkbox' and @name='agree']")).click();
		driver.findElement(By.xpath("//input[@value='Continue' ]")).click();
		
		Assert.assertEquals(driver.getTitle(),"Register Account");
		
	}
	
	@Test(description="Logo Test",priority=2)
	public void LogoTest() {
		
		Assert.assertTrue(driver.findElement(By.xpath("//img[@title='naveenopencart']")).isDisplayed(), "Logo is dispalyed");	
	}
	
	
	@AfterTest
	public void tearDown() {
		//driver.quit();
	}

}
