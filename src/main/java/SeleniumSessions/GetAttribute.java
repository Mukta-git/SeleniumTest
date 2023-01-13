package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute {
	static WebDriver driver;

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MuktaSeth\\Downloads\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.co.in");
		driver.manage().window().maximize();
		
		ElementUtil eleut= new ElementUtil(driver);
		
		
//		String hrefval= driver.findElement(By.id("nav-logo-sprites")).getAttribute("href");
//		System.out.println(hrefval);
		
//		WebElement ele1= driver.findElement(By.id("nav-logo-sprites"));
//		String hrefval= ele1.getAttribute("href");
//		String label= ele1.getAttribute("aria-label");
//		
//		System.out.println(hrefval);
//		System.out.println(label);
//		
//		WebElement e= driver.findElement(By.cssSelector("#nav-xshop > a:nth-child(3)"));
//		String classname= e.getAttribute("class");
//		System.out.println(classname);
		
		By logo= By.id("nav-logo-sprites");
		By bestseller= By.cssSelector("#nav-xshop > a:nth-child(3)");
		
		String hrefval= eleut.geAttributeValue(logo, "href");
		System.out.println(hrefval);
		
		String label= eleut.geAttributeValue(bestseller, "class");
		System.out.println(label);

	}

}
