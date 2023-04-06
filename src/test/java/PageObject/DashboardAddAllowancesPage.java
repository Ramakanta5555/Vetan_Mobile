package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.AppiumDriver;

public class DashboardAddAllowancesPage {
    
    AppiumDriver ldriver;
 	
    public DashboardAddAllowancesPage(AppiumDriver driver)
    {
        ldriver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//android.widget.ImageView[@content-desc=\"Add\n"
    		+ "Allowance\"]")
    @CacheLookup
    WebElement btnAddAllowances;

    public void clickbtnAddAllowances()
    {
        btnAddAllowances.click();
    }

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView[1]")
    @CacheLookup
    WebElement btnAllowancesType;

    public void clickbtnAllowancestype()
    {
        btnAllowancesType.click();
    }

    @FindBy(xpath = "//android.view.View[@content-desc=\"Dearness\"]")
    @CacheLookup
    WebElement btnDearnessAllowance;

    public void clickbtnDearnessAllowance()
    {
        btnDearnessAllowance.click();
    }

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText")
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

    @FindBy(xpath = "//android.view.View[@content-desc=\"Add new Allowance\"]")
    @CacheLookup
    WebElement btnBlank;
    
    public void clickbtnBlank()
    {
    	btnBlank.click();
    }

    @FindBy(xpath = "//android.widget.Button[@content-desc=\"Save\"]")
    @CacheLookup
    WebElement btnSave;

    public void clickbtnSave()
    {
        btnSave.click();
    }
}
