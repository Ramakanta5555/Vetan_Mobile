package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.AppiumDriver;

public class DashboardCTCComponentPage {
    
        AppiumDriver ldriver;
 	
        public DashboardCTCComponentPage(AppiumDriver driver)
        {
            ldriver = driver;
            PageFactory.initElements(driver, this);
        }


        @FindBy(xpath = "//android.widget.ImageView[@content-desc=\"View breakdown\"]")
        @CacheLookup
        WebElement btnViewBreakDown;

        public void clickbtnViewBreakDown()
        {
            btnViewBreakDown.click();
        }


        @FindBy(xpath = "//android.view.View[@content-desc=\"Show yearly breakdown\"]/android.widget.CheckBox")
        @CacheLookup
        WebElement btnShowSalaryBreakdown;

        public void clickbtnShowSalaryBreakdown()
        {
            btnShowSalaryBreakdown.click();
        }
    
}
