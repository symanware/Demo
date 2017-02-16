import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Action;


public class DragDropExample {

	public static WebDriver driver;
	public static void main(String[] args) {
		
		driver= new FirefoxDriver();
		driver.get("http://only-testing-blog.blogspot.in/2014/09/drag-and-drop.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement from= driver.findElement(By.id("dragdiv"));
		WebElement to= driver.findElement(By.id("dropdiv"));
		Actions builder= new Actions(driver);
		Action dragdrop=builder.clickAndHold(from).moveToElement(to).release(to).build();
		dragdrop.perform();
		
		
	}
}
