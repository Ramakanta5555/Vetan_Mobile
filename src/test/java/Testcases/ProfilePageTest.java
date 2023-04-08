package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import PageObject.ProfilePage;
import io.appium.java_client.AppiumBy;

public class ProfilePageTest extends BaseClass{
    
    @Test
    public void ProfilePagePersonalInfoTest() throws InterruptedException
    {
        test = extent.createTest("ProfilePagePersonalInfoTest").assignAuthor("Ramakanta Samal").assignCategory("Regression").assignDevice("chrome 109.0.5414.119");

        ProfilePage pp = new ProfilePage(driver);

        loginTest();
        Thread.sleep(2000);

        action_ClickOnPosition(126, 270);
        Thread.sleep(2000);

        pp.clickbtnPersonalInformation();
        Thread.sleep(2000);

        pp.clickbtnBasic();
        Thread.sleep(2000);

        pp.clickbtnEditData();
        Thread.sleep(2000);

        pp.clicktxtPhoneNumber();
        Thread.sleep(2000);

        pp.cleartxtPhoneNumber();
        Thread.sleep(2000);

        pp.settxtPhoneNumber("8393939393");
        Thread.sleep(2000);

        pp.clickbtnDateOfBirth();
        Thread.sleep(2000);

        pp.clickbtnDOBYear();
        Thread.sleep(2000);

        pp.clickbtn2017();
        Thread.sleep(2000);

        pp.clickbtnDate12();
        Thread.sleep(2000);

        pp.clickbtnDOBYearOk();
        Thread.sleep(2000);

        pp.clickbtnFemale();
        Thread.sleep(2000);

        action_ClickOnPosition(954, 1228);
        Thread.sleep(2000);

        pp.clickbtnMarried();
        Thread.sleep(2000);

        pp.clicktxtFathersName();
        Thread.sleep(2000);

        pp.cleartxtFathersName();
        Thread.sleep(2000);

        pp.settxtFathersName("Test Father");
        Thread.sleep(2000);

        pp.clickbtnFathersDOB();
        Thread.sleep(2000);

        pp.clickbtnSelectYear();
        Thread.sleep(2000);

        pp.clickbtn2010();
        Thread.sleep(2000);

        pp.clickbtnDate9();
        Thread.sleep(2000);

        pp.clickbtnFathersDOBOk();
        Thread.sleep(2000);

        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"+".scrollIntoView(new UiSelector()"+" .textContains(\"mother\"))"));

        pp.clicktxtMothersName();
        Thread.sleep(2000);

        pp.cleartxtMothersName();
        Thread.sleep(2000);

        pp.settxtMothersName("Test Mother");
        Thread.sleep(2000);

        pp.clickbtnMothersDateofBirth();
        Thread.sleep(2000);

        try {

        pp.clickbtnSelectYear();
        Thread.sleep(2000);

        pp.clickbtn2010();
        Thread.sleep(2000);

        pp.clickbtnDate9();
        Thread.sleep(2000);

        pp.clickbtnFathersDOBOk();
        Thread.sleep(2000);
            
        } catch (StaleElementReferenceException e) {
            
            WebElement btnSelectYear = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Select year\"]"));
            btnSelectYear.click();
            Thread.sleep(2000);

            WebElement btn2010 = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"2010\"]"));
            btn2010.click();
            Thread.sleep(2000);

            WebElement btnDate9 = driver.findElement(By.xpath("//android.view.View[@content-desc=\"9, Friday, April 9, 2010\"]"));
            btnDate9.click();
            Thread.sleep(2000);

            WebElement btnDOBOk = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"OK\"]"));
            btnDOBOk.click();
            Thread.sleep(2000);

        }

        pp.clickbtnSaveData();
        Thread.sleep(2000);

        test.pass("Profile Test Pass");


    }
}
