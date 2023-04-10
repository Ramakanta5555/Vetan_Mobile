package Testcases;

import org.junit.Assert;
import org.testng.annotations.Test;
import PageObject.DashBoardApplyLeavePage;
import PageObject.LoginPage;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Tc_DashboardApplyLeaveTest_001 extends BaseClass{

	@Test
	public void DashboardApplyLeaveTest() throws InterruptedException
	{
		test = extent.createTest("DashboardApplyLeaveTest").assignAuthor("Ramakanta Samal").assignCategory("Regression").assignDevice("chrome 109.0.5414.119");

		LoginPage lp = new LoginPage(driver);
		DashBoardApplyLeavePage db = new DashBoardApplyLeavePage(driver);
		
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
			 log.info("LoginTest Failed");
			 test.fail("LoginTest Failed");
			 Assert.assertTrue(false);
		 }

		 db.clickbtnRequestLeave();
		 Thread.sleep(2000);
		 
		 db.clickbtnTypeOfLeave();
		 Thread.sleep(2000);
		 
		 action_ClickOnPosition(169, 1020);
        Thread.sleep(2000);
		 
		 db.clickbtnCalender();
		 Thread.sleep(2000);
		 
		 db.clickbtnDate11();
		 Thread.sleep(2000);
		 
		 db.clickbtnDate12();
		 Thread.sleep(2000);
		 
		 db.clickbtnDateConfirm();
		 Thread.sleep(2000);
		 
		 db.clicktxtReason();
		 Thread.sleep(2000);
		 
		 db.settxtReason("Test");
		 Thread.sleep(2000);
		 
		 db.clickbtnAttachDocument();
		 Thread.sleep(2000);
		 
		 db.clickbtnAllowMediaAccess();
		 Thread.sleep(2000);
		 
		 db.clickbtnScreenShot2023();
		 Thread.sleep(2000);
		 
		 db.clickbtnApplyLeave();
		 Thread.sleep(2000);
		 
		 if (driver.getPageSource().contains("Successfully completed")) 
		 {
			log.info("Leave Applied Successfully");
			test.pass("Leave Applied Successfully");
		 }
		 else
		 {
			log.info("Error");
			test.fail("Error");
		 }
		 
		 
		 
		 
		 
	}


	 
	 
}
