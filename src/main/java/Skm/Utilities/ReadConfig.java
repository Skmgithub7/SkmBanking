package Skm.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	Properties pro;
	
	public ReadConfig() 
	{
		File src = new File ("./Configuration/Config.properties");
		
		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
			} catch (Exception e) {
				System.out.println("Exception" + e.getMessage());
			}
	}
     public String getApplicationURL() 
     {
    	 String url=pro.getProperty("BaseURL");
		return url;
     }
     
     public String getUsername() 
     {
    	 String username=pro.getProperty("Username");
		return username;
     }
     
     public String getPassword() 
     {
    	 String password=pro.getProperty("Password");
		return password;
    	 
     }
     public String getChrome() 
     {
    	 String Chrome=pro.getProperty("ChromePath");
		return Chrome;
     }
     public String getIE() 
     {
    	 String IE=pro.getProperty("IEPath");
		return IE;
     }
     public String getMozilla() 
     {
    	 String Mozilla=pro.getProperty("MozillaPath");
 		return Mozilla ; 
     }
}
