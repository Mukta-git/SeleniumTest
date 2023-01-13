package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IncognitoModeConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MuktaSeth\\Downloads\\drivers\\chromedriver.exe");
		
		ChromeOptions co = new ChromeOptions();
		//co.setHeadless(true);
		co.addArguments("--incognito");
		
		WebDriver driver= new ChromeDriver(co);
		
		
		driver.get("https:www.google.com");
		System.out.println(driver.getTitle());
		driver.quit();

	}

}
