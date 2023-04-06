package Testcases;

import org.testng.annotations.Test;
import PageObject.DashboardAddAllowancesPage;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DashboardAddAllowancesTest extends BaseClass{
    
    @Test
    public void DashboardAddAllowancesTest() throws InterruptedException
    {
        DashboardAddAllowancesPage da = new DashboardAddAllowancesPage(driver);

        loginTest();
        Thread.sleep(2000);

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
        Thread.sleep(2000);

        if (driver.getPageSource().contains("Successfully Uploaded!!")) {
            
            log.info("Allowances Added Successfully");
        } else {
            log.info("Error");
        }
    }
}
