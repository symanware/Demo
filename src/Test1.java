import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.Test;

public class Test1 {
	
	@Test
	public void main() {
		WebDriver driver = new FirefoxDriver();
		ProfilesIni allprof= new ProfilesIni();
		System.out.println("profile info printing"+ allprof);
	 //   allprof  myprof= allprof.getProfile(profileName);
		
		System.out.println("Started");
		driver.get("http://www.indeed.ca");

		driver.findElement(By.id("what")).sendKeys(new String[] { "Selenium" });
		
		driver.findElement(By.id("where")).clear();		
		
		driver.findElement(By.id("where")).sendKeys(new String[] { "Canada" });
		
		System.out.println("is displayed: " + driver.findElements(By.id("pageontent")));
		
		driver.findElement(By.id("fj")).click();
		
	//	System.out.println(By.id("talertemail").);
		
		System.out.println("is displayed: " + driver.findElements(By.id("pageContent")));
		
		
		
		
		
	}
}
