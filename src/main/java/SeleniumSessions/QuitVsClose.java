package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitVsClose {

	
	public static void main(String agrs[]) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MuktaSeth\\Downloads\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();//1. open browser -- 123

		//2. launch url:
		driver.get("https://www.google.com");
		
		//3. get the title:
		String title = driver.getTitle();
		System.out.println("page title: " + title);//Google
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		driver.quit();// after quit,session id becomes null
		
		//driver.close();//close the browser//123
		// after close,session id remains same but becomes invalid
		
		//launch browser again
		driver = new ChromeDriver(); //456
		driver.get("https://www.google.com");//456
		System.out.println(driver.getTitle());//456
		driver.quit();

		
	}
}
