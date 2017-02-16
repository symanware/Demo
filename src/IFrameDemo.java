

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class IFrameDemo {
	
	
	public static void main(String[] args) {
		WebDriver driver= new FirefoxDriver();
		driver.get("http://toolsqa.wpengine.com/iframe-practice-page/");
		
		System.out.println("Total Number of frames by executing JavaScript");
		
		JavascriptExecutor executer= (JavascriptExecutor)driver;
		Integer numOfFrames=Integer.parseInt(executer.executeScript("return window.length").toString());
		
		System.out.println("Total Number of Frames"+ numOfFrames);
		
		List<WebElement> iframeElements = driver.findElements(By.tagName("iframe"));
		
		System.out.println("Total Number of Iframes in webpage is"+ iframeElements.size());
		
		System.out.println("Current Frame id");
		driver.switchTo().frame("IF2");
		
		System.out.println("Switched to frame home");
		driver.switchTo().defaultContent();
		System.out.println("Switched to main page)");
		
	}

}
