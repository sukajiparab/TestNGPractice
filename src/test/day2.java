package test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {
	@Test
	public void seco1nDemo() {
		// TODO Auto-generated method stub
		System.out.println("I will execute bf method");
	}
	@Test(groups= {"smoke"})
	public void ploan() {
		// TODO Auto-generated method stub
		System.out.println("Good-----t");
	}
	@Test(dependsOnMethods= {"ploan","seco1nDemo"})
	public void secondDemo() {
		// TODO Auto-generated method stub
		System.out.println("I will execute first");
	}
	@BeforeTest
	public void seconDemo() {
		// TODO Auto-generated method stub
		System.out.println("I will execute last");
	}
	
	
}
