package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class WebDriverTopCastingoptions {
	static WebDriver driver;

	public static void main(String[] args) {

		// Option A creating the object of browser driver class

		// ChromeDriver driver= new ChromeDriver();

		// open the browser
		// WebDriver driver= new ChromeDriver();

		// System.setProperty("webdriver.gecko.driver","C:\\Users\\MuktaSeth\\Downloads\\drivers\\geckodriver.exe");

		// open the browser
		// WebDriver driver = new FirefoxDriver();

//		System.setProperty("webdriver.edge.driver", "C:\\Users\\MuktaSeth\\Downloads\\drivers\\edgedriver.exe");

		// open the browser
		// WebDriver driver = new EdgeDriver();

		// Option B top casting

		/*
		 * String browser= "chrome";
		 * if(browser.equals("chrome")) { System.setProperty("webdriver.chrome.driver","C:\\Users\\MuktaSeth\\Downloads\\drivers\\chromedriver.exe"); 
		 * driver= new ChromeDriver(); 
		 * } 
		 * else if(browser.equals("firefox")) {
		 * System.setProperty("webdriver.gecko.driver","C:\\Users\\MuktaSeth\\Downloads\\drivers\\geckodriver.exe"); 
		 * driver= new FirefoxDriver(); } 
		 * else {
		 * System.out.println("Please pass the right browser"); }
		 */

		// Option C using RemoteWebDriver- to run test cases at cloud/remote
		// machine/grid
		// driver= new RemoteWebDriver(remoteAddress, capabilities);
		
		// Option D -> SC= CD/FD/ED- valid top casting but we don't use it as we can only access two methods- FE, FEs
		// SearchContext sc= new ChromeDriver();

		
		// Option E RWD-CD/FD/ED
		RemoteWebDriver driver= new ChromeDriver();
		
		
		// launch url
		driver.get("https://www.linkedin.com");

		// get title

		String title = driver.getTitle();
		System.out.println("Page title :" + title);

		// validations act vs exp
		if (title.equals("LinkedIn: Log In or Sign Up")) {
			System.out.println("Correct url");
		} else {
			System.out.println("Incorrcet url");
		}

		// driver.close();
		// use this and not close
		driver.quit();

	}

}
