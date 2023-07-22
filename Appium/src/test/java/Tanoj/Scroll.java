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
import io.appium.java_client.android.AndroidDriver;

import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;



public class Scroll extends BaseTest {

	@Test

	public void Scroll() throws MalformedURLException, InterruptedException
	
	//Xpath // tagName{@attribute ='value']

	{

		{
			driver.findElement(AppiumBy.accessibilityId("Views")).click();
			Thread.sleep(2000);
			//andriod UI Automator 
			
		//driver.findElement(AppiumBy.androidUIAutomator
				//("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));")); //UiScrollable //UiSelector
		
			canScrollMoreAction();
		
			
			Thread.sleep(2000);
	}

	
	}
	

}