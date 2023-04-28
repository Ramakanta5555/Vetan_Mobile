package Testcases;


import java.time.Duration;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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
		 Thread.sleep(4000);
		 test.pass("Login Test Passed");

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

		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		 WebElement successMeaasge = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.view.View[@content-desc=\"Applied Successfully!\"]")));

		 if (successMeaasge.isDisplayed()) {
			log.info("Able to see Success message");

		 } else {
			log.info("unable to see Success message");
		 }

		 if (driver.getPageSource().contains("Applied Successful")) {
			
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
