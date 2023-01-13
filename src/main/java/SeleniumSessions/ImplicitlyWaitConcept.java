package SeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitlyWaitConcept {
	
	static WebDriver driver;

	public static void main(String[] args) {
		// Implicit wait- global wait and only for web elements
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MuktaSeth\\Downloads\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://naveenautomationlabs.com/opencart/");
		WebElement ele= driver.findElement(By.linkText("MacBook"));
		System.out.println(ele.getAttribute("href"));

		//override by declaring again
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	}

}
