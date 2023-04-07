package Testcases;

import org.testng.annotations.Test;
import PageObject.DeclarationTaxprojectionPage;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DeclarationTaxprojectionPageTest extends BaseClass{
    

    @Test
    public void DeclarationTaxprojectionTest() throws InterruptedException
    {
        DeclarationTaxprojectionPage dt = new DeclarationTaxprojectionPage(driver);

        loginTest();
        Thread.sleep(2000);

        dt.clickbtnDeclaration();
        Thread.sleep(2000);

        dt.clickbtnTaxProjection();
        Thread.sleep(2000);
        
        
        // * to open the Deduction tab *//
        action_ClickOnPosition(971, 586);
        Thread.sleep(5000);	
        if (driver.getPageSource().contains("Section 80C, 80CCC, 80CCD") && driver.getPageSource().contains("₹72,000.00 /M")) {  
            log.info("Deduction Values are visible!!");
        } else {
            log.info("Error");
        }
        //to close the Deduction tab
        action_ClickOnPosition(971, 586);

        


        //to open the Allowances tab
        action_ClickOnPosition(971, 751);
        Thread.sleep(5000);	
        if (driver.getPageSource().contains("Food") && driver.getPageSource().contains("₹2,000.00 /M")) {  
            log.info("Allowances Values are visible!!");
        } else {
            log.info("Error");
        }
        //to close the Allowances tab
        action_ClickOnPosition(971, 751);




        //to open the HRA tab
        action_ClickOnPosition(971, 918);
        Thread.sleep(5000);	
        if (driver.getPageSource().contains("Rent:") && driver.getPageSource().contains("₹33,000.00 /M")) {  
            log.info("HRA Value is visible!!");
        } else {
            log.info("Error");
        }
        //to close the HRA tab
        action_ClickOnPosition(971, 918);
    



        //to open the Taxable Income tab
        action_ClickOnPosition(971, 1085);
        Thread.sleep(5000);	
        if (driver.getPageSource().contains("April") && driver.getPageSource().contains("₹1,64,867.00 /M")) {  
            log.info("Taxable income Values are visible!!");
        } else {
            log.info("Error");
        }
        //to close the Taxable Income tab
        action_ClickOnPosition(971, 1085);


        dt.clickbtnDownload();
        Thread.sleep(2000);	

        if (driver.getPageSource().contains("Adobe Acrobat")) {
            log.info("Download button is working Properly!!");
        } else {
            log.info("Error");
        }

        dt.clickbtnAdobe();
        Thread.sleep(2000);	

        if (driver.getPageSource().contains("TaxProjection_2023-2024_04_April")) {
            log.info("Tax projction pdf downloaded successfully!!");
        } else {
            log.info("Error");
        }

        driver.navigate().back();
        Thread.sleep(2000);

        if (driver.getPageSource().contains("Tax Projection")) {
            log.info("Tax Projection test Successful!!");
        } else {
            log.info("Error");
        }

        }
        
    
}
