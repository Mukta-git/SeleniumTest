package myTests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest extends BaseTest{
	
	
	@Test
	public void TitleTest() {
		Assert.assertEquals(driver.getTitle(),"Google");
	}
	
	@Test
	public void searchExists() {
		Assert.assertEquals(driver.findElement(By.name("q")).isDisplayed(), true);
		
	}

}
