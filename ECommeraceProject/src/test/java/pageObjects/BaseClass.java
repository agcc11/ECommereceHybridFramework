package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {

	public static String baseURL="https://www.amazon.in/";
	public static String EmailMobileId="9657202232";
	public static String Password="Aniket@11";
	public static WebDriver driver;
	
	
	@BeforeClass
	public void setupMethod()
	{
		driver=new ChromeDriver();
	}
	
	@AfterClass
	public void teardown()
	{
		driver.close();
		
	}
}
