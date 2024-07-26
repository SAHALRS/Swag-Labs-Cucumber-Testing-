package pkg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.microsoft.schemas.office.office.DetectmouseclickAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;

public class wrappalyzer {
	WebDriver driver;
	@BeforeTest()
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	}
	@BeforeMethod()
	public void urloading()
	{
		driver.get("https://www.wappalyzer.com");
	}
	
	@Test()
	public void wrappalyzertest()
	{
	WebElement resources=driver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div/div[3]/div[1]/div/div/div[4]/div/div"));
Actions act= new Actions(driver);
	act.moveToElement(resources);
	act.perform();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By .xpath("//*[@id=\"app\"]/div/main/div/div[3]/div[1]/div/div/div[4]/div/a[1]/div")).click()	;
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div/div[1]/header/div/div/div/div[2]/button[2]/span")).click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.xpath("//*[@id=\\\"list-item-53\\\"]/div/div[2]")).click();
	driver.findElement(By.xpath("//*[@id=\"list-item-56\"]/div/div[1]")).click();
	WebElement FAQS=driver.findElement(By.xpath("//*[@id=\"list-item-56\"]/div/div[1]"));
	act.moveToElement(FAQS);
	driver.findElement(By.xpath("//*[@id=\\\"list-item-56\\\"]/div/div[1]")).click();
	act.perform();
	driver.navigate().back();
	
	}

}



