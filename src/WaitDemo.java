

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitDemo {
	
	WebDriver driver;
	WebDriverWait wait;
	String URL="http://toolsqa.wpengine.com/automation-practice-switch-windows/";
	
	

	public static void main(String[] args) throws InterruptedException {
	  WebDriver driver;
		WebDriverWait wait;
		String URL="http://toolsqa.wpengine.com/automation-practice-switch-windows/";
	  driver = new FirefoxDriver();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  driver.navigate().to(URL);
	  driver.findElement(By.id("timingAlert")).click();
	  System.out.println("Timer JavaScript Alert is triggered but it is not yet opened");
	  wait = new WebDriverWait(driver, 5);
	  Alert myAlert = wait.until(ExpectedConditions.alertIsPresent());
	  System.out.println("Either Pop Up is displayed or it is Timed Out");
	  
      
      myAlert.accept();

      System.out.println("Alert Accepted");

      driver.close();

	  
  }
  	  
	 
	  
	  
	  
  }

