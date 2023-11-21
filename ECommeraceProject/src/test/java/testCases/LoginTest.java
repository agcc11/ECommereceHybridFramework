package testCases;

import org.testng.annotations.Test;

import pageObjects.BaseClass;
import pageObjects.LoginPage;

public class LoginTest extends BaseClass{
	
	@Test
	public void LoginTestMethod()
	{
		driver.get(baseURL);
		LoginPage lp=new LoginPage(driver);
		lp.ClickOnHelloSignInBtn();
		lp.enterEmailMobile(EmailMobileId);
		lp.ClickOnContinueBtn();
		lp.enterPassword(Password);
		lp.ClickOnSignInBtn();
	}

}
