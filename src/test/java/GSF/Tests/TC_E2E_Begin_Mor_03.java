package GSF.Tests;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import GSF.Utility.Utility;

public class TC_E2E_Begin_Mor_03 extends GSF_Base {
  @Test
  public void Begim_Mor_03_User_Validation() throws EncryptedDocumentException, InterruptedException, IOException {
	  
	  login.enterlogin(driver);
	  
	  //abhishekbhatt210@gmail.com
	  //pawan@yopmail.com
	  //vj.0093@outlook.com
	  login.enteremail("abhishekbhatt210@gmail.com", driver);
	  
	  //Abh@123
	  //Pawan@1234
	  //Vij@123
	  login.enterpassword("Abh@123", driver);
	  
	  Thread.sleep(1000);

	  login.clickOnLoginBt(driver);
	  
	  Thread.sleep(1000);
	  
//	  String WPToastmsg = driver.findElement(By.xpath("//div[contains(text(),'Wrong Password')]")).getText();
//	  String LSTosatmsg = driver.findElement(By.xpath("//div[contains(text(),'Login Succefully')]")).getText();
	  String YSHETosatmsg = driver.findElement(By.xpath("//div[contains(text(),'Your subscription has ended')]")).getText();

	  
	  System.out.println(YSHETosatmsg);
	  
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

//	  wo.clickOnLoginButton();
	  
	  
  }
}
