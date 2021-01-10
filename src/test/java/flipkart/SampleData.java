package flipkart;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleData {
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void launchBrowser() {
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		
	}
	

	@Before
	public void startTime() {
		
		Date date = new Date();
		System.out.println(date);
		System.out.println("Start Time");
		driver.manage().window().maximize();
	}

	@After
	public void endTime() {
		Date date = new Date();
		System.out.println(date);
		System.out.println("End Time");
		driver.manage().window().maximize();
	}
	
	@Test
	public void tc1() throws InterruptedException {
		
		driver.get("https://www.flipkart.com/account/login");
		WebElement email = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		email.sendKeys("akshu@gmail.com");
		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		pass.sendKeys("aks%678");
		WebElement login = driver.findElement(By.xpath("(//span[text()='Login'])[2]"));
		login.click();
		
		Thread.sleep(3000);
		
		
	}

	
	@Test
	public void tc2() throws InterruptedException {
		
		driver.get("https://www.flipkart.com/account/login");
		WebElement email = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		email.sendKeys("akshayaa@gmail.com");
		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		pass.sendKeys("aks$245");
		WebElement login = driver.findElement(By.xpath("(//span[text()='Login'])[2]"));
		login.click();
		
		Thread.sleep(3000);

	}
	
	
	@Test
	public void tc3() throws InterruptedException {
		
		driver.get("https://www.flipkart.com/account/login");
		WebElement email = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		email.sendKeys("akshusrini@gmail.com");
		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		pass.sendKeys("aks*456");
		WebElement login = driver.findElement(By.xpath("(//span[text()='Login'])[2]"));
		login.click();
		
		Thread.sleep(3000);
		
	}
}