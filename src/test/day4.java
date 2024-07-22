package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class day4 {
	@Test(groups= {"smoke"})
	public void WebLoginhome() {
		//selenum
		System.out.println("WebloginHome");
	}
	
	@Test
	public void MobileLoginHome() {
		//appium
		System.out.println("MobileloginHome");
	}
	
	@Test(groups= {"smoke"})
	public void LoginAPIHome() {
		//RestAPI
		System.out.println("ApiloinHome");
	}
	@AfterSuite
	public void AfSuite() {
		//RestAPI
		System.out.println("Afteresuite");
	}
}
