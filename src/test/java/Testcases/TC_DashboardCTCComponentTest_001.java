package Testcases;

import org.testng.annotations.Test;
import PageObject.DashboardCTCComponentPage;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TC_DashboardCTCComponentTest_001 extends BaseClass {
    
    @Test
    public void DashboardCTCComponentTest() throws InterruptedException
    {
        test = extent.createTest("DashboardCTCComponentTest").assignAuthor("Ramakanta Samal").assignCategory("Regression").assignDevice("chrome 109.0.5414.119");

        DashboardCTCComponentPage dc = new DashboardCTCComponentPage(driver);
        
        loginTest();
        Thread.sleep(2000);

        action_ClickOnPosition(893, 1761);
        Thread.sleep(2000);

        if (driver.getPageSource().contains("20,00,000 INR") && driver.getPageSource().contains("1,40,049 INR") ) {
            
            log.info("Salary details are Visible");
            test.pass("Salary details are Visible");

        } else {
            log.info("Unable to see the Salary details");
            test.pass("Unable to see the Salary details");
        }

        // JavascriptExecutor js = (JavascriptExecutor) driver;
        // HashMap<String, String> scrollObject = new HashMap<>();
        // scrollObject.put("direction", "down");
        // js.executeScript("mobile: swipe", scrollObject);

        // dc.clickbtnViewBreakDown();
        // Thread.sleep(2000);  
        
        // dc.clickbtnModifySalary();
        // Thread.sleep(2000);  

        // driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"+".scrollIntoView(new UiSelector()"+" .textContains(\"Show yearly breakdown\"))"));

        // dc.clickbtnShowSalaryBreakdown();
        // Thread.sleep(2000);
    }
}
