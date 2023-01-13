package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalLinks {
	static WebDriver driver;

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MuktaSeth\\Downloads\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https:www.amazon.co.in");
		
		//html tag : a
		List<WebElement> Linklist = driver.findElements(By.tagName("a"));
		
		System.out.println("Total links: "+ Linklist.size());
		
//		for(int i=0;i<Linklist.size();i++){
//			
//			String text=Linklist.get(i).getText();
//				
//				if(!(text.length()==0)) {
//					System.out.println(text);
//				}
		//for each loop
		for(WebElement e: Linklist) {
			String s= e.getText();
			if(!(s.length()==0)) {
				System.out.println(s);	
			
		}

	}
	
	}
}
