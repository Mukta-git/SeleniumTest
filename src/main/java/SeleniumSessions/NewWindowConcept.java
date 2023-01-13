package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindowConcept {

static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\MuktaSeth\\Downloads\\drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	
	driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
	String pwId=driver.getWindowHandle();
	Thread.sleep(4000);
		
	driver.switchTo().newWindow(WindowType.TAB);
	driver.get("https://www.google.com");
	System.out.println(driver.getTitle());
	driver.close();
	
	driver.switchTo().window(pwId);
	driver.quit();

	}

}
