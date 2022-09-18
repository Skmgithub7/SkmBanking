package Skm.TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import Skm.Base.BaseClass;
import Skm.PageObject.LoginPage;


public class TC1_LoginTesting extends BaseClass 
{
    
	@Test
	public void loginTest() throws IOException 
	{
		driver.get(baseURL);
		
	
		LoginPage sk = new LoginPage(driver); 
		sk.setuserName(username);
		
		sk.setpassWord(password);
		
		sk.clicksubmit();
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage")) 
		{
			Assert.assertTrue(true);
			logger.info("Open ture");
		}
		else 
		{   
			captureScreen(driver,"loginTest" );
			Assert.assertTrue(false);
			logger.info("Not open false");
		}	
	}
}