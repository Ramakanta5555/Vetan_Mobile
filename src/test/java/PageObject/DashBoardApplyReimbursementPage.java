package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;

public class DashBoardApplyReimbursementPage {
	
	
	AppiumDriver ldriver;
 	
    public DashBoardApplyReimbursementPage(AppiumDriver rdriver)
    {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
    }
    
    @FindBy(xpath = "//android.widget.ImageView[@content-desc=\"Add\n"
    		+ "Reimbursement\"]")
    @CacheLookup
    WebElement btnAddReimbursement;
    
    public void clickbtnAddReimbursement()
    {
    	btnAddReimbursement.click();
    }
    
    @FindBy(xpath = "//android.widget.Button[@content-desc=\"Reimbursement type\"]")
    @CacheLookup
    WebElement btnReimbursementType;
    
    public void clickbtnReimbursementType()
    {
    	btnReimbursementType.click();
    }
    
    @FindBy(xpath = "//android.view.View[@content-desc=\"Travel Reimbursement\"]")
    @CacheLookup
    WebElement btnTravelReimbursement;
    
    public void clickbtnTravelReimbursement()
    {
    	btnTravelReimbursement.click();
    }
    
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.ImageView")
    @CacheLookup
    WebElement btnCalender;
    
    public void clickbtnCalender()
    {
    	btnCalender.click();
    }
    
    @FindBy(xpath = "//android.view.View[@content-desc=\"2, Sunday, April 2, 2023\"]")
    @CacheLookup
    WebElement btnApril2;
    
    public void clickbtnApril2()
    {
    	btnApril2.click();
    }
    
    @FindBy(xpath = "//android.widget.Button[@content-desc=\"OK\"]")
    @CacheLookup
    WebElement btnDateOk;
    
    public void clickbtnDateOk()
    {
    	btnDateOk.click();
    }
    
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.EditText[1]")
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
    
    @FindBy(xpath = "//android.view.View[@content-desc=\"Create Reimbursement\"]")
    @CacheLookup
    WebElement btnBlank;
    
    public void clickbtnBlank()
    {
    	btnBlank.click();
    }
    
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.EditText[2]")
    @CacheLookup
    WebElement txtAmount;
    
    public void clicktxtAmount()
    {
    	txtAmount.click();
    }
    
    public void settxtAmount(String amount)
    {
    	txtAmount.sendKeys(amount);
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
    WebElement btnScreenshot23;
    
    public void clickbtnScreenshot23()
    {
    	btnScreenshot23.click();
    }
    
    @FindBy(xpath = "//android.widget.Button[@content-desc=\"Save\"]")
    @CacheLookup
    WebElement btnSave;
    
    public void clickbtnsSave()
    {
    	btnSave.click();
    }
    
    
    
    
    
    
    
    
    
    
}
