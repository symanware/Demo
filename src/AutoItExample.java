import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class AutoItExample {

	public static WebDriver driver;
	public static void main(String[] args) throws IOException {
		
		driver= new FirefoxDriver();
		driver.get("http://toolsqa.wpengine.com/automation-practice-form");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("photo")).click();
		Runtime.getRuntime().exec("F:/selenium/Demo/AutoitTest.exe");
		
	}
}
