package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\MuktaSeth\\Downloads\\drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	
	//https://cgi-lib.berkeley.edu/ex/fup.html- file upload
	driver.navigate().to("https://cgi-lib.berkeley.edu/ex/fup.html");
	
	//input type= file - should be present to upload a file through selenium
	driver.findElement(By.name("upfile")).sendKeys("C:\\Users\\MuktaSeth\\OneDrive - Xperigo\\Desktop\\test.png");
	
	Thread.sleep(4000);
	driver.findElement(By.xpath("//input[@value='Press']")).click();
	
	}

}
