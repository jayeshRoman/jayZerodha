package Pages;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class OrderPage extends TestBase {

	public OrderPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}

	//Object Repository
	@FindBy(xpath="//span[text()='Orders']") private WebElement ordersLink;
	@FindBy(xpath="//span[text()='GTT']") private WebElement GTTLink;
	@FindBy(xpath="//button[@type='button']") private WebElement newGTTBtn;
	@FindBy(xpath="(//input[@type='text'])[2]") private WebElement sharesTextBox;
	@FindBy(xpath="(//span[text()='INFY'])[2]") private WebElement InfyText;
	@FindBy(xpath="(//button[@type='button'])[2]") private WebElement createGttBtn;
	@FindBy(xpath="(//input[@type='number'])[1]") private WebElement infyTriggerPriceTextBox;
	@FindBy(xpath="(//input[@type='number'])[3]") private WebElement qtyGTTTextBox;
	@FindBy(xpath="(//input[@type='number'])[4]") private WebElement gttPriceTextBox;
	@FindBy(xpath="//button[@class='place button-blue']") private WebElement placeBtn;
	@FindBy(xpath="//td[@class='fill-timestamp']") private WebElement dateText;
	@FindBy(xpath="//span[@class='icon icon-ellipsis']") private WebElement optionsHiddenBtn;
	@FindBy(xpath="//span[@class='icon icon-times']") private WebElement hiddenDelete;
	@FindBy(xpath="(//button[@type='button'])[1]") private WebElement actualDelete;
	@FindBy(xpath="//button[@class='button-outline cancel']")private WebElement cancelBtn;
	
	public void verifyOrderLink() throws InterruptedException
	{
		ordersLink.click();
		Thread.sleep(800);
	}
	
	public void verifyGTTLink() throws InterruptedException
	{
		GTTLink.click();
		Thread.sleep(1000);

	}
	
	public void verifyNewGTTBtn() throws InterruptedException
	{
		newGTTBtn.click();
		Thread.sleep(1000);

	}
	
	public void buyShareINFY() throws EncryptedDocumentException, IOException, InterruptedException
	{
		sharesTextBox.sendKeys(Utility.Util.readExcel(1, 0));
		Thread.sleep(800);
		InfyText.click();
		Thread.sleep(800);
		createGttBtn.click();
		Thread.sleep(800);
		infyTriggerPriceTextBox.clear();
		Thread.sleep(800);
		infyTriggerPriceTextBox.sendKeys(Utility.Util.readExcel(1, 1));
		Thread.sleep(800);
		qtyGTTTextBox.clear();
		Thread.sleep(800);
		qtyGTTTextBox.sendKeys(Utility.Util.readExcel(2, 0));
		Thread.sleep(800);
		gttPriceTextBox.clear();
		Thread.sleep(800);
		gttPriceTextBox.sendKeys(Utility.Util.readExcel(2, 1));
		Thread.sleep(800);
	    placeBtn.click();
		Thread.sleep(800);
		dateText.click();
		Thread.sleep(800);
		
		Actions a = new Actions(driver);
		a.moveToElement(optionsHiddenBtn).click().build().perform();
		Thread.sleep(2000);
		a.moveToElement(hiddenDelete).click().build().perform();
		Thread.sleep(1000);
	
		actualDelete.click();
		Thread.sleep(1500);
		
	//	cancelBtn.click();
	
		
	}
	
	
	
	
	
	
	
	 
	
	
	
	
	
	
	
}
