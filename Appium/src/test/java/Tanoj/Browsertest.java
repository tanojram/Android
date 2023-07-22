package Tanoj;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Browsertest extends BrowserBase {

	@Test
	
	public void  browserTest() throws InterruptedException
	{
//		driver.get("http://google.com");
//		driver.findElement(By.name("q")).sendKeys("Tanoj");
//		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		
		
		driver.get("https://www.w3schools.com");
	
		driver.findElement(By.xpath("//a[@title='HTML Tutorial'][normalize-space()='HTML']")).click();
		Thread.sleep(2000);
		
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,10000)","");
		Thread.sleep(2000);
		
		//((JavascriptExecutor) driver).executeScript("window.scrollBy(0.1000)", " ");
		
		Thread.sleep(2000);
		String name = driver.findElement(By.cssSelector("a[href*='html_quiz.asp']")).getText();
		Assert.assertEquals(name, "Start HTML Quiz!");
		
		driver.findElement(By.cssSelector("a[href*='html_quiz.asp']")).click();
		
	
		/// a[href*='html_quiz.asp']
	}
	
	
	
}
