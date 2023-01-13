package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalImages {

	static WebDriver driver;
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MuktaSeth\\Downloads\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.navigate().to("http://www.amazon.co.in");
		
		List<WebElement> totalimagelist=driver.findElements(By.tagName("img"));
		
		System.out.println("Total images :" + totalimagelist.size());
		
		
		// print src, alt, height of each image
		
		for(WebElement e: totalimagelist) {
			String srcval= e.getAttribute("src");
			String altval= e.getAttribute("alt");
			String htval= e.getAttribute("height");
			System.out.println(srcval+" || " + altval +" || " + htval);
		}

	}

}
