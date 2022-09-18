package Skm.Base;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import Skm.Utilities.ReadConfig;

public class BaseClass {
	
	ReadConfig readConfig = new ReadConfig();
	public String baseURL = readConfig.getApplicationURL();
	public String username = readConfig.getUsername();
	public String password = readConfig.getPassword();
	public static WebDriver driver;
	
	public static Logger logger;
	
	@Parameters("browser")
    @BeforeClass	
	public void setup(String br)  
	{
		//waits, Alert, 
		logger = LogManager.getLogger(BaseClass.class.getName());
		PropertyConfigurator.configure("log4j.properties");
		
		if(br.equals("chrome")) 
		{
		System.setProperty("webdriver.chrome.driver", readConfig.getChrome());
		driver = new ChromeDriver();
		}
		if(br.equals("firefox")) 
		{
		System.setProperty("webdriver.gecko.driver", readConfig.getMozilla());
		driver = new FirefoxDriver();
		}
		if(br.equals("ie")) 
		{
		System.setProperty("webdriver.ie.driver", readConfig.getIE());
		driver = new InternetExplorerDriver();
		}
		
	}
	@AfterClass  
	public void tearDown() 
	{
		driver.quit();  
	}
	public void captureScreen(WebDriver driver, String tname) throws IOException 
	{
	TakesScreenshot ts = (TakesScreenshot) driver;
	File s =ts.getScreenshotAs(OutputType.FILE);
	File t = new File (System.getProperty("user.dir")+"/ScreenShots/"+tname+".png");
	FileUtils.copyFile(s, t);
	System.out.println("screenshot taken");
}
}

