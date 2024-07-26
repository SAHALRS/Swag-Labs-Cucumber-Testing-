package pkg;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.hssf.record.chart.AxisOptionsRecord;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import bsh.Console;
import io.github.bonigarcia.wdm.WebDriverManager;

public class amazonshoping {
	WebDriver driver;
	
	
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SAHAL SALU\\Desktop\\selenium\\selenium chrom file\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
	}
	@BeforeMethod
	public void url() {
		driver.get("https://www.amazon.com/");
	}
	@Test
	public void test1() throws Exception
	{
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[6]")).click();
		Actions act=new Actions(driver);
		WebElement accounts=driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/div"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		act.moveToElement(accounts).click();
		String sourcse=driver.getPageSource();
		System.out.println(sourcse);
		
driver.close();
		
		

		
	}
		
		
		
	
		
@Test 
public void test2()throws IOException {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.findElement(By.xpath("//*[@id=\"nav-cart-text-container\"]")).click();
	driver.get("https://www.amazon.in/");
	driver.close();
}
	@Test
	public void test3()throws IOException{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Actions act1=new Actions(driver);
		WebElement cart=driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/div"));
		act1.moveToElement(cart);
		driver.findElement(By.xpath("//*[@id=\"nav-al-wishlist\"]/a[1]/span")).click();
		act1.perform();
		driver.close();


}}