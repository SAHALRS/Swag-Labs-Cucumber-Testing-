package pge1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class aa {
	WebDriver driver =new ChromeDriver();
	
	
	
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SAHAL SALU\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
		
		WebDriver driver =new ChromeDriver();
		
	}
	public void url() {
		
		driver.get("https://www.facebook.com/");
	
	}}

