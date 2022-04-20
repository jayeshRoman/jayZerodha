package Base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	
	public Properties prop;
	public static WebDriver driver;
	
	public TestBase() throws IOException {
	    prop = new Properties();
		FileInputStream file = new FileInputStream("C:\\Users\\jayesh\\eclipse-workspace\\zerodhaFramework\\Config\\Config1.properties");
		prop.load(file);
	}
	    	
	public void initialization() {
		String browserName = prop.getProperty("browser");
		if(browserName.equals("chrome")) 
		{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\jayesh\\eclipse-workspace\\zerodhaFramework\\chromedriver.exe");		
	 driver = new ChromeDriver(options);
	 driver.manage().window().maximize();
//	 System.out.println(prop.getProperty("URL"));
	 driver.get(prop.getProperty("URL"));
//	 driver.get("https://kite.zerodha.com/");
	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}
		
		else if(browserName.equals("firefox")) 
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\jayesh\\eclipse-workspace\\zerodhaFramework\\geckodriver.exe");
		    driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get(prop.getProperty("URL"));
			driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		}
}
}