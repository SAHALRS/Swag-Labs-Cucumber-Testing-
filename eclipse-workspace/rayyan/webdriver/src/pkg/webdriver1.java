package pkg;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class webdriver1 {
	WebDriver d;
	
	@BeforeTest
	public void setup()
	{
		WebDriverManager.chromedriver();
		d = new ChromeDriver();
	}
		@BeforeMethod
		public void url()
		{
			d.get("https://www.facebook.com/");
		}
	
	
	
	@Test
	public void test1()throws IOException
	{
		File fi = new File("C:\\Users\\SAHAL SALU\\Desktop\\sam\\Book1.xlsx");
		InputStream is=new FileInputStream(fi);
		XSSFWorkbook wb=new XSSFWorkbook(is);
		XSSFSheet sh = wb.getSheet("Book1");
		System.out.println(sh.getLastRowNum());
		
		for(int i=1;i<=sh.getLastRowNum();i++)
		{
			d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			String username=sh.getRow(i).getCell(0).getStringCellValue();
			System.out.println(username);
			String paswd=sh.getRow(i).getCell(0).getStringCellValue();
			System.out.println(paswd);
			d.findElement(By.xpath("//*[@id=\'email']")).clear();
			d.findElement(By.xpath("//*[@id='email']")).sendKeys(username);
			d.findElement(By.xpath("//*[@id=\'pass']")).clear();
			d.findElement(By.xpath("//*[@id=\'pass']")).sendKeys(paswd);
			d.findElement(By.name("login")).click();
			d.navigate().back();
			d.close();
			
			
		}
		
	}

}
