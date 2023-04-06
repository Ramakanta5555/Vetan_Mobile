package Testcases;

import java.net.URL;

import org.testng.annotations.Test;

import PageObject.LoginPage;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LoginTest extends BaseClass{
	
	@Test
	public void loginTest() throws InterruptedException
	{
			
		
		 LoginPage lp = new LoginPage(driver);
		 	
		 
		 lp.clicktxtUsername();
		 Thread.sleep(2000);
		 
		 lp.settxtUsername("zify1aa");
		 Thread.sleep(2000);
		 
		 lp.clickbtnMoolLogo();
		 Thread.sleep(2000);
		 
		 lp.clicktxtPassword();
		 Thread.sleep(2000);
		 
		 lp.settxtPassword("Mool@2020");
		 Thread.sleep(2000);
		 
		 lp.clickbtnMoolLogo();
		 Thread.sleep(2000);
		 
		 lp.clickbtnSignin();
		 Thread.sleep(2000);
		 
		 if(driver.getPageSource().contains("Abhisek Mohanty")) {
			 
			
		 }
		 else
		 {
			 
		 }
		 
	}	 
}
