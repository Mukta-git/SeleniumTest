package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClickConcept {

static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\MuktaSeth\\Downloads\\drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	
	driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
	WebElement rightClickEle=driver.findElement(By.xpath("//span[text()='right click me']"));
	
	Actions Act=new Actions(driver);

	Act.contextClick(rightClickEle).build().perform();
	
	List<WebElement> EleList=driver.findElements(By.xpath("//ul[@class='context-menu-list context-menu-root']/li[contains(@class,'context-menu-icon')]"));
	
	System.out.println(EleList.size());
	for(WebElement e:EleList ) {
		String text= e.getText();
		System.out.println(text);
		if(text.equals("Copy")) {
			e.click();
			break;
		}
	}
	}

}
