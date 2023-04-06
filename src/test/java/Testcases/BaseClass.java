package Testcases;

import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import PageObject.LoginPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;


public class BaseClass {
	

	
	AppiumDriver driver;
	
	
	@BeforeClass
	public void setup()
	{
		
		try {
		DesiredCapabilities caps = new DesiredCapabilities();
		
		
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.0");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "realme 6");
		caps.setCapability(MobileCapabilityType.UDID, "HUEAUSIRD6FYPBEA");
		caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
		
		caps.setCapability("appPackage", "com.moolfinance.app");
		caps.setCapability("appActivity", "com.moolfinance.app.MainActivity");
		
		URL url = new URL("http://127.0.01:4723/wd/hub");
		
		driver = new AppiumDriver(url, caps);
		Thread.sleep(10000);
		
		}catch (Exception exp) {
			System.out.println("Cause is:"+exp.getCause());
			System.out.println("Message is:"+exp.getMessage());
		}
			
	}
	
	

	public void loginTest() throws InterruptedException
	{
		 LoginPage lp = new LoginPage(driver);
		 	
		 lp.clicktxtUsername();
		 Thread.sleep(2000);
		 
		 lp.settxtUsername("zify1aa");
		 Thread.sleep(2000);
		 
		 lp.clickbtnMoolLogo();
		 Thread.sleep(2000);
		 
		 lp.clicktxtPassword();
		 Thread.sleep(2000);
		 
		 lp.settxtPassword("Mool@2020");
		 Thread.sleep(2000);
		 
		 lp.clickbtnMoolLogo();
		 Thread.sleep(2000);
		 
		 lp.clickbtnSignin();
		 Thread.sleep(8000);
		 
		 if(driver.getPageSource().contains("Abhisek Mohanty")) {
			 
			System.out.println("LoginTest Passed");
		 }
		 else
		 {
			 System.out.println("LoginTest Failed");
		 }
	}
	
	
	@AfterClass
	public void teardown()
	{
		driver.quit();
	}
}
