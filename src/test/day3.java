package test;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class day3 {
	@Test
	public void WebLogin() {
		//selenum
		System.out.println("Weblogin");
	}
	
	@Test
	public void MobileLogin() {
		//appium
		System.out.println("Mobilelogin");
	}
	@Test
	public void MobileLogin1() {
		//appium
		System.out.println("Mobilelogin1");
	}
	
	@Test
	public void LoginAPI() {
		//RestAPI
		System.out.println("Apiloin");
	}

}
