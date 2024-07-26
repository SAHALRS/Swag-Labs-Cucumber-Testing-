package pge1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class cgrr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.edge.driver","C:\\Users\\SAHAL SALU\\Desktop\\New folder (2)\\edgedriver_win64\\msedgedriver.exe");
WebDriver driver=new EdgeDriver();
driver.manage().window().maximize();
driver.get("https://www.flipkart.com/") ;
driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[2]/div/form/div[1]/input")).click();
	}

}
