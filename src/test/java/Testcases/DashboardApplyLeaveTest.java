package Testcases;

import org.testng.annotations.Test;

import PageObject.DashBoardApplyLeavePage;
import PageObject.LoginPage;

public class DashboardApplyLeaveTest extends BaseClass{

	@Test
	public void DashboardApplyLeaveTest() throws InterruptedException
	{
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
			 
			System.out.println("LoginTest Passed");
		 }
		 else
		 {
			 System.out.println("LoginTest Failed");
		 }
		 
		 
		 db.clickbtnRequestLeave();
		 Thread.sleep(2000);
		 
		 db.clickbtnTypeOfLeave();
		 Thread.sleep(2000);
		 
		 db.clickbtnTestLeave();
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
			System.out.println("Leave Applied Successfully");
		 }
		 else
		 {
			System.out.println("Error");
		 }
		 
		 
		 
		 
		 
	}


	 
	 
}
