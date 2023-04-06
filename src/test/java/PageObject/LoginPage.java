package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;

public class LoginPage {
	
	 AppiumDriver ldriver;
	    public LoginPage(AppiumDriver rdriver)
	    {
	        ldriver = rdriver;
	        PageFactory.initElements(rdriver, this);
	    }
	    
	    
	    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]")
	    @CacheLookup
	    WebElement txtUsername;
	    
	    public void clicktxtUsername()
	    {
	    	txtUsername.click();
	    }
	    
	    public void settxtUsername(String uname)
	    {
	    	txtUsername.sendKeys(uname);
	    }
	    
	    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]")
	    @CacheLookup
	    WebElement txtPassword;
	    
	    public void clicktxtPassword()
	    {
	    	txtPassword.click();
	    }
	    
	    public void settxtPassword(String pass)
	    {
	    	txtPassword.sendKeys(pass);
	    }
	    
	    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.ImageView")
	    @CacheLookup
	    WebElement btnMoolLogo;
	    
	    public void clickbtnMoolLogo()
	    {
	    	btnMoolLogo.click();
	    }
	    
	    @FindBy(xpath = "//android.widget.ImageView[@content-desc=\"Sign in\"]")
	    @CacheLookup
	    WebElement btnSignin;
	    
	    public void clickbtnSignin()
	    {
	    	btnSignin.click();
	    }
	    
	    
	    
	    
	    
	    
}		

