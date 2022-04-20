package TestCases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;
import Pages.OrderPage;

public class OrderPageTest extends TestBase {

	public OrderPageTest() throws IOException 
	{
		super();
	}
	
	public OrderPage order;
	public LoginPage log;
	
	@BeforeMethod
	public void setup() throws IOException, InterruptedException
	{
		initialization();
		log = new LoginPage();
	    order = new OrderPage();
	    
	    log.loginZerodhaAccount();
	    Thread.sleep(800);
	    order.verifyOrderLink();
	 
	    order.verifyGTTLink();
	   
	    order.verifyNewGTTBtn();
	    
	    
	}
	
	
	@Test
	public void buyShareINFYTest() throws EncryptedDocumentException, IOException, InterruptedException
	{
		order.buyShareINFY();
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
