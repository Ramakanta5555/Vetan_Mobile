package Testcases;


import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import PageObject.DeclarationAllowancesPage;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DeclarationAllowancesPageTest extends BaseClass{
    
    @Test
    public void DeclarationAllowancesTest() throws InterruptedException
    {
        DeclarationAllowancesPage da = new DeclarationAllowancesPage(driver);

        loginTest();
        Thread.sleep(2000);

        da.clickbtnDeclaration();
        Thread.sleep(2000);

        da.clickbtnAllowances();
        Thread.sleep(2000);

        da.clickbtnHRA();
        Thread.sleep(2000);

        da.clickbtnViewFullDetails();
        Thread.sleep(2000);

        da.clickbtnEdit();
        Thread.sleep(2000);

        da.clicktxtHomeRent();
        Thread.sleep(2000);

        da.cleartxtHomeRent();
        Thread.sleep(2000);

        da.settxtHomeRent("33000");
        Thread.sleep(2000);

        da.clicktxtOwnerName();
        Thread.sleep(2000);

        da.cleartxtOwnerName();
        Thread.sleep(2000);

        da.settxtOwnerName("Titu Mama");
        Thread.sleep(2000);

        da.clicktxtPanOfTheOwner();
        Thread.sleep(2000);

        da.cleartxtPanOfTheOwner();
        Thread.sleep(2000);

        da.settxtPanOfTheOwner("UDUDU8383N");
        Thread.sleep(2000);

        da.clickbtnBlank();
        Thread.sleep(2000);

        da.clickbtnAttachRentAgreement();
        Thread.sleep(2000);

        da.clickbtnAllowMediaAccess();
        Thread.sleep(2000);

        da.clickbtnScreenshot23();
        Thread.sleep(2000);

        da.clickbtnAttachRentReceipt();
        Thread.sleep(2000);

        try{
        da.clickbtnScreenshot23();
        Thread.sleep(2000);
        }
        catch(StaleElementReferenceException E)
        {
            WebElement btnScreenshot23 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[4]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView"));
            btnScreenshot23.click();
        }

        da.clickbtnSave();
        Thread.sleep(2000);
        

        if (driver.getPageSource().contains("Data updated successfully!")) {
            log.info("HRA Updated Successfully");
        } else {
            log.info("Error");
        }

        driver.navigate().back();
        Thread.sleep(2000);

        da.clickbtnHRA();
        Thread.sleep(2000);

        try {
            da.clickbtnViewFullDetails();
            Thread.sleep(2000);
            
        } catch (StaleElementReferenceException e) {

            WebElement btnViewFullDetails = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"View full details\"]"));
            btnViewFullDetails.click();

        }

        if (driver.getPageSource().contains("33,000 INR") && driver.getPageSource().contains("Titu Mama") && driver.getPageSource().contains("UDUDU8383N")) {

            log.info("Updated HRA is visible on the HRA details screen");

        } else {
            log.info("Error");
        }
        
    }
}
