package SeleniumSessions;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BroswerUtil {
	
	WebDriver driver;
	
	
	public WebDriver launchBrowser(String browserName) {
		
		System.out.println("Browser name is : "+ browserName);
		
		switch(browserName.toLowerCase()){
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\MuktaSeth\\Downloads\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
						
		case "firefox":
			System.setProperty("webdriver.gecko.driver", "/Users/naveenautomationlabs/Downloads/geckodriver");
			driver = new FirefoxDriver();
			break;
			
		case "safari":
			driver = new SafariDriver();
			break;
			
		default:
			System.out.println("plz pass the right browser name...." + browserName);
			break;	
			
		
		
	}
		return driver;
		
	}		
	public void launchUrl(String url){
		if(url==null) {
			System.out.println("url is null");
			throw new FrameworkException("Url is NULL");
		}
		if(url.length()==0) {
			System.out.println("url is blank");
			throw new FrameworkException("Url is blank");
		}
		if(url.indexOf("http")!=0 && url.indexOf("https")!=0) {
			
			System.out.println("http(s) is missing");
			throw new FrameworkException("Url doesn't have http(s)");
		}
		driver.get(url);
			
		}
	
	public void launchUrl(URL url){
		
		String Newurl=String.valueOf(url);
		if(Newurl==null) {
			System.out.println("url is null");
			throw new FrameworkException("Url is NULL");
		}
		if(Newurl.length()==0) {
			System.out.println("url is blank");
			throw new FrameworkException("Url is blank");
		}
		if(Newurl.indexOf("http")!=0 && Newurl.indexOf("https")!=0) {
			
			System.out.println("http(s) is missing");
			throw new FrameworkException("Url doesn't have http(s)");
		}
		driver.navigate().to(url);
			
		}
		
	public String getPageTitl() {
		return driver.getTitle();
	}
		
	public void browserclose() {
		driver.close();
	}
	
	public void browserquit() {
		driver.quit();;
	}

}

