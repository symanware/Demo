

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SwitchWindow {
	
	
	WebDriver driver;
	WebDriverWait wait;
	String URL = "http://toolsqa.wpengine.com/automation-practice-switch-windows/";
	
 @BeforeClass
 public void setUp()
{
	driver= new FirefoxDriver();
	driver.manage().window().maximize();
	wait= new WebDriverWait(driver,5);
}
	
   @Test
  public void switchTest () {
	  
	  driver.navigate().to(URL);
	  String handle= driver.getWindowHandle();
	  System.out.println("Handle ID is"+handle);
	  driver.findElement(By.name("New Message Window")).click();
	  Set<String> handles= driver.getWindowHandles();
	  
	  System.out.println("Multiple handles"+handles);
	  Alert alert= driver.switchTo().alert();
	  System.out.println("Printing alert"+alert);
	  Thread.sleep(4000);
	  alert.dismiss();
	  driver.switchTo().window(handle);
	  
	  
	  
  }
}
