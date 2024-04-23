package GSF.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	Properties pro;
	
	public ReadConfig()
	{

		File src=new File("./Configuration/read.config.properties");
		
		try {
			FileInputStream fis=new FileInputStream(src);
			pro=new Properties();
			pro.load(fis);
		} catch (Exception e) {
			System.out.println("Exception is "+ e.getMessage());
		}
	}
	
	public String getEmail()
	{
		
		String Email = pro.getProperty("Email");
		return Email;
		
		
	}
	
	public String getPass()
	{
		String Pass=pro.getProperty("pass");
		return Pass;
	}
	
	public String getExpectedText()
	{
		String ExpText = pro.getProperty("ExpectedText");
		return ExpText;
	}
	
	public String getExpectedText1()
	{
		String ExpText1 = pro.getProperty("ExpectedText1");
		return ExpText1;
	}
	
	public String getExpData()
	{
		String Expdata = pro.getProperty("ExpData");
		return Expdata;
	}
	
	public String getExpData1()
	{
		String Expdata1 = pro.getProperty("ExpData1");
		return Expdata1;
	}
}
