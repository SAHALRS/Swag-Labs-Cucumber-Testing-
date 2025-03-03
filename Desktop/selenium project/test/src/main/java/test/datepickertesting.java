package test;

import java.awt.dnd.DragGestureEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class datepickertesting {
	
	WebDriver dr;
	
	
	public void setup()
	{
		dr.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		dr.findElement(By.xpath("//*[@id=\"datepicker\"]")).click();
	
	String title=dr.findElement(By.xpath("//*[@id=\"datepicker\"]")).getText();
	String year=title.split(" ")[0].trim();
	String date=title.split(" ")[1].trim();
	
	System.out.println(year);

	
	}
}
