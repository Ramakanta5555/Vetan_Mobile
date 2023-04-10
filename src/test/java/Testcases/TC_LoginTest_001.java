package Testcases;

import org.junit.Assert;
import org.testng.annotations.Test;

import PageObject.LoginPage;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TC_LoginTest_001 extends BaseClass{
	
	@Test
	public void loginTest() throws InterruptedException
	{
		
		test = extent.createTest("AttendanceAndLeaveTest").assignAuthor("Ramakanta Samal").assignCategory("Regression").assignDevice("chrome 109.0.5414.119");
		
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
		 Thread.sleep(2000);
		 
		 if(driver.getPageSource().contains("Abhisek Mohanty")) {
			 
			log.info("LoginTest Passed");
			test.pass("LoginTest Passed");
			Assert.assertTrue(true);
		 }
		 else
		 {
			 log.info("Error");
			 test.fail("Error");
			 Assert.assertTrue(false);
		 }
		 
	}	 
}
