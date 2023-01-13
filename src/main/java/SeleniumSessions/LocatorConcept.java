package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {

	static WebDriver driver;
	public static void main(String[] args) {

		//1. Id unique
		//2. name
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MuktaSeth\\Downloads\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		//driver.findElement(By.name("email")).sendKeys("test@gmail.com");
		
		ElementUtil ele= new ElementUtil(driver);
		
//		By emailId= By.name("email");
//		ele.dosendKeys(emailId, "test@gmail.com");
		
		// 3. class name - duplicate
		
		//driver.findElement(By.className("form-control")).sendKeys("hello");
		
		//4 xpath- not an attribute- address of an element in html dom
//		driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("test@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("test@123");
//		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
		
		
//		By emailid= By.xpath("//*[@id=\"input-email\"]");
//		By pswd= By.xpath("//*[@id=\"input-password\"]");
//		By loginbtn= By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input");
//		
//		ele.dosendKeys(emailid, "test@gmail.com");
//		ele.dosendKeys(pswd, "test@123");
//		ele.doclick(loginbtn);
		
		// 5 CSS- not an attribute
		
		//driver.findElement(By.cssSelector("#input-email")).sendKeys("test@gmail.com");
		
//		By emailid= By.cssSelector("#input-email");
//		By pswd= By.cssSelector("#input-password");
//		By loginbtn= By.cssSelector("#content > div > div:nth-child(2) > div > form > input");
//		ele.dosendKeys(emailid, "test@gmail.com"); 
//		ele.dosendKeys(pswd, "test@123");
//		ele.doclick(loginbtn);
//		
		

		//6. linktext
		//driver.findElement(By.linkText("Register")).click();
//		By registerlin= By.linkText("Register");
//		ele.doclick(registerlin);
		
		//7. partial linktext
		//driver.findElement(By.partialLinkText("Forgotten")).click();
		
		//8. tagName
//		String text1=driver.findElement(By.tagName("h2")).getText();
//		System.out.println(text1);
		By text2= By.tagName("h2");
		String header= ele.dogetElementText(text2);
		System.out.println(header);
		
	}

}
