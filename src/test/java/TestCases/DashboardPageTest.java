package TestCases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.DashboardPage;
import Pages.LoginPage;

public class DashboardPageTest extends TestBase{
	
	public DashboardPageTest() throws IOException {
		super();
	}

	DashboardPage dash ;
	LoginPage log;
	@BeforeMethod
	public void preRequisitForDashBoard() throws InterruptedException, IOException
	{
		initialization();
	   dash = new DashboardPage();
	   log = new LoginPage();
	   log.loginZerodhaAccount();
	   dash.clickUserID();
	}
	
	@Test(enabled= true)
	public void verifyNicknameTest()
	{
		 String nickname = dash.verifyNickname();
		 Assert.assertEquals(nickname, "Ravindra");
		 Reporter.log("Nickname is present = " + nickname);
	}
	
	@Test(enabled= true)
	public void verifyUserIdProfileTest()
	{
		boolean value = dash.verifyUserIdProfile();
		Reporter.log("UserIdProfile is clickable = " + value);
	}
	
	@Test(enabled= true)
	public void verifyEmailIdTextTest()
	{
		String email = dash.verifyEmailIdText();
		Reporter.log("Email text is displayed and email is = " + email);
	}
	
	@Test(enabled= true)
	public void verifyStartInvestingBtnTest()
	{
		boolean value = dash.verifyStartInvestingBtn();
		Reporter.log("Start investing button is enabled = " + value);
	}
	
	@Test(enabled= true)
	public void verifyFullnameTextTest()
	{
	
		String fullname = dash.verifyFullnameText();
		Reporter.log("FUllname is = " +fullname);
	}
	
	@Test
	public void verifySharesBuyCancelTest() throws EncryptedDocumentException, InterruptedException, IOException
	{
		dash.verifySharesBuyCancel();
	}
	
	@Test
	public void verifyGTTShareTest() throws EncryptedDocumentException, InterruptedException, IOException
	{
		dash.verifyGTTShare();
	}
	
	@AfterMethod
	public void exit(ITestResult it) throws IOException
	{
		if(ITestResult.FAILURE == it.getStatus())
		{
			Utility.Util.captureScreenshot(driver, it.getName());
		}
		driver.close();
	}
	
	
	
	
	
	
	
	
	
}
