package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;

public class DeclarationAllowancesPage {
    
    AppiumDriver ldriver;

    public DeclarationAllowancesPage(AppiumDriver rdriver)
    {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
    }

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView[4]")
    @CacheLookup
    WebElement btnDeclartion;

    public void clickbtnDeclaration()
    {
        btnDeclartion.click();
    }

    @FindBy(xpath = "//android.widget.ImageView[@content-desc=\"Allowance\"]")
    @CacheLookup
    WebElement btnAllowances;

    public void clickbtnAllowances()
    {
        btnAllowances.click();
    }

    @FindBy(xpath = "//android.widget.ImageView[@content-desc=\"HRA\"]")
    @CacheLookup
    WebElement btnHRA;

    public void clickbtnHRA()
    {
        btnHRA.click();
    }

    @FindBy(xpath = "//android.widget.Button[@content-desc=\"View full details\"]")
    @CacheLookup
    WebElement btnViewFullDetails;

    public void clickbtnViewFullDetails()
    {
        btnViewFullDetails.click();
    }


    @FindBy(xpath = "//android.widget.Button[@content-desc=\"Edit\"]")
    @CacheLookup
    WebElement btnEdit;

    public void clickbtnEdit()
    {
        btnEdit.click();
    }

    @FindBy(xpath = "//android.view.View[@content-desc=\"HRA Declaration\"]/android.view.View/android.view.View/android.widget.EditText[1]")
    @CacheLookup
    WebElement txtHomeRent;

    public void clicktxtHomeRent()
    {
        txtHomeRent.click();
    }

    public void cleartxtHomeRent()
    {
        txtHomeRent.clear();
    }

    public void settxtHomeRent(String rent)
    {
        txtHomeRent.sendKeys(rent);
    }

    @FindBy(xpath = "//android.view.View[@content-desc=\"HRA Declaration\"]/android.view.View/android.view.View/android.widget.EditText[2]")
    @CacheLookup
    WebElement txtOwnerName;

    public void clicktxtOwnerName()
    {
        txtOwnerName.click();
    }

    public void cleartxtOwnerName()
    {
        txtOwnerName.clear();
    }

    public void settxtOwnerName(String oName)
    {
        txtOwnerName.sendKeys(oName);
    }

    @FindBy(xpath = "//android.view.View[@content-desc=\"HRA Declaration\"]/android.view.View/android.view.View/android.widget.EditText[3]")
    @CacheLookup
    WebElement txtPanOfTheOwner;

    public void clicktxtPanOfTheOwner()
    {
        txtPanOfTheOwner.click();
    }

    public void cleartxtPanOfTheOwner()
    {
        txtPanOfTheOwner.clear();
    }

    public void settxtPanOfTheOwner(String pan)
    {
        txtPanOfTheOwner.sendKeys(pan);
    }

    @FindBy(xpath = "//android.view.View[@content-desc=\"HRA Declaration\"]/android.view.View/android.view.View/android.view.View[1]")
    @CacheLookup
    WebElement btnBlank;

    public void clickbtnBlank()
    {
        btnBlank.click();
    }

    @FindBy(xpath = "(//android.widget.ImageView[@content-desc=\"Attach Document\"])[1]")
    @CacheLookup
    WebElement btnAttachRentAgreement;

    public void clickbtnAttachRentAgreement()
    {
        btnAttachRentAgreement.click();
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

    @FindBy(xpath = "//android.widget.ImageView[@content-desc=\"Attach Document\"]")
    @CacheLookup
    WebElement btnAttachRentReceipt;

    public void clickbtnAttachRentReceipt()
    {
        btnAttachRentReceipt.click();
    }

    @FindBy(xpath = "//android.widget.Button[@content-desc=\"Save\"]")
    @CacheLookup
    WebElement btnSave;

    public void clickbtnSave()
    {
        btnSave.click();
    }
}
