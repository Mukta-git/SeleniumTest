package TestNGSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ApplicationTest {
	static WebDriver driver;
	
	@BeforeMethod
	public static void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MuktaSeth\\Downloads\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");;
	}
	
	@Test(description="Register Page Test")
	public static void registerTest() {
		driver.findElement(By.id("input-firstname")).sendKeys("test");
		driver.findElement(By.id("input-lastname")).sendKeys("last79");
		driver.findElement(By.id("input-email")).sendKeys("test789@gmail.com");
		driver.findElement(By.id("input-telephone")).sendKeys("789456123");
		driver.findElement(By.id("input-password")).sendKeys("test@12378");
		driver.findElement(By.id("input-confirm")).sendKeys("test@12378");
		driver.findElement(By.xpath("//input[@name='agree']")).click();
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		
		//String ele=driver.findElement(By.xpath("//div[@id='content']")).getText();
		String title= driver.getTitle();
		System.out.println(title);
		
		Assert.assertEquals(title, "Your Account Has Been Created!","....register account failed.....");
	}

	@AfterMethod
	public static void teardown() {
	//	driver.quit();
	}
}
