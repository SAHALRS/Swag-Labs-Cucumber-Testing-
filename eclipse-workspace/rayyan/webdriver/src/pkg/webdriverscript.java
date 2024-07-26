package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class webdriverscript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SAHAL SALU\\Desktop\\selenium\\selenium chrom file\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		String title=driver.getTitle();
		String window=driver.getWindowHandle();
		String exp="google";
		if(driver.equals(exp))
		{
		System.out.print("true");
		}
		else {
			System.out.print("false");
		}
		
	}

}
