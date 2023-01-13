package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class googleLangLinks {
	static WebDriver driver;
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MuktaSeth\\Downloads\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.navigate().to("http://www.google.ca");
		
		List<WebElement> footerLink= driver.findElements(By.xpath(" //div[@class='KxwPGc SSwjIe']//div/a"));
		
		System.out.println(footerLink.size());
		
		for(WebElement e: footerLink) {
			
			if(!(e.getText().length()==0)) {
			
			System.out.println(e.getText());
		}
			
		

	}

	}
}