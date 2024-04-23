package GSF.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

import GSF.PageObjects.HomePage;
import GSF.PageObjects.Workout;
import GSF.PageObjects.log_in;
import GSF.Utility.ReadConfig;

public class GSF_Base {
	//"The driver is declared globally so that it can be accessed in the test cases."	
	protected static WebDriver driver;
	
	//Created reusable objects 
	HomePage hp;
	log_in login;
	Workout wo;

	//Fetching data from .properties file
	ReadConfig rd=new ReadConfig();
	public String email =rd.getEmail();
	public String pass=rd.getPass();
	public String ExpeText=rd.getExpectedText();
	public String ExpeText1=rd.getExpectedText1();
	public String exppdata=rd.getExpData();
	public String expdata1=rd.getExpData1();

	
	SoftAssert soft=new SoftAssert();
	
	@BeforeClass
	public void LaunchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
		
		ChromeOptions options=new ChromeOptions();
		driver=new ChromeDriver(options);
		
		options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
		options.addArguments("--remote-allow-origins=*");
		
		hp=new HomePage(driver);
		login=new log_in(driver);
		wo=new Workout(driver);
	
	}
	
	@BeforeMethod
	public void LaunchApplicationUnderTest() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.get("https://thegsf.co/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);

	}
	

	@AfterMethod
	public void minimizeBrowser() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.manage().window().minimize();
	}
	
	@AfterClass
	public void closeBrowser()
	{
		driver.close();
	}
}
