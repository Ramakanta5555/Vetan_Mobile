package Testcases;

import org.testng.annotations.Test;

import PageObject.DashboardCTCComponentPage;
import io.appium.java_client.AppiumBy;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TC_DashboardCTCComponentTest_001 extends BaseClass {
    
    @Test
    public void DashboardCTCComponentTest() throws InterruptedException
    {

        DashboardCTCComponentPage dc = new DashboardCTCComponentPage(driver);
        
        loginTest();
        Thread.sleep(2000);


        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"+".scrollIntoView(new UiSelector()"+" .xpath(\"" + "//android.widget.ImageView[@content-desc=\"View breakdown\"]" + "\"))")).click();
            
        // driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"View breakdown\"]")).click();

        // WebElement listitem =  driver.findElement ( AppiumBy.androidUIAutomator( "new Uiscrollable(new Uiselector().clickable(true)).scrollIntoView("+ "new Uiselector().description(\"View breakdown\"));")); 
                        

        dc.clickbtnViewBreakDown();
        Thread.sleep(2000);   

        dc.clickbtnShowSalaryBreakdown();
        Thread.sleep(2000);
    }
}
