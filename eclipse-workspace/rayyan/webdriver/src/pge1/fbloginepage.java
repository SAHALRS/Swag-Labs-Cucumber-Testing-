package pge1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class fbloginepage {
	WebDriver driver;
	By fbemail=By.id("email");
	By fbpassword=By.id("pass");
	By fblogine=By.name("login");
	
	public fbloginepage(WebDriver driver)
	{
		this.driver=driver;
		
	}
	public void setvalues(String mail,String password)	{
		driver.findElement(fbemail).sendKeys(mail);
		driver.findElement(fblogine).sendKeys(password);
	}
	public void login() {
		driver.findElement(fblogine).click();
	}

}

