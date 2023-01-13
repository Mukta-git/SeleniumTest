package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomWait {
	static WebDriver driver;
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static WebElement retryingElement(By locator, int timeOut) {
		WebElement element=null;
		int attempts=0;
		
			while(attempts<timeOut) {
				try {
				element=getElement(locator);
				System.out.println("element is found in "+ attempts);
				break;
			}
		catch(NoSuchElementException e) {
			System.out.println("Element not found on "+ attempts);
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
		}
			
		attempts++;
			}
		if(element==null) {
			System.out.println("Element not found on the page");
			throw new FrameworkException("TimeOutException");
		}
		return element;
		
	}
	public static WebElement retryingElement(By locator, int timeOut, int intervalTime) {
		WebElement element=null;
		int attempts=0;
		
			while(attempts<timeOut) {
				try {
				element=getElement(locator);
				System.out.println("element is found in "+ attempts+"for "+locator);
				break;
			}
		catch(NoSuchElementException e) {
			System.out.println("Element not found on "+ attempts+ "for"+locator);
			
			try {
				Thread.sleep(intervalTime*1000);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
		}
		attempts++;
			}
		if(element==null) {
			System.out.println("Element not found on the page");
			throw new FrameworkException("TimeOutException");
		}
		return element;
	}

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MuktaSeth\\Downloads\\drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://classic.freecrm.com/register/");
		By firstName = By.name("first_name1");
		//retryingElement(firstName, 20).sendKeys("Naveen");
		retryingElement(firstName, 10, 2).sendKeys("Naveen");

	}

}
