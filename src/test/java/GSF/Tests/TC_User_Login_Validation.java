package GSF.Tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import GSF.Utility.Utility;
//@Listeners(listner.Listners.class)
public class TC_User_Login_Validation extends GSF_Base {
  @Test//(enabled = true, invocationCount = 2, timeOut = 1000)
  public void User_Validation() throws Exception {
	  
	  for(int i=1;i<=10;i++)
	  {
	  login.enterlogin(driver);
//	  String s=".com";
	  login.enteremail(Utility.readDataFromExcel(i, 3), driver);
	  
	  Thread.sleep(1000);
	  //for(int j=1;j<=9;j++)
	  //{
	  login.enterpassword(Utility.readDataFromExcel(i, 4), driver);
	  Thread.sleep(1000);
	  
	  login.clickOnLoginBt(driver);
	  Thread.sleep(1000);
	  
	  Thread.sleep(1000);
	  
	  wo.clickpreviousTab(driver);
	  
	  Thread.sleep(1000);
	  
	  wo.clickOnLogout();
	  
//	  String LSTosatmsg = driver.findElement(By.xpath("//div[contains(text(),'Login Succefully')]")).getText();
//	  System.out.println(LSTosatmsg);
//	  Thread.sleep(2000);
	  
//	  String WPToastmsg = driver.findElement(By.xpath("//div[contains(text(),'Wrong Password')]")).getText();
//	  System.out.println(WPToastmsg);
//	  Thread.sleep(2000);
	

//	  if(exppdata.equals(LSTosatmsg))
//	  {
//		  Thread.sleep(1000);
//		  wo.clickpreviousTab(driver);
//		  System.out.println("E2E");
//		  Thread.sleep(1000);
//		  wo.clickOnLogout();
//	  }
//	  else if(expdata1.equals(driver.findElement(By.xpath("//div[contains(text(),'Wrong Password')]")).getText()))
//	  {
//		 System.out.println("E2E2E");
//		 System.out.println("E2E");
//	  }
//	  Thread.sleep(2000);
	  
	  
	  
//	  Xpath for toast message //div[@class='toast-message']
	  
//	  Thread.sleep(1000);
//
//	  System.out.println(WPToastmsg);
//	  
//	  if(exppdata.equals(WPToastmsg)) 
//	  {
//		  System.out.println("String matched");
//	  }
//	  else
//	  {
//		  System.out.println("String does not match");
//	  }
	  
//	  
//	  System.out.println(WPToastmsg.getText());
	  
	  Thread.sleep(1000);
	  
//	  final String ActualText = driver.findElement(By.xpath("//span[contains(text(),'activities')]")).getText();
	  
//	  String ActText1 = driver.findElement(By.xpath("//h2[contains(text(),'your ')]")).getText();
	 
//	  System.out.println(ActualText);
	  
//	  WebElement JoinBt = driver.findElement(By.xpath("//a[text()='Join Now']"));
//	  
//	  WebDriverWait w=new WebDriverWait(driver, Duration.ofSeconds(30));
//	  
//	  w.until(ExpectedConditions.visibilityOf(JoinBt));
//	  Thread.sleep(2000);
	   
//	  Wait<WebDriver> w1 =new FluentWait<>(driver).withTimeout(Duration.ofSeconds(2)).pollingEvery(Duration.ofMillis(200)).ignoring(ElementNotInteractableException.class); 
//	  w1.until(d -> {JoinBt.isDisplayed();
//	  return true;});
//	  
//	  soft.assertEquals(ActualText, ExpeText);
//	  Thread.sleep(500);
	  
//  soft.assertEquals(ActText1, ExpeText1);
	  
//	  soft.assertAll();
	  
//	  Thread.sleep(1000);
	  }
//}
	  	  
//	  
//	  for(int i=1;i<=9;i++)
//	  {	 for(int j=1;j<=9;j++)
//		{
//	  login.enteremail(Utility.readDataFromExcel(i, 0));
//	  Thread.sleep(2000);
//	  
//	  login.enterpassword(Utility.readDataFromExcel(j, 1));
//		  }
//	  login.clickOnLoginBt();
//	  }
	  }
}

