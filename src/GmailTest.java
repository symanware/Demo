import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GmailTest {

	@Test
	public void launchGmail() {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://gmail.com");

		String actualTitle = driver.getTitle();
		
		takeScreenShot(driver, "gmail");

		Assert.assertEquals(actualTitle, "Gmail1");

	}

	public void takeScreenShot(WebDriver driver, String methodName) {
		// get the driver
		String filePath = "F:\\selenium\\Demo\\src\\";
		File scrFile = ((TakesScreenshot) driver)
				.getScreenshotAs(OutputType.FILE);
		// The below method will save the screen shot in d drive with test
		// method name
		try {
			FileUtils.copyFile(scrFile,
					new File(filePath + methodName + ".png"));
			System.out.println("***Placed screen shot in " + filePath + " ***");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
