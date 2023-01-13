package SeleniumSessions;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateConcept {
	
	public static void main(String[] args) throws MalformedURLException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\MuktaSeth\\Downloads\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	//driver.navigate().to("http://google.com");
	driver.navigate().to(new URL("http://google.com"));
	
	String actitle=driver.getTitle();
	System.out.println(actitle);
	
	//validation point
	if(actitle.contains("Google")) {
		System.out.println("Correct title");
	}
	else
		System.out.println("Incorrect title");
	
	driver.quit();
}



}
