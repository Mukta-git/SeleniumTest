package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverLaunch {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MuktaSeth\\Downloads\\drivers\\chromedriver.exe");
		
		WebDriver driver1 = new ChromeDriver();
		
		driver1.navigate().to("http://google.com");
				
		WebDriver driver2 = new ChromeDriver();
		driver2.get("https://amazon.com");
		System.out.println(driver2.getTitle());
		driver1=driver2;
		
		System.out.println(driver1.getTitle());
		System.out.println(driver2.getTitle());
		
		driver1.quit();
		driver2.quit();
		
		
	
	}

}
