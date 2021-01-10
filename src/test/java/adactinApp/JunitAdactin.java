package adactinApp;

import java.io.IOException;
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

import baseClass.Base;
import io.github.bonigarcia.wdm.WebDriverManager;

public class JunitAdactin extends Base {
	
	@BeforeClass
	public static void launch() {
		launchBrowser();
		
	}
	
	@AfterClass
	public static void close() {
		
		System.out.println("Close");
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
		driver.get("http://adactinhotelapp.com/");
		pageUrl();
		PomAdactin a= new PomAdactin();
		fill(a.getTxtUser(),excelRead(1,0));
		fill(a.getTxtPass(),excelRead(1,1));
		btnClick(a.getBtnLogin());
		
		
		
	}
	
	@Test
	public void tc2() throws IOException {
		driver.get("http://adactinhotelapp.com/");
		PomAdactin a= new PomAdactin();
		fill(a.getTxtUser(),excelRead(2,0));
		fill(a.getTxtPass(),excelRead(2,1));
		btnClick(a.getBtnLogin());
		
		
		

	}
	
	@Test
	public void tc3() throws IOException {
		driver.get("http://adactinhotelapp.com/");
		PomAdactin a= new PomAdactin();
		fill(a.getTxtUser(),excelRead(3,0));
		fill(a.getTxtPass(),excelRead(3,1));
		btnClick(a.getBtnLogin());
		
		
	}
	
}





//driver.get("http://adactinhotelapp.com/");
//WebElement username = driver.findElement(By.id("username"));
//username.sendKeys("AkshuSrini");
//WebElement password = driver.findElement(By.id("password"));
//password.sendKeys("P2UGV8");
//WebElement login = driver.findElement(By.id("login"));
//login.click();