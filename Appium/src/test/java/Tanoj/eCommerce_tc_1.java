package Tanoj;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class eCommerce_tc_1 extends BaseTest {
@Test
public void FillForm() throws InterruptedException
{
driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Tanoj");
//hidekey
driver.hideKeyboard();

driver.findElement(By.xpath("//android.widget.RadioButton[@text='Male']")).click();

driver.findElement(By.id("android:id/text1")).click();
driver.findElement(AppiumBy.androidUIAutomator
		("new UiScrollable(new UiSelector()).scrollIntoView(text(\"India\"));")); //UiScrollable //UiSelector
driver.findElement(By.xpath("//android.widget.TextView[@text='India']")).click();
driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
Thread.sleep(2000);

driver.findElement(AppiumBy.androidUIAutomator
		("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Jordan 6 Rings\"));"));

int productcount = driver.findElements(By.id("com.androidsample.generalstore:id/productName")).size();

for (int i =0; i<productcount; i ++)
{
	
	String productname= driver.findElements(By.id("com.androidsample.generalstore:id/productName")).get(i).getText();
	
//	if (productname.equalsIgnoreCase("Jordan 6 Rings"))
//	{
//		
//		driver.findElement(By.xpath("//android.widget.TextView[@text='ADDED TO CART'][i]")).click();
//		
//		driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
//		Thread.sleep(2000);
//	}
	
	if (productname.equalsIgnoreCase("Jordan 6 Rings"))
	{
		
	driver.findElements(By.id("com.androidsample.generalstore:id/productAddCart")).get(i).click();
	Thread.sleep(2000);
		
	}
	
	
}

//driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();

driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
//Thread.sleep(2000);

//Waiting

WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(5));
wait.until(ExpectedConditions.attributeContains(driver.findElement(By.id("com.androidsample.generalstore:id/toolbar_title")),"text", "Cart"));


String basketItems = driver.findElement(By.id("com.androidsample.generalstore:id/productName")).getText();

Assert.assertEquals(basketItems, "Jordan 6 Rings");

}

}
