package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MuktaSeth\\Downloads\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().setSize(new Dimension(1000,1200));
		driver.navigate().to("http://www.google.com");
		//driver.findElement(By.name("q")).sendKeys("Selenium");
		
		By SearchName= (By.name("q"));
		ElementUtil ele= new ElementUtil(driver);
		
		ele.dosendKeys(SearchName,"Selenium");
		Thread.sleep(3000);
		By optionlocator=By.xpath("//div[@class='wM6W7d']/span");
		ele.doClickOnElement(optionlocator, "selenium ide");
		
		
}

	public static WebElement getElement(By optionlocator) {
		return driver.findElement(optionlocator);
	}
	
	public static void doClickOnElement(By locator, String linkText) {
		List<WebElement> linksList = driver.findElements(locator);
		System.out.println("total links : " + linksList.size());

		for (WebElement e : linksList) {
			String text = e.getText();
			System.out.println(text);
			if (text.contains(linkText)) {
				e.click();
				break;
			}
		}
	}
	
	
}
