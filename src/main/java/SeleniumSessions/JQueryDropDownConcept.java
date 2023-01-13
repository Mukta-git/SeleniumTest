package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JQueryDropDownConcept {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MuktaSeth\\Downloads\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.navigate().to("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		
		driver.findElement(By.id("justAnInputBox")).click();
		Thread.sleep(3000);
		By choices=By.xpath("//span[@class='comboTreeItemTitle']");
		
		//1. single selection
		//selectChoice(choices,"choice 1" );
		
		// 2. multiple choice
		//selectChoice(choices,"choice 1", "choice 2", "choice 7" );
		
		// 3. all selection
		selectChoice(choices,"all");
		// 4. no choice
		//selectChoice(choices,"choice 9" );
	}

/**
 * 	this method is handling single, multiple and all choices. 
 * this method can support if choice is not available
 * please pass available choice in case of multiple choices
 * @param locator
 * @param choice
 */
	public static void selectChoice(By locator, String... choice) {
		
		List<WebElement> choiceList= driver.findElements(locator);//44
		boolean flag=false;
		
		if(!(choice[0].equalsIgnoreCase("all"))) {
			
			for(WebElement e: choiceList) {
			String text=e.getText();
			//System.out.println(text);
			
				for(int i=0;i<choice.length;i++) {
					if(text.equals(choice[i])) {
						flag=true;
						e.click();
						break;
						
					}
					
				}
				}
			
			}
		else {
			try {
			for(WebElement e: choiceList) { //(0-44-14)
				e.click();
				flag=true;
			}
		}catch(Exception e) {
		
		}
		
		}
		if(flag==false) {
			System.out.println("choice is not available"+ choice[0]	);
		}
	}
		}
		
	
