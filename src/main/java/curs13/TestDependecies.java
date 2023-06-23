package curs13;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class TestDependecies {
	
	@Test
	public void method1() {
		assertTrue(false);
		System.out.println("Method1");
	}
	
	@Test(dependsOnMethods = "method1")
	public void method2() {
		System.out.println("Method2");
	}
	
	@Test(dependsOnMethods = "method2")
	public void method3() {
		System.out.println("Method3");
	}


}
