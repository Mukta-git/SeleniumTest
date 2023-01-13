package SeleniumSessions;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementConcept {

	public static void main(String[] args) {
		// create a webelement +perform action on it- click, semdkeys etc
		
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\MuktaSeth\\Downloads\\drivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
		//driver.navigate().to("http://google.com");
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		By firstName=By.id("input-firstname");
		By lastName=By.id("input-lastname");
		By emailId=By.id("input-email");
		By telephone=By.id("input-telephone");
		By pswd=By.id("input-password");
		By confirmpswd=By.id("input-confirm");
		
		
		ElementUtil ele= new ElementUtil(driver);
		ele.dosendKeys(firstName, "Testfirst");
		ele.dosendKeys(lastName, "Testlast");
		ele.dosendKeys(emailId, "Test@gmail.com");
		ele.dosendKeys(telephone, "12345678");
		ele.dosendKeys(pswd, "Test@123");
		ele.dosendKeys(confirmpswd, "Test@123");
		
		
	}

}
