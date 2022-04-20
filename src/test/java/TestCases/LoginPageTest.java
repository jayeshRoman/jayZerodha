package TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;

public class LoginPageTest extends TestBase {
	
	public LoginPageTest() throws IOException 
	{
		super();
	}

	LoginPage log;
	@BeforeMethod
	public void preRequisits() throws IOException
	{
		initialization();
	    log = new LoginPage();
	}
	
	@Test
	public void validateLoginPageTitleTest()
		{
			String LoginPageTitle = log.validateLoginPageTitle();
			String ExpestedLoginPageTitle = "Kite - Zerodha's fast and elegant flagship trading platform";
			Assert.assertEquals(LoginPageTitle, ExpestedLoginPageTitle);
			Reporter.log("Title of login page = " + LoginPageTitle);
		}
	
	@Test (dependsOnMethods = "validateLoginPageTitleTest")
	public void validateKiteLogoTest()
	{
	   boolean value = log.validateKiteLogo();
		Assert.assertEquals(value, true );
		Reporter.log("is kitelogo displayed = " + value);
	}
	
	@Test (dependsOnMethods = "validateLoginPageTitleTest")
	public void validateZerodhaLogoTest()
	{
		boolean value = log.validateZerodhaLogo();
		Assert.assertEquals(value, true);
		Reporter.log("is Zerodha logo displayed = " + value);
	}
	
	@Test
	public void loginZerodhaAccountTest() throws InterruptedException
	{
		log.loginZerodhaAccount();
	}
	
	@AfterMethod
   public void exit(ITestResult it) throws IOException
   {
		if(ITestResult.FAILURE==it.getStatus())
		{
			Utility.Util.captureScreenshot(driver, it.getName());
		}
		driver.close();
   }
	

}
