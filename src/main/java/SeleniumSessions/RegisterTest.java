package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterTest {

	public static void main(String[] args) {
	
		
		BroswerUtil br= new BroswerUtil();
		WebDriver driver= br.launchBrowser("chrome");
		
		br.launchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/register");		

		System.out.println(br.getPageTitl());
		
		By firstName=By.id("input-firstname");
		By lastName=By.id("input-lastname");
		By emailId=By.id("input-email");
		By telephone=By.id("input-telephone");
		By pswd=By.id("input-password");
		By confirmpswd=By.id("input-confirm");
		By privpoli=By.cssSelector("#content > form > div > div > input[type=checkbox]:nth-child(2)");
		By continuebtn= By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");
		By warning= By.xpath("//*[@id=\"account-register\"]/div[1]");
		
		ElementUtil ele= new ElementUtil(driver);
		ele.dosendKeys(firstName, "Testfirst");
		ele.dosendKeys(lastName, "Testlast");
		ele.dosendKeys(emailId, "Test@gmail.com");
		ele.dosendKeys(telephone, "12345678");
		ele.dosendKeys(pswd, "Test@123");
		ele.dosendKeys(confirmpswd, "Test@123");
		ele.doclick(privpoli);
		ele.doclick(continuebtn);
		String war=ele.dogetElementText(warning);
		System.out.println(war);
		if(war.contains("Warning: E-Mail Address is already registered!")) {
			System.out.println("User already registered");
				
		}
		
		br.browserquit();
		}
				
		
	}


