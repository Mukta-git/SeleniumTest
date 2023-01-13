package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cricInfoTable {

static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\MuktaSeth\\Downloads\\drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	
	driver.navigate().to("https://www.espncricinfo.com/series/lanka-premier-league-2022-23-1324518/jaffna-kings-vs-galle-gladiators-1st-match-1324519/full-scorecard");
	driver.manage().window().maximize();

	Thread.sleep(4000);
	
	driver.findElement(By.xpath(""));
		
		
	}

}
