package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAnddropConcept {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\MuktaSeth\\Downloads\\drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	
	driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
	
	WebElement sourceEle=driver.findElement(By.id("draggable"));
	WebElement targetEle=driver.findElement(By.id("droppable"));
	
	Actions Act=new Actions(driver);
	//Act.clickAndHold(sourceEle).moveToElement(targetEle).release().build().perform();
	
	//OR
	Act.dragAndDrop(sourceEle, targetEle).build().perform();
	

	}

}
