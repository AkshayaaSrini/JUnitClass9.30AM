package facebook;

import java.io.IOException;
import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


import baseClass.Base;

public class JunitFacebook extends Base{

	@BeforeClass
	public static void launch() {
		launchBrowser();		
	}
	
	@AfterClass
	public static void close() {
		System.out.println("Close Browser");
	}
	
	@Before
	public void startTime() {
		Date date = new Date();
		System.out.println(date);
	}
	
	@After
	public void endTime() {
		Date date = new Date();
		System.out.println(date);
	}

	@Test
	public void tc1() throws IOException {
		
		driver.get("https://www.facebook.com/");
		pageTitle();
		pageUrl();
		PomFacebook f =new PomFacebook();
		fill(f.getEmail(), excelRead(1,0));
		fill(f.getPass(), excelRead(1,1));
		btnClick(f.getLogin());
	}
		
	@Test
	public void tc2() throws IOException {
		
		driver.get("https://www.facebook.com/");
		pageTitle();
		pageUrl();
		PomFacebook f =new PomFacebook();
		fill(f.getEmail(), excelRead(2,0));
		fill(f.getPass(), excelRead(2,1));
		btnClick(f.getLogin());
	
	}
	
	@Test
	public void tc3() throws IOException {
		
		driver.get("https://www.facebook.com/");
		pageTitle();
		pageUrl();
		PomFacebook f =new PomFacebook();
		fill(f.getEmail(), excelRead(3,0));
		fill(f.getPass(), excelRead(3,1));
		btnClick(f.getLogin());
	
	}
	
}