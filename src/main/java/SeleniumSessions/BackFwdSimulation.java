package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BackFwdSimulation {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MuktaSeth\\Downloads\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();//1. open browser -- 123

		//2. launch url:
		driver.get("https://www.google.com");
		driver.manage().window().maximize();// maximize the browser.
		
		//driver.manage().window().fullscreen();
		
		String title = driver.getTitle();
		System.out.println("page title: " + title);//Google
		
		driver.navigate().to("https://www.amazon.com");
		System.out.println(driver.getTitle());
		
		driver.navigate().back();
		System.out.println(driver.getTitle());
		
		driver.navigate().forward();
		System.out.println(driver.getTitle());
		
		driver.navigate().refresh();
		
		
		driver.quit();

	}

}
