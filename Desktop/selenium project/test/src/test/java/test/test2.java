package test;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class test2 {
	WebDriver dr;
	
	
	@Test
	public void main()
	{
		dr=new ChromeDriver();
		
		dr.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		dr.findElement(By.xpath("//*[@id=\"datepicker\"]")).click();
	
	String title=dr.findElement(By.className("ui-datepicker-title")).getText();
	String month=title.split(" ")[0].trim();
	String year=title.split(" ")[1].trim();
	
	System.out.println(title);
	
	while(!(month.equals("June")&& year.equals("2026"))) {
		
		dr.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span")).click();
		title=dr.findElement(By.className("ui-datepicker-title")).getText();
		 month=title.split(" ")[0].trim();
		 year=title.split(" ")[1].trim();
		
		
	}
	dr.findElement(By.xpath("//a[text()='23']")).click();
	}

}
