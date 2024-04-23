package GSF.Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC_CrossBrowserTest_GSF {
	WebDriver driver;
  @Parameters ("BrowserName")
  @Test
  public void Browser(String bname) 
	  {
	  if(bname.equals("chrome"))
	  {
	  System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
	  ChromeOptions options=new ChromeOptions();
	  options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
	  options.addArguments("--remote-allow-origins=*");
	  driver= new ChromeDriver(options);
	  driver.manage().window().maximize();
	  
	  }
	  else if(bname.equals("firefox"))
	  {
	  System.setProperty("webdriver.gecko.driver", "./Drivers\\geckodriver.exe");
	  driver= new FirefoxDriver();
	  driver.manage().window().maximize();
	  }
	  else if(bname.equals("msedge"))
	  {
	  System.setProperty("webdriver.edge.driver", "./Drivers\\msedgedriver.exe");
	  driver= new EdgeDriver();
	  driver.manage().window().maximize();
	  }
	  driver.get("https://thegsf.co/");
	  }
	  

  
}
