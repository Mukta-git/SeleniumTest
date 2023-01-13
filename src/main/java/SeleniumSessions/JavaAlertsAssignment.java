package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaAlertsAssignment {

static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\MuktaSeth\\Downloads\\drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	
	driver.navigate().to("https://the-internet.herokuapp.com/javascript_alerts");
	
	driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
	
	Alert alert=driver.switchTo().alert();
	String text=alert.getText();
	System.out.println(text);
	alert.accept();
	
	driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
	Alert alert1=driver.switchTo().alert();
	String text1=alert1.getText();
	System.out.println(text1);
	alert1.accept();
	System.out.println(driver.findElement(By.xpath("//p[text()='You clicked: Ok']")).getText());
	
	driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
	Alert alert2=driver.switchTo().alert();
	String text2=alert2.getText();
	System.out.println(text2);
	alert2.sendKeys("12345");
	alert2.accept();
	System.out.println(driver.findElement(By.xpath("//p[@id='result']")).getText());
	
	
	
	

	}

}
