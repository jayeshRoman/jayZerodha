package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


public class Util {
	
	public static String readExcel(int row, int col) throws EncryptedDocumentException, IOException
	{
		FileInputStream f = new FileInputStream("C:\\Users\\jayesh\\eclipse-workspace\\zerodhaFramework\\TestData\\Zerodha.xlsx");
	    Sheet excelSheet = WorkbookFactory.create(f).getSheet("Sheet1");
	    return excelSheet.getRow(row).getCell(col).getStringCellValue();
	}

	public static void captureScreenshot(WebDriver driver, String name) throws IOException
	{
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\jayesh\\eclipse-workspace\\zerodhaFramework\\Screenshots\\" + name + ".jpeg");
	    org.openqa.selenium.io.FileHandler.copy(source, dest);
	
	}
}

