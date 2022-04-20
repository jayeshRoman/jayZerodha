package Pages;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class DashboardPage extends TestBase {
	
	//object Repository
	@FindBy(xpath="//span[@class='nickname']") private WebElement nicknameText;
	@FindBy(xpath="//span[@class='user-id']") private WebElement userIdProfile;
	@FindBy(xpath="//h4[@class='username']") private WebElement fullnameText;
	@FindBy(xpath="//div[@class='email']") private WebElement emailIdText;
	@FindBy(xpath="(//button[@type='button'])[1]") private WebElement startInvestingBtn;
	@FindBy(xpath="(//input[@type='text'])[2]") private WebElement sharesTextBox;
	@FindBy(xpath="(//span[text()='TCS'])[2]")private WebElement TCSText;
	@FindBy(xpath="(//button[@type='button'])[4]") private WebElement buyBtn;
	@FindBy(xpath="(//input[@type='number'])[1]") private WebElement tcsQty;
	@FindBy(xpath="(//input[@type='number'])[2]") private WebElement tcsPrice;
	@FindBy(xpath="//button[@class='button-outline cancel']")private WebElement cancelBtn;
	@FindBy(xpath="(//button[@type='button'])[3]") private WebElement createGTTBtn;
	@FindBy(xpath="(//input[@type='number'])[1]") private WebElement tcsTriggerPrice;
	@FindBy(xpath="(//input[@type='number'])[3]") private WebElement qtyGTT;
	@FindBy(xpath="(//input[@type='number'])[4]") private WebElement gttPrice;
	
	public DashboardPage() throws IOException
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public String verifyNickname()
	{
		return nicknameText.getText();
	}
	
	public boolean verifyUserIdProfile()
	{
		return userIdProfile.isEnabled();
	}
	
	public String verifyEmailIdText()
	{
		return emailIdText.getText();
	}
	
	public boolean verifyStartInvestingBtn()
	{
		return startInvestingBtn.isEnabled();
	}
	
	public String verifyFullnameText()
	{
		return fullnameText.getText();
	}
	
	public void clickUserID()
	{
		userIdProfile.click();	
	}
	
	public void verifySharesBuyCancel() throws InterruptedException, EncryptedDocumentException, IOException
	{
		startInvestingBtn.click();
		Thread.sleep(800);
		sharesTextBox.sendKeys(Utility.Util.readExcel(0,0));
		Thread.sleep(800);
		TCSText.click();
		Thread.sleep(800);
		buyBtn.click();
		Thread.sleep(800);
		tcsQty.clear();
		Thread.sleep(800);
		tcsQty.sendKeys(Utility.Util.readExcel(1, 2));
		Thread.sleep(800);
		tcsPrice.clear();
		Thread.sleep(800);
		tcsPrice.sendKeys(Utility.Util.readExcel(1, 3));
		Thread.sleep(800);
		cancelBtn.click();
		Thread.sleep(800);
		
	}
	
	public void verifyGTTShare() throws InterruptedException, EncryptedDocumentException, IOException
	{
		startInvestingBtn.click();
		Thread.sleep(800);
		sharesTextBox.sendKeys(Utility.Util.readExcel(0,0));
		Thread.sleep(800);
		TCSText.click();
		Thread.sleep(800);
		createGTTBtn.click();
		Thread.sleep(800);
		tcsTriggerPrice.clear();
		Thread.sleep(800);
		tcsTriggerPrice.sendKeys(Utility.Util.readExcel(0, 1));
		Thread.sleep(800);
		qtyGTT.clear();
		Thread.sleep(800);
		qtyGTT.sendKeys(Utility.Util.readExcel(0, 2));
		Thread.sleep(800);
		gttPrice.clear();
		Thread.sleep(800);
		gttPrice.sendKeys(Utility.Util.readExcel(0, 3));
		Thread.sleep(1000);
		cancelBtn.click();
		Thread.sleep(1000);
		
		
		
	}


	
	
		
	
	
}
