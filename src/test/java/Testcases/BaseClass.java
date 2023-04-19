package Testcases;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Arrays;
import java.util.Date;

import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.PointerInput.MouseButton;
import org.openqa.selenium.interactions.PointerInput.Origin;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import PageObject.LoginPage;
import Utilities.readConfig;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import lombok.extern.slf4j.Slf4j;


@Slf4j
public class BaseClass {
	
	public static AppiumDriver driver;
	public static ExtentReports extent;
    public static ExtentTest test;
	readConfig readconfig = new readConfig();
	public String prodUserName = readconfig.getProdUserName();
	public String prodPassword = readconfig.getProdPassword();

	@BeforeSuite
	public void BeforeSuite() throws IOException
	{
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());//time stamp
		// String repName="Test-Report-"+timeStamp+".html";
		String repName="VetanMobileTestReport"+".html";
		extent = new ExtentReports();
      	String failedReportName = "FailedExtentReport";
      	ExtentSparkReporter spark = new ExtentSparkReporter(System.getProperty("user.dir")+ "/test-output/extentReport/"+repName);
      	ExtentSparkReporter failedspark = new ExtentSparkReporter(System.getProperty("user.dir")+ "/test-output/"+failedReportName).filter().statusFilter().as(new Status []{Status.FAIL}).apply();
      	failedspark.config().setDocumentTitle("Failed Tests");
      	// spark.config().setTheme(Theme.DARK);
      	// spark.config().setDocumentTitle("Extent Report");
      	// spark.config().setReportName("Extent Report");
      	final File CONF = new File("extent-config.xml"); 
      	spark.loadXMLConfig(CONF);
		extent.attachReporter(spark, failedspark);

	}
	
	
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
		
		// caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		// caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
		// caps.setCapability(MobileCapabilityType.DEVICE_NAME, "/Users/ramakantasamal/Downloads/app-release.apk");
		  
		
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
		 
		 lp.settxtUsername(prodUserName);
		 Thread.sleep(2000);
		 
		 lp.clickbtnMoolLogo();
		 Thread.sleep(2000);
		 
		 lp.clicktxtPassword();
		 Thread.sleep(2000);
		 
		 lp.settxtPassword(prodPassword);
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

	@AfterSuite
	public void afterSuite() throws IOException
	{
		extent.flush();
	}
}
