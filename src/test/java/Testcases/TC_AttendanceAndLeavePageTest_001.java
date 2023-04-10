package Testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObject.AttendanceAndLeavePage;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TC_AttendanceAndLeavePageTest_001 extends BaseClass{
    
    @Test
    public void AttendanceAndLeaveTest() throws InterruptedException
    {
        test = extent.createTest("AttendanceAndLeaveTest").assignAuthor("Ramakanta Samal").assignCategory("Regression").assignDevice("chrome 109.0.5414.119");
        
        AttendanceAndLeavePage aa = new AttendanceAndLeavePage(driver);

        loginTest();
        Thread.sleep(2000);
        test.pass("Login Test Passed");

        aa.clickbtnAttendanceandLeave();
        Thread.sleep(2000);

        aa.clickbtnBackwardToCalender();
        Thread.sleep(2000);

        if (driver.getPageSource().contains("March 2023") && driver.getPageSource().contains("35h 4m")) {

            log.info("Backward button working properly");
            test.pass("Backward button working properly");
            Assert.assertTrue(true);
            

        } else {
            log.info("Error");
            test.pass("Error");
            Assert.assertTrue(false);

        }

        aa.clickbtnForwardToCalender();
        Thread.sleep(2000);

        if (driver.getPageSource().contains("April 2023") && driver.getPageSource().contains("0h 0m")) {

            log.info("Forward button working properly");
            test.pass("Forward button working properly");
            Assert.assertTrue(true);
            

        } else {
            log.info("Error");
            test.pass("Error");
            Assert.assertTrue(false);

        }

        aa.clickbtnLeave();
        Thread.sleep(2000);

        aa.clickbtnAddleave();
        Thread.sleep(2000);

        aa.clickbtnTypeOfLeave();
        Thread.sleep(2000);

        action_ClickOnPosition(169, 1020);
        Thread.sleep(2000);

        aa.clickbtnCalender();
        Thread.sleep(2000);

        aa.clickbtnDate11();
        Thread.sleep(2000);

        aa.clickbtnDate12();
        Thread.sleep(2000);

        aa.clickbtnDateConfirm();
        Thread.sleep(2000);

        aa.clicktxtReason();
        Thread.sleep(2000);

        aa.settxtReason("Test");
        Thread.sleep(2000);

        aa.clickbtnAttachDocument();
        Thread.sleep(2000);

        aa.clickbtnAllowMediaAccess();
        Thread.sleep(2000);

        aa.clickbtnScreenShot2023();
        Thread.sleep(2000);

        aa.clickbtnApplyLeave();
        Thread.sleep(2000);

        if (driver.getPageSource().contains("Successfully completed")) 
		 {
			log.info("Leave Applied Successfully");
			test.pass("Leave Applied Successfully");
            Assert.assertTrue(true);
		 }
		 else
		 {
			log.info("Error");
			test.pass("Error");
            Assert.assertTrue(false);

		 }
        
    }
}
