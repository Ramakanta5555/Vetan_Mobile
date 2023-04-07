package Testcases;

import java.net.URL;
import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.PointerInput.MouseButton;
import org.openqa.selenium.interactions.PointerInput.Origin;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import PageObject.LoginPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import lombok.extern.slf4j.Slf4j;


@Slf4j
public class BaseClass {
	

	
	static AppiumDriver driver;
	
	
	@BeforeClass
	public void setup()
	{
		
		// * Set Capabilities * //
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
	
	

	// * Login Test *//
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
			 
			log.info("LoginTest Passed");
		 }
		 else
		 {
			log.info("LoginTest Failed");
		 }
	}



	// *Function to click any where using X and Y cordinates * //
	public void action_ClickOnPosition(int pointA_X, int pointA_Y)
	{
		PointerInput finger = new PointerInput(org.openqa.selenium.interactions.PointerInput.Kind.TOUCH, "finger"); 
        org.openqa.selenium.interactions.Sequence clickPosition = new org.openqa.selenium.interactions.Sequence(finger, 1); 
        clickPosition.addAction(finger.createPointerMove(Duration.ZERO, Origin.viewport(), pointA_X,pointA_Y)) .addAction(finger.createPointerDown(MouseButton.LEFT.asArg())) .addAction(finger.createPointerUp(MouseButton.LEFT.asArg())); 
        driver.perform(Arrays.asList(clickPosition));
	}
	
	@AfterClass
	public void teardown()
	{
		driver.quit();
	}
}
