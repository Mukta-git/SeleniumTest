package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FEsGenericMethod {


	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MuktaSeth\\Downloads\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.navigate().to("https://www.freshworks.com/");
		By footerLinks= By.xpath("//div[contains(@class, 'footer-left-section')]//a");
		
		int actCountElement= totalElementCount(footerLinks);
		System.out.println(actCountElement);
		
		if(actCountElement==21) {
			System.out.println("Total count- 21- PASS");
			
		}
		
		List<String> accEleList=getElementsTextList(footerLinks);
		System.out.println(accEleList);
		if(accEleList.contains("Freshmarketer")) {System.out.println("PASS");	}
		
		
		By FooterLink= By.xpath("//div[contains(@class, 'footer-nav ')]/a");
		
		int count= totalElementCount(FooterLink);
		System.out.println(count);
		if(count==7) {
			System.out.println("Count - 7- PASS");
		}
		
		List<String> acFooterList=getElementsTextList(FooterLink);
		System.out.println(acFooterList);
		if(acFooterList.contains("Terms of service")) {System.out.println("PASS");	}
		if(acFooterList.contains("Privacy Notice")) {System.out.println("PASS");	}
		
		}
	
	public static List<WebElement> getElements(By locator) {
		
		return driver.findElements(locator);
	}
	
	public static int totalElementCount(By locator) {
		return getElements(locator).size();
	}
	public static List<String> getElementsTextList(By locator) {
		List<WebElement> eleList= driver.findElements(locator);
		List<String> eleTextList= new ArrayList<String>();
		
			for(WebElement e: eleList) {
			String text= e.getText();
			eleTextList.add(text);
			//System.out.println(text);
			

			}
			return eleTextList;
	}
}
