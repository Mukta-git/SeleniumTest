package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\MuktaSeth\\Downloads\\drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	
	driver.navigate().to("https://mail.rediff.com/cgi-bin/login.cgi");
	driver.findElement(By.xpath("//input[@name='proceed']")).click();
	Alert alert= driver.switchTo().alert();
	String text= alert.getText();
	System.out.println(text);
	//alert.sendKeys("12345");
	alert.accept();
	
	//alert.dismiss();
	
	
	//https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/

	}

}
