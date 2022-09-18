package Skm.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver ldriver;
	
	public LoginPage (WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
		@FindBy (name = "uid")
		WebElement userName;
		
		@FindBy (name = "password")
		WebElement passWord; 
		
		@FindBy (name = "btnLogin")
		WebElement bttnLogin; 
		
		
		public void setuserName(String uname)
		{
			userName.sendKeys(uname);
		}
		
		public void setpassWord (String pword) 
		{
			passWord.sendKeys(pword);
		}
		
		public void clicksubmit()
		{
			bttnLogin.click();
		}
}

