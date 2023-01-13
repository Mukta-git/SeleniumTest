package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleShopByCategory {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\MuktaSeth\\Downloads\\drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	
	driver.navigate().to("https://bigbasket.com/");
		
		
		By level1Menu=By.xpath("//a[@qa='catL1']");
		List<WebElement> Level1MenuList= driver.findElements(level1Menu);
		
		for(WebElement e: Level1MenuList) {
			String text=e.getText();
			System.out.println(text);
		}

	}

}
