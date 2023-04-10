package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import PageObject.DeclarationDeductionPage;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TC_DeclarationDeductionPageTest_001 extends BaseClass {
    
    
    
    public void DeclarationGeneralMakeDeclarationTest() throws InterruptedException
    {
        test = extent.createTest("DeclarationGeneralMakeDeclarationTest").assignAuthor("Ramakanta Samal").assignCategory("Regression").assignDevice("chrome 109.0.5414.119");

        DeclarationDeductionPage dp = new DeclarationDeductionPage(driver);

        loginTest();
        Thread.sleep(2000);

        dp.clickbtnDeclaration();
        Thread.sleep(2000);

        dp.clickbtnDeduction();
        Thread.sleep(4000);

        dp.clickbtnGeneral();
        Thread.sleep(2000);

        dp.clickbtn80C();
        Thread.sleep(2000);

        dp.clickbtnSubmit();
        Thread.sleep(2000);

        dp.clickbtnMakeADeclaration();
        Thread.sleep(2000);

        dp.clickbtnContinue();
        Thread.sleep(2000);

        dp.clickbtnDocumentType();
        Thread.sleep(2000);

        dp.clickbtnLifeInsurancePremium();
        Thread.sleep(2000);

        dp.clicktxtAmount();
        Thread.sleep(2000);

        dp.settxtAmount("12000");
        Thread.sleep(2000);

        dp.clickbtnblank();
        Thread.sleep(2000);

        dp.clickbtnSave();
        Thread.sleep(1000);
        
        if (driver.getPageSource().contains("Successfully updated!")) {
            
                log.info("Declartion Added Successfully");

        } else {
            
            log.info("Error");
            log.info(driver.getPageSource());
        }

        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
        Thread.sleep(2000);

        try {
            
        dp.clickbtnDeclaration();
        Thread.sleep(2000);

        dp.clickbtnDeduction();
        Thread.sleep(4000);

        dp.clickbtnGeneral();
        Thread.sleep(2000);

        dp.clickbtn80C();
        Thread.sleep(2000);
        
       

        } catch (StaleElementReferenceException e) {
            
            WebElement btnDeclaration1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView[4]"));
            btnDeclaration1.click();
            WebElement btnDeduction1 = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Deduction\"]"));
            btnDeduction1.click();
            WebElement btnGeneral1 = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"General\"]"));
            btnGeneral1.click();
            WebElement btn80C1 = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"80C\n"
            +"Investment\"]"));
            btn80C1.click();
        }

        dp.clickbtnviewDeclaration();
        Thread.sleep(2000);
        
        if (driver.getPageSource().contains("Life Insurance Premium") && driver.getPageSource().contains("12,000 INR")) {
            
            log.info("Life Insurance Premium Declartion is visible on the View Declaration Page");

        } else {
            log.info("Error");
        }
    }

    @Test
    public void DeclarationGeneralSubmitProofTest() throws InterruptedException
    {

        DeclarationDeductionPage dp = new DeclarationDeductionPage(driver);

        loginTest();


        dp.clickbtnDeclaration();
        Thread.sleep(2000);

        dp.clickbtnDeduction();
        Thread.sleep(4000);

        dp.clickbtnGeneral();
        Thread.sleep(2000);

        dp.clickbtn80C();
        Thread.sleep(2000);

        dp.clickbtnSubmit();
        Thread.sleep(2000);

        dp.clickbtnSubmitProof();
        Thread.sleep(2000);

        dp.clickbtnContinue();
        Thread.sleep(2000);

        dp.clickbtnDocumentType();
        Thread.sleep(2000);

        dp.clickbtnLifeInsurancePremium();
        Thread.sleep(2000);

        dp.clicktxtAmount();
        Thread.sleep(2000);

        dp.settxtAmount("12000");
        Thread.sleep(2000);

        dp.clickbtnBlank1();
        Thread.sleep(2000);

        dp.clickbtnAttachDocument();
        Thread.sleep(2000);

        dp.clickbtnAllowMediaAccess();
        Thread.sleep(2000);

        dp.clickbtnScreenshot23();
        Thread.sleep(2000);

        dp.clickbtnSave();
        Thread.sleep(1000);

        if (driver.getPageSource().contains("Successfully updated!")) {
            
            log.info("Proof uploaded Successfully");

        } else {
        
        log.info("Error");
        log.info(driver.getPageSource());
    }

    }
}
