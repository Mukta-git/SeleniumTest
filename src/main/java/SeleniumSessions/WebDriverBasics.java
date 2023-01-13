package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MuktaSeth\\Downloads\\drivers\\chromedriver.exe");
		
		// open the browser
		WebDriver driver= new ChromeDriver();
		
		//launch url
		driver.get("https://www.linkedin.com");
		
		// get title
		
		String title= driver.getTitle();
		System.out.println("Page title :"+ title);
		
		//validations act vs exp
		if(title.equals("LinkedIn: Log In or Sign Up")) {
			System.out.println("Correct url");
		}
		else {
			System.out.println("Incorrcet url");
		}
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		
		String src=driver.getPageSource();
		if(src.contains("Linked")) {
			System.out.println("This info is present");
		}
		
		
		//driver.close();
		// use this and not close
		driver.quit();
		
		//C:\Users\MuktaSeth\Downloads\chromedriver.exe

	}

}
