package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class iFrameHandle {


static WebDriver driver;

	
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\MuktaSeth\\Downloads\\drivers\\chromedriver.exe");
	ChromeOptions co = new ChromeOptions();
    co.addArguments("--disable-notifications");
    co.addArguments("--disable-popup-blocking");

	
	driver = new ChromeDriver(co);
	
	driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");	
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//img[@title='vehicle-registration-forms-and-templates']")).click();
	Thread.sleep(2000);
	driver.switchTo().frame("frame-one748593425");
	driver.findElement(By.id("RESULT_TextField-2")).sendKeys("2021");
	driver.findElement(By.id("RESULT_TextField-3")).sendKeys("Honda");
	driver.findElement(By.id("RESULT_TextField-4")).sendKeys("CRV");
	driver.findElement(By.id("RESULT_TextField-5")).sendKeys("red");
	driver.findElement(By.id("RESULT_TextField-6")).sendKeys("9000");
	driver.findElement(By.id("RESULT_TextField-7")).sendKeys("ABC9000");
	driver.findElement(By.id("RESULT_TextField-8")).sendKeys("Test");
	driver.findElement(By.id("RESULT_TextField-9")).sendKeys("10 Queen St");
	driver.findElement(By.id("RESULT_TextField-11")).sendKeys("New York");
	
	Select select = new Select(driver.findElement(By.id("RESULT_RadioButton-12")));
	select.selectByIndex(2);
	driver.findElement(By.id("RESULT_TextField-13")).sendKeys("M1h 3j7");
	driver.findElement(By.id("RESULT_TextField-14")).sendKeys("1234567890");
	driver.findElement(By.id("RESULT_TextField-15")).sendKeys("test@gmail.com");
	driver.findElement(By.id("FSsubmit")).click();
	
//	driver.switchTo().defaultContent();
//	System.out.println(driver.getTitle());
//	Alert alert= driver.switchTo().alert();
//	alert.dismiss();
	//driver.close();
//	driver.switchTo().alert().dismiss();
	
	//https://selectorshub.com/xpath-practice-page/
//	https://www.espncricinfo.com/series/abu-dhabi-t10-2022-23-1344972/bangla-tigers-vs-delhi-bulls-19th-match-1345003/full-scorecard

	
	}

}
