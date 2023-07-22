package Tanoj;



import static org.testng.Assert.assertEquals;

import java.io.File;
import java.net.MalformedURLException;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;

import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;



public class Jump_to_activitypage extends BaseTest {

	@SuppressWarnings("deprecation")
	@Test

	public void jumptoactivuity() throws MalformedURLException, InterruptedException
	
	//Xpath // tagName{@attribute ='value']
	
	//adb shell dumpsys windows |find "mCurrentFocus"
	
	

	{
		Activity activity = new Activity("io.appium.android.apis", "io.appium.android.apis.view.DragAndDropDemo");
		//need to provide  app driver and landing page
		driver.startActivity(activity);
		{
			//driver.findElement(AppiumBy.accessibilityId("Views")).click();
			//Thread.sleep(2000);
			//andriod UI Automator 
			
		//driver.findElement(AppiumBy.androidUIAutomator
				//("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));")); //UiScrollable //UiSelector
		
			//driver.findElement(AppiumBy.accessibilityId("Drag and Drop")).click();
			WebElement source =   driver.findElement(By.id("io.appium.android.apis:id/drag_dot_1"));
			
			//canScrollMoreAction();
		
			((JavascriptExecutor) driver).executeScript("mobile: dragGesture", ImmutableMap.of(
				    "elementId", ((RemoteWebElement) source).getId(),
				    "endX", 628,
				    "endY", 485
				));
			
			
			Thread.sleep(2000);
			
			Thread.sleep(2000);
	}

	
	}
	

}