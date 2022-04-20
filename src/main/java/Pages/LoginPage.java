package Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class LoginPage extends TestBase {
	
	//object Repository
	@FindBy(xpath="//input[@id='userid']") private WebElement userIdTextbox;
	@FindBy(xpath="//input[@id='password']") private WebElement passwordTextbox;
	@FindBy(xpath="//button[@type='submit']") private WebElement submitBtn;
	@FindBy(xpath="//img[@alt='Kite']") private WebElement kiteLogo;
	@FindBy(xpath="//img[@alt='Zerodha']") private WebElement zerodhaLogo;
	@FindBy(xpath="//input[@type='password']") private WebElement pinTextbox;
	@FindBy(xpath="//button[@type='submit']") private WebElement continueBtn;
	
	public LoginPage() throws IOException 
	{
		super();
		PageFactory.initElements(driver, this);
	}
	
	public String validateLoginPageTitle()
	{
	return driver.getTitle();
	}
	
	public boolean validateKiteLogo()
	{
		return kiteLogo.isDisplayed();
	}
	
	public boolean validateZerodhaLogo()
	{
		  return zerodhaLogo.isDisplayed();
	}
	
	
	public void loginZerodhaAccount() throws InterruptedException
	{
		userIdTextbox.sendKeys(prop.getProperty("userID"));
		passwordTextbox.sendKeys(prop.getProperty("password"));
		submitBtn.click();
		Thread.sleep(3000);
		pinTextbox.sendKeys(prop.getProperty("pin"));
		continueBtn.click();
		Thread.sleep(2000);
		
		
	}
	
	
	
	
	
	
	

}
