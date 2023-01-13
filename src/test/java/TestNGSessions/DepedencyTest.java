package TestNGSessions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DepedencyTest {
	
static WebDriver driver;

// AAA Pattern - Arrange, Act and Assert	

//@Test(enabled= false)- not running a test case or invocationCount=0
	
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MuktaSeth\\Downloads\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.google.com");
		
	}
	@Test
	public static void GoogleTest() {
		//driver.
		Assert.assertEquals(driver.getTitle(), "Google");
		
	}
	
	// if googletest fails search test will fail too
	
	@Test(dependsOnMethods= "GoogleTest")
	public static void GoogleSearchTest() {
		//driver.
		System.out.println("search text");
		
	}

}
