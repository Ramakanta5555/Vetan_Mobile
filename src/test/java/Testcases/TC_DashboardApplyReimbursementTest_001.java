package Testcases;


import org.junit.Assert;
import org.testng.annotations.Test;
import PageObject.DashBoardApplyReimbursementPage;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TC_DashboardApplyReimbursementTest_001 extends BaseClass{

	
	@Test
	public void DashboardApplyReimbursementTest() throws InterruptedException
	{
		test = extent.createTest("DashboardApplyReimbursementTest").assignAuthor("Ramakanta Samal").assignCategory("Regression").assignDevice("chrome 109.0.5414.119");

		DashBoardApplyReimbursementPage dr = new DashBoardApplyReimbursementPage(driver);
		 
		 loginTest();
		 Thread.sleep(2000);

		 dr.clickbtnAddReimbursement();
		 Thread.sleep(2000);
		 
		 dr.clickbtnReimbursementType();
		 Thread.sleep(2000);
		 
		 dr.clickbtnTravelReimbursement();
		 Thread.sleep(2000);
		 
		 dr.clickbtnCalender();
		 Thread.sleep(2000);
		 
		 dr.clickbtnApril2();
		 Thread.sleep(2000);
		 
		 dr.clickbtnDateOk();
		 Thread.sleep(2000);
		 
		 dr.clicktxtReason();
		 Thread.sleep(2000);
		 
		 dr.settxtReason("Test");
		 Thread.sleep(2000);
		 
		 dr.clickbtnBlank();
		 Thread.sleep(2000);
		 
		 dr.clicktxtAmount();
		 Thread.sleep(2000);
		 
		 dr.settxtAmount("5000");
		 Thread.sleep(2000);
		 
		 dr.clickbtnBlank();
		 Thread.sleep(2000);
		 
		 dr.clickbtnAttachDocument();
		 Thread.sleep(2000);
		 
		 dr.clickbtnAllowMediaAccess();
		 Thread.sleep(2000);
		 
		 dr.clickbtnScreenshot23();
		 Thread.sleep(2000);
		 
		 dr.clickbtnsSave();
		 Thread.sleep(2000);
		 
		 if (driver.getPageSource().contains("Applied Successfully")) {
			
			 log.info("Reimbursment Applied Successfully ");
			 test.pass("Reimbursment Applied Successfully ");
			 Assert.assertTrue(true);
		}
		 
		 else
		 {
			 log.info("Unable to Apply Reimbursmenet");
			 test.fail("Unable to Apply Reimbursmenet");
			 Assert.assertTrue(false);
		 }
		 
		 
		 
	}
	
}
