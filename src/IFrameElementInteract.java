import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class IFrameElementInteract {
	
	
	public static void main(String[] args) {
		
		WebDriver driver= new FirefoxDriver();
		driver.get("http://toolsqa.wpengine.com/iframe-practice-page/");
		driver.switchTo().frame("IF1");
		driver.findElement(By.name("firstname")).sendKeys("Shilpa");
		driver.findElement(By.name("lastname")).sendKeys("Manware");
		driver.switchTo().defaultContent();
		driver.switchTo().frame("IF2");
		driver.findElement(By.partialLinkText("http://demoqa.com/wp-content/uploads/2014/08/pattern-14.png")).click();
		
		
	}

}
