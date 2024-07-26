package pkg;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.asm.Advice.OffsetMapping.Target.AbstractReadOnlyAdapter;

public class fileupload {
	
	WebDriver d;
	@BeforeTest
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		d = new ChromeDriver();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
	}
	@BeforeMethod
	public void url()
	{
		d.get("https://www.ilovepdf.com/pdf_to_word");
		
	}
@Test
public void main()throws IOException, AWTException, InterruptedException
{
d.findElement(By.xpath("//*[@id=\"pickfiles\"]/span")).click();
fileupload("C:\\Users\\SAHAL SALU\\Downloads\\sswalih nu.pdf");

}
private void fileupload(String string) {
	// TODO Auto-generated method stub
	
}
private fileupload(String p) throws AWTException, InterruptedException {
	// TODO Auto-generated method stub
	StringSelection strselection=new StringSelection(p);
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strselection, null);
	
	Robot robot=new Robot();
	robot.delay(3000);
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_CONTROL);
	robot.keyRelease(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(5000);
	
	robot.keyRelease(KeyEvent.VK_ENTER);
	
}
}

