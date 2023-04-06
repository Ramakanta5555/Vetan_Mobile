package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;

public class DeclarationDeductionPage {
    
    AppiumDriver ldriver;

    public DeclarationDeductionPage(AppiumDriver rdriver)
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

    @FindBy(xpath = "//android.widget.ImageView[@content-desc=\"Deduction\"]")
    @CacheLookup
    WebElement btnDeduction;

    public void clickbtnDeduction()
    {
        btnDeduction.click();
    }

    @FindBy(xpath = "//android.widget.ImageView[@content-desc=\"General\"]")
    @CacheLookup
    WebElement btnGeneral;

    public void clickbtnGeneral()
    {
        btnGeneral.click();
    }

    @FindBy(xpath = "//android.widget.ImageView[@content-desc=\"80C\n"
    +"Investment\"]")
    @CacheLookup
    WebElement btn80C;

    public void clickbtn80C()
    {
        btn80C.click();
    }

    @FindBy(xpath = "//android.widget.Button[@content-desc=\"Submit\"]")
    @CacheLookup
    WebElement btnSubmit;

    public void clickbtnSubmit()
    {
        btnSubmit.click();
    }

    @FindBy(xpath = "//android.view.View[@content-desc=\"Make a declaration\"]")
    @CacheLookup
    WebElement btnMakeADeclaration;

    public void clickbtnMakeADeclaration()
    {
        btnMakeADeclaration.click();
    }

    @FindBy(xpath = "//android.widget.Button[@content-desc=\"Continue\"]")
    @CacheLookup
    WebElement btnContinue;

    public void clickbtnContinue()
    {
        btnContinue.click();
    }

    @FindBy(xpath = "//android.widget.ImageView[@content-desc=\"5 Years of Fixed Deposit in Scheduled Bank\"]")
    @CacheLookup
    WebElement btnDocumentType;

    public void clickbtnDocumentType()
    {
        btnDocumentType.click();
    }

    @FindBy(xpath = "//android.view.View[@content-desc=\"Life Insurance Premium\"]")
    @CacheLookup
    WebElement btnLifeInsurancePremium;

    public void clickbtnLifeInsurancePremium()
    {
        btnLifeInsurancePremium.click();
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

    //Used to Closed the text/number pad of the phone
    @FindBy(xpath = "//android.view.View[@content-desc=\"New Declaration\"]")
    @CacheLookup
    WebElement btnBlank;

    public void clickbtnblank()
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

    @FindBy(xpath = "//android.widget.ImageView[@content-desc=\"View Declaration\"]")
    @CacheLookup
    WebElement btnViewDeclaration;

    public void clickbtnviewDeclaration()
    {
        btnViewDeclaration.click();
    }

    //SubmitProof

    @FindBy(xpath = "//android.view.View[@content-desc=\"Submit a proof\"]")
    @CacheLookup
    WebElement btnSubmitProof;

    public void clickbtnSubmitProof()
    {
        btnSubmitProof.click();
    }

    @FindBy(xpath = "//android.view.View[@content-desc=\"New Proof\"]")
    @CacheLookup
    WebElement btnBlank1;

    public void clickbtnBlank1()
    {
        btnBlank1.click();
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

    // @FindBy(xpath = "//android.widget.Button[@content-desc=\"Save\"]")
    // @CacheLookup
    // WebElement btnSave;

    // public void clickbtnSave()
    // {

    // }
    
    
}
