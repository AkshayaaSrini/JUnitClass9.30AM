package jUnitSeconddayClass;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class AssertClass {

public static WebDriver driver;
	
	@BeforeClass
	public static void launchBrowser() {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	
	@AfterClass
	public static void closeBrowser() {
		driver.quit();

	}
	
	@Before
	public void startTime() {
		System.out.println("Start Time");
		Date date = new Date();
		System.out.println(date);
	
		
	}
	
	@After
	public void endTime() {
		System.out.println("End Time");
		Date date = new Date();
		System.out.println(date);
	

	}
	
	@Test
	public void tc1() {
		
		System.out.println("TestCase1");
		Assert.assertTrue("Assert Failed in Tc1", true);
		System.out.println("Test 1");

	}
	
	@Test
	public void tc2() {
		System.out.println("TestCase2");
		Assert.assertEquals("Assert Passed in tc2", "Akshu", "Akshu");
		System.out.println("Test 2");
		
	}

}