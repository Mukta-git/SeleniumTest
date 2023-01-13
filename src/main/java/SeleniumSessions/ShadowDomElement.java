package SeleniumSessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDomElement {
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MuktaSeth\\Downloads\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://selectorshub.com/xpath-practice-page/");
		Thread.sleep(4000);
		
		//driver.findElement(By.id("tea")).sendKeys("masala tea");

		driver.switchTo().frame("pact");
		//document.querySelector("#snacktime").shadowRoot.querySelector('#tea')
		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement tea = 
				(WebElement)js.executeScript("return document.querySelector(\"#snacktime\").shadowRoot.querySelector('#tea')");
		
		tea.sendKeys("Masala Tea");
		
		WebElement lunch = (WebElement)js.executeScript("return document.querySelector(\"#snacktime\").shadowRoot.querySelector(\"#app2\").shadowRoot.querySelector('#pizza')");
		lunch.sendKeys("test");
		
	}

}
