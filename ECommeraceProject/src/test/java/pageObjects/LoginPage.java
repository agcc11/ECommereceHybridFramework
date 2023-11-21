package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver ldriver;

	public LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	
	@FindBy(xpath="//*[@id=\"nav-link-accountList\"]")
	public WebElement HelloSignIn;
	
	@FindBy(xpath="//*[@id=\"ap_email\"]")
	public WebElement EmailMobile;
	
	@FindBy(xpath="//span[@id=\"continue\"]")
	public WebElement ContinueBtn;
	
	@FindBy(xpath="//*[@id=\"ap_password\"]")
	public WebElement Password;
	
	@FindBy(xpath="//*[@id=\"signInSubmit\"]")
	public WebElement SignInBtn;
	
	public void ClickOnHelloSignInBtn()
	{
		HelloSignIn.click();
	}
	
	public void enterEmailMobile(String email)
	{
		EmailMobile.sendKeys(email);
	}
	
	public void ClickOnContinueBtn()
	{
		ContinueBtn.click();
	}
	
	public void enterPassword(String password)
	{
		Password.sendKeys(password);
	}
	
	public void ClickOnSignInBtn()
	{
		SignInBtn.click();
	}
	
}
