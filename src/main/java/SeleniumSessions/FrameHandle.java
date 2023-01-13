package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandle {

static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\MuktaSeth\\Downloads\\drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	
	driver.get("http://www.londonfreelance.org/courses/frames/index.html");	
	Thread.sleep(3000);
	
	List<WebElement>framesList= driver.findElements(By.tagName("frame"));
	System.out.println(framesList.size());
	
	//driver.switchTo().frame(2);
	driver.switchTo().frame("main");
	String header=driver.findElement(By.xpath("/html/body/h2")).getText();
	System.out.println(header);
	
	driver.switchTo().defaultContent();
	
			
	}

}
