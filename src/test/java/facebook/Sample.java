package facebook;

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

public class Sample {
	
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
		
		Date date = new Date();
		System.out.println(date);
		

	}

	@After
	public void endTime() {
		Date date = new Date();
		System.out.println(date);
	
	}

	
	@Test
	public void tc1() throws InterruptedException {
		
		driver.get("https://www.facebook.com/");
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("Java");
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("Java@123");
		WebElement login = driver.findElement(By.name("login"));
		login.click();	
		
		Thread.sleep(3000);

	}
	
	@Test
	public void tc2() throws InterruptedException {
		
		driver.get("https://www.facebook.com/");
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("Selenium");
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("Selenium123");
		WebElement login = driver.findElement(By.name("login"));
		login.click();	
		
		Thread.sleep(3000);
		
		

	}
	
	@Test
	public void tc3() throws InterruptedException {
		
		driver.get("https://www.facebook.com/");
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("Python");
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("Python@123");
		WebElement login = driver.findElement(By.name("login"));
		login.click();	
		
		Thread.sleep(3000);
		
		
	}
	

}


