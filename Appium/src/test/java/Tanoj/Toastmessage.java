package Tanoj;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class Toastmessage extends BaseTest {
@Test
public void FillForm() throws InterruptedException
{
//driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Tanoj");
//hidekey
driver.hideKeyboard();

driver.findElement(By.xpath("//android.widget.RadioButton[@text='Female']")).click();

driver.findElement(By.id("android:id/text1")).click();
driver.findElement(AppiumBy.androidUIAutomator
		("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Argentina\"));")); //UiScrollable //UiSelector
driver.findElement(By.xpath("//android.widget.TextView[@text='Argentina']")).click();
driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
Thread.sleep(2000);

//toast name 

///  android.widget.Toast is message there can be mulitple messages which can be given  with number   
//getAttribute("name");

String toastMessage =driver.findElement(By.xpath("(//android.widget.Toast)[1]")).getAttribute("name");
Assert.assertEquals(toastMessage,"Please enter your name");

}
}
