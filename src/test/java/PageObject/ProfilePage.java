package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;

public class ProfilePage {
    
    AppiumDriver ldriver;

    public ProfilePage(AppiumDriver rdriver)
    {
       ldriver = rdriver;
       PageFactory.initElements(rdriver, this);
    }

    @FindBy(xpath = "//android.widget.ImageView[@content-desc=\"Personal Information\"]")
    @CacheLookup
    WebElement btnPersonalInformation;

    public void clickbtnPersonalInformation()
    {
        btnPersonalInformation.click();
    }

    @FindBy(xpath = "//android.widget.ImageView[@content-desc=\"Basic\"]")
    @CacheLookup
    WebElement btnBasic;

    public void clickbtnBasic()
    {
        btnBasic.click();
    }

    @FindBy(xpath = "//android.widget.Button[@content-desc=\"Edit Data\"]")
    @CacheLookup
    WebElement btnEditData;

    public void clickbtnEditData()
    {
        btnEditData.click();
    }

    @FindBy(xpath = "//android.view.View[@content-desc=\"Gender\n"
		+ "Relationship\"]/android.widget.EditText")
    @CacheLookup
    WebElement txtPhoneNumber;

    public void clicktxtPhoneNumber()
    {
        txtPhoneNumber.click();
    }

    public void cleartxtPhoneNumber()
    {
        txtPhoneNumber.clear();
    }

    public void settxtPhoneNumber(String phone)
    {
        txtPhoneNumber.sendKeys(phone);
    }

    @FindBy(xpath = "//android.view.View[@content-desc=\"Gender\n"
		+ "Relationship\"]/android.widget.ImageView[1]")
    @CacheLookup
    WebElement btnDateOfBirth;

    public void clickbtnDateOfBirth()
    {
        btnDateOfBirth.click();
    }

    @FindBy(xpath = "//android.widget.Button[@content-desc=\"Select year\"]")
    @CacheLookup
    WebElement btnDOBYear;

    public void clickbtnDOBYear()
    {
        btnDOBYear.click();
    }

    @FindBy(xpath = "//android.view.View[@content-desc=\"SELECT DATE\n"
		+ "Sat, Apr 8\"]/android.widget.Button[3]")
    @CacheLookup
    WebElement btnYearBackward;

    public void clickbtnYearBackward()
    {
        btnYearBackward.click();
    }

    @FindBy(xpath = "//android.widget.Button[@content-desc=\"2017\"]")
    @CacheLookup
    WebElement btn2017;

    public void clickbtn2017()
    {
        btn2017.click();
    }

    @FindBy(xpath = "//android.view.View[@content-desc=\"12, Wednesday, April 12, 2017\"]")
    @CacheLookup
    WebElement btnDate12;

    public void clickbtnDate12()
    {
        btnDate12.click();
    }

    @FindBy(xpath = "//android.widget.Button[@content-desc=\"OK\"]")
    @CacheLookup
    WebElement btnDOBYearOk;

    public void clickbtnDOBYearOk()
    {
        btnDOBYearOk.click();
    }

    @FindBy(xpath = "//android.view.View[@content-desc=\"Male\"]/android.widget.RadioButton")
    @CacheLookup
    WebElement btnMale;

    public void clickbtnMale()
    {
        btnMale.click();
    }

    @FindBy(xpath = "//android.view.View[@content-desc=\"Female\"]/android.widget.RadioButton")
    @CacheLookup
    WebElement btnFemale;

    public void clickbtnFemale()
    {
        btnFemale.click();
    }

    @FindBy(xpath = "//android.view.View[@content-desc=\"Others\"]/android.widget.RadioButton")
    @CacheLookup
    WebElement btnOthers;

    public void clickbtnOthers()
    {
        btnOthers.click();
    }

    @FindBy(xpath = "//android.view.View[@content-desc=\"Married\"]")
    @CacheLookup
    WebElement btnMarried;

    public void clickbtnMarried()
    {
        btnMarried.click();
    }

    @FindBy(xpath = "//android.view.View[@content-desc=\"Unmarried\"]")
    @CacheLookup
    WebElement btnUnmarried;

    public void clickbtnUnmarried()
    {
        btnMarried.click();
    }

    @FindBy(xpath = "//android.view.View[@content-desc=\"Divorced\"]")
    @CacheLookup
    WebElement btnDivorced;

    public void clickbtnDivorced()
    {
        btnDivorced.click();
    }

    @FindBy(xpath = "//android.view.View[@content-desc=\"Parent Information\n"
    + "Father's information\n"
    + "Is your parent specially abled?\n"
    + "Mother's information\n"
    + "Is your parent specially abled?\"]/android.widget.EditText")
    @CacheLookup
    WebElement txtFathersName;

    public void clicktxtFathersName()
    {
        txtFathersName.click();
    }

    public void cleartxtFathersName()
    {
        txtFathersName.clear();
    }

    public void settxtFathersName(String father)
    {
        txtFathersName.sendKeys(father);
    }

    @FindBy(xpath = "//android.view.View[@content-desc=\"Parent Information\n"
    + "Father's information\n"
    + "Is your parent specially abled?\n"
    + "Mother's information\n"
    + "Is your parent specially abled?\"]/android.widget.ImageView[1]")
    @CacheLookup
    WebElement btnFathersDOB;

    public void clickbtnFathersDOB()
    {
        btnFathersDOB.click();
    }

    @FindBy(xpath = "//android.widget.Button[@content-desc=\"Select year\"]")
    @CacheLookup
    WebElement btnSelectYear;

    public void clickbtnSelectYear()
    {
        btnSelectYear.click();
    }

    @FindBy(xpath = "//android.widget.Button[@content-desc=\"2010\"]")
    @CacheLookup
    WebElement btn2010;

    public void clickbtn2010()
    {
        btn2010.click();
    }

    @FindBy(xpath = "//android.view.View[@content-desc=\"9, Friday, April 9, 2010\"]")
    @CacheLookup
    WebElement btnDate9;

    public void clickbtnDate9()
    {
        btnDate9.click();
    }

    @FindBy(xpath = "//android.widget.Button[@content-desc=\"OK\"]")
    @CacheLookup
    WebElement btnFathersDOBOk;

    public void clickbtnFathersDOBOk()
    {
        btnFathersDOBOk.click();
    }

    @FindBy(xpath = "//android.view.View[@content-desc=\"Parent Information\n"
            + "Father's information\n"
            + "Is your parent specially abled?\n"
            + "Mother's information\n"
            + "Is your parent specially abled?\"]/android.widget.EditText[2]")
    @CacheLookup
    WebElement txtMothersName;

    public void clicktxtMothersName()
    {
        txtMothersName.click();
    }

    public void cleartxtMothersName()
    {
        txtMothersName.clear();
    }

    public void settxtMothersName(String mother)
    {
        txtMothersName.sendKeys(mother);
    }

    @FindBy(xpath = "//android.view.View[@content-desc=\"Parent Information\n"
    + "Father's information\n"
    + "Is your parent specially abled?\n"
    + "Mother's information\n"
    + "Is your parent specially abled?\"]/android.widget.ImageView[2]")

    @CacheLookup
    WebElement btnMothersDateofBirth;

    public void clickbtnMothersDateofBirth()
    {
        btnMothersDateofBirth.click();
    }

    @FindBy(xpath = "//android.widget.Button[@content-desc=\"Save Data\"]")
    @CacheLookup
    WebElement btnSaveData;

    public void clickbtnSaveData()
    {
        btnSaveData.click();
    }


}
