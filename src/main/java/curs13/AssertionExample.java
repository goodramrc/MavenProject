package curs13;

import static org.testng.Assert.*;

import org.testng.annotations.*;

public class AssertionExample {
	
	String actualTitle = "Test";
	String expectedTitle = "masina";
	
	@Test
	public void checkEquality() {
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("Test passed!");
		}else {
			System.out.println("Test failed!");
		}
	}
	
	@Test
	public void checkStringEquality() {
		assertEquals(actualTitle, expectedTitle);
	}

}
