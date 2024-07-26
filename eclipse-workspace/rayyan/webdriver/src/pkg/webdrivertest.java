package pkg;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.time.Duration;

import javax.xml.xpath.XPath;

import org.apache.poi.xssf.eventusermodel.XSSFSheetXMLHandler;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class webdrivertest {
	
WebDriver driver;
String Baseurl="https://www.facebook.com";
@BeforeTest
public void setup()
{
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	
}
@BeforeMethod
public void urloading()
{
	driver.get(Baseurl);
}


	

@Test
public void test1()throws IOException
{
	File f=new File("C:\\Users\\SAHAL SALU\\Documents\\Book1.xlsx") ;
	InputStream fi = new FileInputStream(f);
	XSSFWorkbook wb=new XSSFWorkbook(fi);
	XSSFSheet sh = wb.getSheet("Book1");
	System.out.println(sh.getLastRowNum());

	for(int i=0;i<=sh.getLastRowNum();i++);
	
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
		String username=sh.getRow(1).getCell(0).getStringCellValue();
		System.out.println("username="+username);
		String password =sh.getRow(0).getCell(1).getStringCellValue();
		System.out.println(password);
driver.get(Baseurl);
driver.findElement(By .xpath("//*[@id='email']")).clear();
driver.findElement(By.xpath("//*[@id='email']")).sendKeys(username);
driver.findElement(By.xpath("//*[@id=\'pass']")).clear();
driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys(password);
driver.findElement(By.name("login")).click();
driver.navigate().back();
	}
	
	
}











}
