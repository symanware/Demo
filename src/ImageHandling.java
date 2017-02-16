import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class ImageHandling {
	
	 private static int InvalidImage;
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
	
		driver.get("https://www.seleniumeasy.com/");
		List<WebElement> ImageList=driver.findElements(By.tagName("img"));
		System.out.println("Total Number of images:"+ ImageList.size());
		for(WebElement ImageElement:ImageList)
		{
			verifyImage(ImageElement);
			
		}
		driver.quit();
		
	
	}
	
	public static void verifyImage(WebElement element)
	{
		try{
			
			
			HttpClient client= HttpClientBuilder.create().build();
			HttpGet request= new HttpGet(element.getAttribute("src"));
			HttpResponse response=client.execute(request);
			if(response.getStatusLine().getStatusCode()!=200)
			{
				
				InvalidImage++;
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

	
}
