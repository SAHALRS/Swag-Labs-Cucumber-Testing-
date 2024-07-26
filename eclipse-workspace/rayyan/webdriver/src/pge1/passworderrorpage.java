package pge1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class passworderrorpage {
	WebDriver driver;
	By forgetinlink=By.xpath("//*[@id=\"u_0_2_Ez\"]/div[3]/a");
	By forgetenpasswordmobile=By.id("identify_email");
	By forgetpasswordsearch=By.xpath("//*[@id=\"did_submit\"]");
	
	public passworderrorpage(WebDriver driver) {
		
		this.driver=driver;
		
	}
	public void setvalues(String forgetenpasswordmobile)
	{
		driver.findElement(forgetinlink).click();
		driver.findElement(By.id(forgetenpasswordmobile)).sendKeys("identify_email");
		
		driver.findElement(forgetpasswordsearch).click();
		
		
	}

}
