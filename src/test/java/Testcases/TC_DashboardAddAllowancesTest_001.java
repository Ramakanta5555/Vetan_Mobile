package Testcases;

import org.junit.Assert;
import org.testng.annotations.Test;
import PageObject.DashboardAddAllowancesPage;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TC_DashboardAddAllowancesTest_001 extends BaseClass{
    
    @Test
    public void DashboardAddAllowancesTest() throws InterruptedException
    {
        test = extent.createTest("DashboardAddAllowancesTest").assignAuthor("Ramakanta Samal").assignCategory("Regression").assignDevice("chrome 109.0.5414.119");

        DashboardAddAllowancesPage da = new DashboardAddAllowancesPage(driver);

        loginTest();
        Thread.sleep(2000);
        test.pass("Login Test Passed");

        da.clickbtnAddAllowances();
        Thread.sleep(2000);

        da.clickbtnAllowancestype();
        Thread.sleep(2000);

        da.clickbtnDearnessAllowance();
        Thread.sleep(2000);

        da.clicktxtAmount();
        Thread.sleep(2000);

        da.settxtAmount("800");
        Thread.sleep(2000);

        da.clickbtnAttachDocument();
        Thread.sleep(2000);

        da.clickbtnAllowMediaAccess();
        Thread.sleep(2000);

        da.clickbtnScreenshot23();
        Thread.sleep(2000);

        da.clickbtnSave();
        Thread.sleep(4000);

        // System.out.println(driver.getPageSource());
        
        if (driver.getPageSource().contains("Successfully uploaded!!")) {
            
            log.info("Allowances Added Successfully");
            test.pass("Allowances Added Successfully");
            Assert.assertTrue(true);
        } else {
            log.info("Unable to Add Allowances");
            test.fail("Unable to Add Allowances");
        }
    }
}
