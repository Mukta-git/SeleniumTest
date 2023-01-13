package SeleniumSessions;

import org.openqa.selenium.WebDriver;

public class AmazonTest {

	public static void main(String[] args) {
	
		String browserName= "chrome";
		BroswerUtil br= new BroswerUtil();
		WebDriver driver= br.launchBrowser(browserName);
		
		br.launchUrl("https://www.amazon.com");
		
		String actitle=br.getPageTitl();
		System.out.println(actitle);
		
		//validation point
		if(actitle.contains("mazon")) {
			System.out.println("Correct title");
		}
		else
			System.out.println("Incorrect title");
	}

}
