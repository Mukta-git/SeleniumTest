package TestNGSessions;

import org.testng.annotations.Test;


public class ExpectedExceptionConcept {
	
	String name;
	
	@Test(expectedExceptions = {ArithmeticException.class, NullPointerException.class})
	public void CalTest() {
		
		int a=9/0;
		ExpectedExceptionConcept obj=null;
		obj.name="Test";
		
	}
	
	@Test(invocationCount=2)
	public void Test() {
		System.out.println("Test");
	}

}
