package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;

public class AttendanceAndLeavePage {
    
    AppiumDriver ldriver;

    public AttendanceAndLeavePage(AppiumDriver rdriver)
    {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
    }

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView[5]")
    @CacheLookup
    WebElement btnAttendanceandLeave;

    public void clickbtnAttendanceandLeave()
    {
        btnAttendanceandLeave.click();
    }

    @FindBy(xpath = "///android.view.View[@content-desc=\"Attendance\n"
    + "Tab 1 of 2\"]")
    @CacheLookup
    WebElement btnAttendance;

    public void clickbtnAttendance()
    {
        btnAttendance.click();
    }

    @FindBy(xpath = "//android.view.View[@content-desc=\"Attendance and leave\"]/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.ImageView[2]")
    @CacheLookup
    WebElement btnBackwardToCalender;

    public void clickbtnBackwardToCalender()
    {
        btnBackwardToCalender.click();
    }

    @FindBy(xpath = "//android.view.View[@content-desc=\"Attendance and leave\"]/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.ImageView[3]")
    @CacheLookup
    WebElement btnForwardToCalender;

    public void clickbtnForwardToCalender()
    {
        btnForwardToCalender.click();
    }


    @FindBy(xpath = "//android.view.View[@content-desc=\"Leave\n"
    + "Tab 2 of 2\"]")
    @CacheLookup
    WebElement btnLeave;

    public void clickbtnLeave()
    {
        btnLeave.click();
    }

    @FindBy(xpath = "//android.view.View[@content-desc=\"Filter\"]/android.widget.Button")
    @CacheLookup
    WebElement btnAddLeave;

    public void clickbtnAddleave()
    {
        btnAddLeave.click();
    }

    @FindBy(xpath = "//android.widget.Button[@content-desc=\"Type of leave\"]")
	    @CacheLookup
	    WebElement btnTypeOfLeave;
	    
	    public void clickbtnTypeOfLeave()
	    {
	    	btnTypeOfLeave.click();
	    }
	    
	    @FindBy(xpath = "//android.view.View[@content-desc=\"Test - 57.0 days\"]")
	    @CacheLookup
	    WebElement btnTestLeave;
	    
	    public void clickbtnTestLeave()
	    {
	    	btnTestLeave.click();
	    }
	    
	    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.ImageView")
	    @CacheLookup
	    WebElement btnCalender;
	    
	    public void clickbtnCalender()
	    {
	    	btnCalender.click();
	    }
	    
	    @FindBy(xpath = "//android.view.View[@content-desc=\"Tue, 11 April 2023\"]")
	    @CacheLookup
	    WebElement btnDate11;
	    
	    public void clickbtnDate11()
	    {
	    	btnDate11.click();
	    }
	    
	    @FindBy(xpath = "//android.view.View[@content-desc=\"Wed, 12 April 2023\"]")
	    @CacheLookup
	    WebElement btnDate12;
	    
	    public void clickbtnDate12()
	    {
	    	btnDate11.click();
	    }
	    
	    @FindBy(xpath = "//android.widget.Button[@content-desc=\"Confirm\"]")
	    @CacheLookup
	    WebElement btnDateConfirm;
	    
	    public void clickbtnDateConfirm()
	    {
	    	btnDateConfirm.click();
	    }
	    
	    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.EditText")
	    @CacheLookup
	    WebElement txtReason;
	    
	    public void clicktxtReason()
	    {
	    	txtReason.click();
	    }
	    
	    public void settxtReason(String reason)
	    {
	    	txtReason.sendKeys(reason);
	    }
	    
	    @FindBy(xpath = "//android.widget.ImageView[@content-desc=\"Attach Document\"]")
	    @CacheLookup
	    WebElement btnAttachDocument;
	    
	    public void clickbtnAttachDocument()
	    {
	    	btnAttachDocument.click();
	    }
	    
	    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Button[1]")
	    @CacheLookup
	    WebElement btnAllowMediaAccess;
	    
	    public void clickbtnAllowMediaAccess()
	    {
	    	btnAllowMediaAccess.click();
	    }
	    
	    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[4]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView")
	    @CacheLookup 
	    WebElement btnScreenShot2023;
	    
	    public void clickbtnScreenShot2023()
	    {
	    	btnScreenShot2023.click();
	    }
	    
	    @FindBy(xpath = "//android.widget.Button[@content-desc=\"Apply Leave\"]")
	    @CacheLookup
	    WebElement btnApplyLeave;
	    
	    public void clickbtnApplyLeave()
	    {
	    	btnApplyLeave.click();
	    }






}

