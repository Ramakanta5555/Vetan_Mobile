package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;

public class DocumentViewPage {
    

    AppiumDriver ldriver;

    public DocumentViewPage(AppiumDriver rdriver)
    {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
    }

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView[3]")
    @CacheLookup
    WebElement btnDocument;

    public void clickbtnDocument()
    {
        btnDocument.click();
    }

    @FindBy(xpath = "//android.widget.ImageView[@content-desc=\"April 2023\n"
    		+ "Download\"]")
    @CacheLookup
    WebElement btnApril2023Download;

    public void clickbtnApril2023Download()
    {
        btnApril2023Download.click();
    }

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.TabHost/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/com.oplus.widget.OplusViewPager/com.android.internal.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.ImageView")
    @CacheLookup
    WebElement btnAdobe;

    public void clickbtnAdobe()
    {
        btnAdobe.click();
    }

    @FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Back\"]")
    @CacheLookup
    WebElement btnBackFromAdobe;

    public void clickbtnBackFromAdobe()
    {
        btnBackFromAdobe.click();
    }

    @FindBy(xpath = "//android.widget.ImageView[@content-desc=\"2023-24\"]")
    @CacheLookup
    WebElement btnFinancialYearFilter;

    public void clickbtnFinancialYearFilter()
    {
        btnFinancialYearFilter.click();
    }

    @FindBy(xpath = "//android.view.View[@content-desc=\"2022-23\"]")
    @CacheLookup
    WebElement btnFinancialYear202223;

    public void clickbtnFinancialYear202223()
    {
        btnFinancialYear202223.click();
    }

    @FindBy(xpath = "//android.widget.Button[@content-desc=\"Continue\"]")
    @CacheLookup
    WebElement btnContinue;

    public void clickbtnContinue()
    {
        btnContinue.click();
    }


    

  
}
