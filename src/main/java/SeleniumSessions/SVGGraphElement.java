package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SVGGraphElement {

static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\MuktaSeth\\Downloads\\drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	
	driver.get("https://petdiseasealerts.org/forecast-map#/");
	Thread.sleep(4000);
	//driver.manage().window().maximize();
	
	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'map-instance')]")));
	String xpath = "//*[local-name()='svg' and @id='map-svg']//*[name()='g' and @id='regions']//*[name()='path']";
	By states = By.xpath(xpath);

	List<WebElement> statesList = driver.findElements(states);
	System.out.println(statesList.size());
	
	Actions act = new Actions(driver);
	
	for(WebElement e : statesList) {
		String name = e.getAttribute("name");			
		System.out.println(name);
		if(name.equals("Maryland")) {
			act.click(e).build().perform();
			break;
		}
		//act.moveToElement(e).build().perform();	
		
	}
	
//	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'map-instance')]")));
//
//	String xpath= "//*[local-name()='svg' and @id='map-svg']//*[name()='g' and @id='regions']//*[name()='path']";
//	List<WebElement>stateList=driver.findElements(By.xpath(xpath));
//	
//	int size=stateList.size();
//	System.out.println(size);
//	
//	Actions act=new Actions(driver);
//	
//	for(WebElement e: stateList) {
//		String name=e.getAttribute("name");
//		System.out.println(name);
//		if(name.equals("Maryland")) {
//			act.click(e).build().perform();
//			break;
//		}
		//act.moveToElement(e).build().perform();	
	
	
		
	}
	
	

	}

