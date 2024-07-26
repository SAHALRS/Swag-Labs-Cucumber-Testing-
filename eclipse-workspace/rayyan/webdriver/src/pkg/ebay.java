package pkg;

import java.io.File;
import java.time.Duration;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ebay {
	
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
		driver.get("https://www.ebay.com");
	}
	
	@Test()
	public void ebaytest1()throws Exception
	{
	WebElement electronics=driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/a"));
Actions act= new Actions(driver);
File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileHandler.copy(src,new File("E://error.png"));
	act.moveToElement(electronics);
	act.perform();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By .xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/div[2]/div[1]/nav[1]/ul/li[7]/a")).click()	;
		
	}

}
