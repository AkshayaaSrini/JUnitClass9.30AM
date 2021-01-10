package jUnitFirstdayClass;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase {
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

	}
	
	@Test
	public void tc2() {
		System.out.println("TestCase2");
		
	}
	
	@Test
	public void tc3() {
		System.out.println("TestCase3");
		

	}

}
