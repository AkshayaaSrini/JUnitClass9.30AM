package baseClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {
	public static WebDriver driver;
	public static WebElement e;
	public static Actions a;
	public static Robot r;
	public static JavascriptExecutor js;
	public static TakesScreenshot t;
	public static Alert al;
	public static Select s;
	
	
	public static WebDriver launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HOME\\eclipse-workspace\\MavenClass9.30AM\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		return driver;
	}
	
	public static void launchUrl(String url) {
		driver.get(url);
	}	
		
	public static void maxWindow() {
		driver.manage().window().maximize();
	}
	

	public static String excelRead(int rowNo, int cellNo) throws IOException {
	
		File file= new File("C:\\Users\\HOME\\eclipse-workspace\\JUnit9.30AM\\Excel\\AdactinData.xlsx");
		
		FileInputStream fi=new FileInputStream(file);
		
		Workbook w=new XSSFWorkbook(fi);
		
		Sheet sheet = w.getSheet("Data");
		
				Row row = sheet.getRow(rowNo);
	
				Cell cell = row.getCell(cellNo);
				
				int cellType = cell.getCellType();
				String value="";
				
				if (cellType==1) {
					value = cell.getStringCellValue();
				}				
				
				else if (DateUtil.isCellDateFormatted(cell)) {
					Date d = cell.getDateCellValue();
					SimpleDateFormat s= new SimpleDateFormat("dd-MMMM-yyyy");
					value = s.format(d);
					
				}
				
				else {
					double dd = cell.getNumericCellValue();
					long l=(long) dd;
					value = String.valueOf(l);
				}
				return value;
			}
	
	
	public static void excelWrite(int rowNo, int cellNo, String folderpath, String sheetName, String Name) throws IOException {
		
		File file = new File("C:\\Users\\HOME\\eclipse-workspace\\MavenClass9.30AM\\ExcelSheets\\" +folderpath);
		
		Workbook w= new XSSFWorkbook();
		
		Sheet sheet = w.createSheet(sheetName);
		
		Row r = sheet.createRow(rowNo);
		
		Cell c = r.createCell(cellNo);
		
		c.setCellValue(Name);
	
		FileOutputStream fout = new FileOutputStream(file);
		
		w.write(fout);
	
	}
	
	
	public static String excelUpdate(String filePath, String sheetName, int rowNo, int cellNo, String Text1, String Text2 ) throws IOException {
		
		File file = new File(filePath);
		
		FileInputStream fin = new FileInputStream(file);
		
		Workbook w =new XSSFWorkbook(fin);
		
		Sheet sheet = w.getSheet(sheetName);
		
		Row r = sheet.getRow(rowNo);
		
		Cell c = r.getCell(cellNo);
		
		String value = c.getStringCellValue();
		
		if (value.equals(Text1)) {
			c.setCellValue(Text2);

		}
		
		FileOutputStream fout = new FileOutputStream(file);
		
		w.write(fout);
		
		return value;
					
		
	}
	
	
	public static String pageTitle() {
		String title = driver.getTitle();
		return title;
	}
	
	public static void pageUrl() {
		String url = driver.getCurrentUrl();
		System.out.println(url);
	}
	
	public static void fill(WebElement element, String text) {
		element.sendKeys(text);
	
	}
	
	public static void btnClick(WebElement element) {
		element.click();	
	}
	
	public static void pageText() {
		String text = e.getText();
		System.out.println(text);
		
	}
	
	public static void pageAttribute() {
		String attribute = e.getAttribute("String");
		System.out.println(attribute);

	}
	
	private void xpathFinding(String name) {
		
		WebElement element = driver.findElement(By.xpath(name));
	
	}
	
	private void preOfElementLocated(String id, long Sec) {
		WebDriverWait w = new WebDriverWait(driver, Sec);
		w.until(ExpectedConditions.presenceOfElementLocated(By.id("order_no")));
		
		
	}
	
	private void scrollUp(String Text) {
		WebElement scrollDown = driver.findElement(By.xpath(Text));
		js.executeScript("arguments[0].scrollIntoView(true)", scrollDown);
		
		
		
	}
	
	private void scrollDown(String Text1) {
		
		WebElement scrollDown = driver.findElement(By.xpath(Text1));
		js.executeScript("arguments[0].scrollIntoView(true)", scrollDown);
		
		
	}		
	
	
	public static void stepOver(long number) throws InterruptedException  {
		Thread.sleep(number);
		
	}
	
	public static void moveElement(WebElement element) {
		a.moveToElement(element).perform();
		
	}
	
	public static void dragDrop(WebElement src, WebElement dest) {
		Actions a=new Actions(driver);
		a.dragAndDrop(src, dest).perform();
		
	}
	public static void secondClick() {
		a.doubleClick().perform();		
		
	}
	
	public static void rightClick(WebElement element) {
		a.contextClick(element).perform();

	}
	public static void keyboardPress() throws AWTException {
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);

	}
	public void keyboardRelease() {
		r.keyRelease(KeyEvent.VK_DOWN);

	}	
		
	public void shiftDown(WebElement txt) {
		a.keyDown(txt,Keys.SHIFT).sendKeys("text");

	}
	public void shiftUp(WebElement txt) {
		a.keyUp(txt,Keys.SHIFT).perform();
	

	}
	
	public void eScript(Object top) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", top);
		
	}
	
	public void exScript(Object bottom) {
		js.executeScript("arguments[0].scrollIntoView(false)", bottom);
		
	}
	
	public static void screenShot(String filename) throws IOException {
		
		File src = t.getScreenshotAs(OutputType.FILE);
		File des=new File ("C:\\Users\\HOME\\eclipse-workspace\\SeleniumClass7PM\\Pictures "+ filename+ ".jpg");
		FileUtils.copyFile(src, des);
		
		
	}
	
	
	public void toCopyFile(File src, File dest) throws IOException {
		FileUtils.copyFile(src, dest);

	}
	public void alertAccept() {
		al.accept();
		
	}

	public void alertAvoid() {
		al.dismiss();
		
	}
	
	public void alertText() {
		al.getText();
		

	}
	public void switchFrame(String number) {
		driver.switchTo().frame(number);
		
	}
	
	public void selectValue(String number) {
		s.selectByValue(number);
		
	}
	
	
	public static void selectText(WebElement location, String text) {
		s.selectByVisibleText(text);

	}
	
	public void selectIndex(int number) {
		s.selectByIndex(number);
		
		
	}
	
	public void deselectValue(String number) {
		s.deselectByValue(number);

	}
	
	public void deselectText(String text) {
		s.deselectByVisibleText(text);
	
	}
	
	public void deselectIndex(int number) {
		s.deselectByIndex(number);
	
	}
	
	public static void quitBrowser() {
		driver.quit();

	}
		
	public static void closeBrowser() {
		driver.close();
		
	}
}