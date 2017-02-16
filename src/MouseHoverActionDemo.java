import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class MouseHoverActionDemo {
	
	public static WebDriver driver;
	public static void main(String[] args) {
		
		driver= new FirefoxDriver();
		
		driver.get("http://store.demoqa.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement element= driver.findElement(By.linkText("Product Category"));
		Actions action= new Actions(driver);
		action.moveToElement(element).perform();
		WebElement subElement= driver.findElement(By.linkText("iPads"));
		action.moveToElement(subElement);
		action.click();
		action.perform();
		driver.close();
		
		
		
	}

}
