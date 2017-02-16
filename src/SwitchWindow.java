

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
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
  public void switchTest () throws InterruptedException {
	  
	  driver.navigate().to(URL);
	  String handle1= driver.getWindowHandle();
	  System.out.println("Main window Handle ID is"+handle1);
	  driver.findElement(By.xpath("//button[contains(text(),'New Message Window')]")).click();
	  System.out.println("Message window clicked");
	  Set<String> handles= driver.getWindowHandles();
	  System.out.println("Multiple handles"+handles);
	
	Iterator<String> itr= handles.iterator();
	while(itr.hasNext()){
		String element = itr.next();
		  if(!(element.equals(handle1))){
			  String handle2=element;
				  driver.switchTo().window(handle2);
				  System.out.println("After clicking window handle is"+handle2);
			  }
	}
	 
	 // Alert alert= driver.switchTo().alert();
	  //System.out.println("Printing alert"+alert);
	 Thread.sleep(4000);
	//  alert.dismiss();
	  driver.switchTo().window(handle1);
	  String handle3= driver.getWindowHandle();
	  System.out.println("Return to main window"+handle3);
	  
	  
	  
  }
}
