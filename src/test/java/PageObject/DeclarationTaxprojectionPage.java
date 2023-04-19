package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;

public class DeclarationTaxprojectionPage {
    

    AppiumDriver ldriver;

    public DeclarationTaxprojectionPage(AppiumDriver rdriver)
    {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
    }

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView[4]")
    @CacheLookup
    WebElement btnDeclaration;

    public void  clickbtnDeclaration()
    {
        btnDeclaration.click();
    }

    @FindBy(xpath = "//android.widget.ImageView[@content-desc=\"Tax Projection\"]")
    @CacheLookup
    WebElement btnTaxProjection;

    public void clickbtnTaxProjection()
    {
        btnTaxProjection.click();
    }

    @FindBy(xpath = "//android.view.View[@content-desc=\"Tax Projection\"]/android.widget.ImageView[2]")
    @CacheLookup
    WebElement btnDownload;

    public void clickbtnDownload()
    {
        btnDownload.click();
    }

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.TabHost/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/com.oplus.widget.OplusViewPager/com.android.internal.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.ImageView")
    @CacheLookup
    WebElement btnAdobe;

    public void clickbtnAdobe()
    {
        btnAdobe.click();
    }



}
