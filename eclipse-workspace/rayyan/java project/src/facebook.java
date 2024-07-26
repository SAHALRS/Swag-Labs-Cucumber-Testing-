import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


	public static void main(String[] args) {
		// TODO Auto-generated method stub{
		{		
WebDriver driver = new ChromeDriver();
driver.get("https://www.luminartechnolab.com/");

driver.get("https://www.luminartechnolab.com/");
driver.findElement(By.xpath("//*[@id=\"navbarNav\"]/ul/li[2]/a/a")).click();
driver.findElement(By.xpath("//*[@id=\"courses\"]/div/div/div[1]/div/a/button")).click();
driver.findElement(By.id("fullName")).click();
driver.findElement(By.id("fullName")).sendKeys("sahal");
driver.findElement(By.id("contact-number")).click();
driver.findElement(By.id("contact-number")).sendKeys("8138877120");
driver.findElement(By.id("email-id")).click();
driver.findElement(By.id("email-id")).sendKeys("sahalsalu286@gmail.com");
driver.findElement(By.id("district")).click();
driver.findElement(By.id("district")).sendKeys("pavarty");
Actions act=new Actions(driver);

	
	}	
}