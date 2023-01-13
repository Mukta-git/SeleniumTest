package SeleniumSessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PseudoElementConcept {

static WebDriver driver;
	
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\MuktaSeth\\Downloads\\drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	
	driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
	
	//	window.getComputedStyle(document.querySelector("label[for='input-firstname']"),'::before').getPropertyValue('content')
	
	JavascriptExecutor js= (JavascriptExecutor)driver;
	String mandatoryText=js.executeScript("return window.getComputedStyle(document.querySelector(\"label[for='input-firstname']\"),'::before').getPropertyValue('content')").toString();
	System.out.println(mandatoryText);
	if(mandatoryText.contains("*")) {
		System.out.println("This is mandatory field");
	}
	}

}
