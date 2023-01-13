package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath {
	
static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\MuktaSeth\\Downloads\\drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	
	driver.navigate().to("https://www.amazon.ca/");
	Thread.sleep(3000);
	// Absolute Xpath: complete hierarchy from root to bottom
	// Relative/Custom XPath: 
		
		//htmltag[@attr='value'
	
	List<WebElement> FooterList=driver.findElements(By.xpath("//td[@class='navFooterDescItem']//a"));
	System.out.println(FooterList.size());
	for(WebElement e:FooterList ) {
		
		System.out.println(e.getText());
		
	}
		
//(//td[@class='navFooterDescItem']//a)[last()]
		

}
}
