package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementConcept {
	static WebDriver driver;
	
		public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MuktaSeth\\Downloads\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.navigate().to("https://spicejet.com/");
		
		selectSubMenu("div","Add-ons","Student Discount");

	}
		public static WebElement getElement(By locator) {
			return driver.findElement(locator);
		}
		
		public static void doClick(By locator) {
			getElement(locator).click();
		}
		public static void selectSubMenu(String htmltag, String parentMenu, String childMenu) throws InterruptedException {
			
			By parentMenuLocator=By.xpath("//"+htmltag+"[text()='"+parentMenu+"']");
			By childmenuLocator= By.xpath("//"+htmltag+"[text()='"+childMenu+"']");
			
			WebElement parentMenuElement= getElement(parentMenuLocator);
			Actions act= new Actions(driver);
			act.moveToElement(parentMenuElement).build().perform();
			Thread.sleep(2000);
			
			doClick(childmenuLocator);
			
			
		}

}
