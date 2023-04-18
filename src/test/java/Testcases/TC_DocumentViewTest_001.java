package Testcases;

import org.testng.annotations.Test;
import PageObject.DocumentViewPage;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TC_DocumentViewTest_001 extends BaseClass {
    
    @Test
    public void DocumentViewTest() throws InterruptedException
    {

        test = extent.createTest("DocumentViewTest").assignAuthor("Ramakanta Samal").assignCategory("Regression").assignDevice("chrome 109.0.5414.119");

        DocumentViewPage dv = new DocumentViewPage(driver);

        loginTest();
        Thread.sleep(2000);
        test.pass("Login Test Passed");

        dv.clickbtnDocument();
        Thread.sleep(2000);

        if (driver.getPageSource().contains("April 2023") && driver.getPageSource().contains("2023-24") && driver.getPageSource().contains("Download")) {
            
            log.info("We are on the Document Page of 2023-24");
        } else {
            log.info("Error");
        }

        dv.clickbtnFinancialYearFilter();
        Thread.sleep(2000);

        dv.clickbtnFinancialYear202223();
        Thread.sleep(2000);

        dv.clickbtnContinue();
        Thread.sleep(2000);

        if (driver.getPageSource().contains("January 2023") && driver.getPageSource().contains("December 2022") && driver.getPageSource().contains("2022-23") && driver.getPageSource().contains("Download")) {
            
            log.info("Financial year filter working successfully \n  We are on the Document Page of 2023-24");
            test.pass("Financial year filter working successfully \n  We are on the Document Page of 2023-24");
        }else{
            log.info("Error");
            test.fail("Error");
        }

       driver.navigate().back();

       if (driver.getPageSource().contains("Abhisek Mohanty")) {

        log.info("We Are on the Dashboard");
        test.pass("We Are on the Dashboard");
       } else {
         log.info("Error");
         test.fail("Error");
       }
    }
}
