package pkg2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class vrlloginepage {

	WebDriver d;
	By sourse=By.xpath("//*[@id=\"source_city\"]");
	By destination=By.name("destination_city");
	By date=By.id("TRIPSTARTDATE");
	
	
	public void main(WebDriver d) {
	this.d=d;
	
	}
	public void setvalues(String pavarty,String trissure)
	{
	d.findElement(sourse).sendKeys(pavarty);
	d.findElement(destination).sendKeys(trissure);
	d.findElement(date).sendKeys("19-7-2022");
	d.findElement(By.xpath("//*[@id=\"Button2\"]")).click();
	}
}
