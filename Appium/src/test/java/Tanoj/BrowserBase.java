package Tanoj;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class BrowserBase {
	
	public AndroidDriver driver;
	public AppiumDriverLocalService service;

	@SuppressWarnings("deprecation")
	@BeforeClass
	public void MobileBrowser() throws MalformedURLException
	{
		service = new AppiumServiceBuilder().withAppiumJS (new File("C:\\Users\\tanoj\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js")).withIPAddress("127.0.0.1").usingPort(4723).build();
		service.start();
		
		UiAutomator2Options options = new UiAutomator2Options();

		options.setDeviceName("Tanoj Device");
		options.setChromedriverExecutable("C:\\Users\\tanoj\\eclipse-workspace\\Appium\\src\\test\\java\\resources\\chromedriver.exe");
		options.setCapability("browserName", "Chrome");
		
	
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	
	
	@AfterClass
	public void teardown()
	{
		driver.quit();
		service.stop();
	}
}
