package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarHandling {
static WebDriver driver;
	
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\MuktaSeth\\Downloads\\drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	
	driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");	
		
		driver.findElement(By.id("datepicker")).click();
		
		selectFutureDate("January 2024","31");
		//selectCalDate("17");
		//selectCalendarDate("23");
		
	}
	
	
		
		public static void selectCalDate(String day){
			List<WebElement> dateList=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//a"));
			System.out.println(dateList.size());
			
			for(WebElement e: dateList) {
				String text=e.getText();
				if(text.equals(day)) {
				e.click();
				break;
				}
			}
			
		}
		
		
	//	while
			
			
		
		// http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html

	
	
	public static void selectCalendarDate(String day){
		driver.findElement(By.xpath("//a[text()='" + day + "']")).click();

	}
	

	static boolean isLeapYear(int year) {
		if (year % 4 != 0) {
			return false;
		} else if (year % 400 == 0) {
			return true;
		} else if (year % 100 == 0) {
			return false;
		} else {
			return true;
		}
	}

	public static void selectFutureDate(String monthyear, String day){
		
		
		if (Integer.parseInt(day) <= 0) {
			System.out.println("wrong day/date passed...Please pass the right day/date..." + day);
			return;
		}
		if (Integer.parseInt(day) > 31) {
			System.out.println("wrong day/date passed...Please pass the right day/date..." + day);
			return;
		}
		
		if (monthyear.contains("February")) {
			// leap year:
			if (isLeapYear(Integer.parseInt(monthyear.trim().split(" ")[1]))) {
				if (Integer.parseInt(day) >=30) {
					System.out.println(
							"wrong day/date passed...Please pass the right day/date for FEB month in Leap year..."
									+ day);
					return;
				}
			}
			//no leap year:
			else {
				if (Integer.parseInt(day) >=29) {
					System.out.println(
							"wrong day/date passed...Please pass the right day/date for FEB month in year..."+ day);
					return;
				}
			}
		}
		
		String actmonthyear= driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
		while(!actmonthyear.equals(monthyear)) {
			driver.findElement(By.xpath("//span[text()='Next']")).click();
			actmonthyear= driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
		}
		selectCalendarDate("31");

	}
	


}
