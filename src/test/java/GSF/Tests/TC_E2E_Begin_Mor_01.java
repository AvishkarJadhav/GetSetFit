package GSF.Tests;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import GSF.Utility.Utility;

public class TC_E2E_Begin_Mor_01 extends GSF_Base {
  @Test
  public void Begim_Mor_01_User_Validation() throws InterruptedException, EncryptedDocumentException, IOException {
	  
	  login.enterlogin(driver);
	  
	  login.enteremail(Utility.readDataFromExcel(1, 3), driver);
	  
	  login.enterpassword(Utility.readDataFromExcel(1, 4), driver);
	  
	  login.clickOnLoginBt(driver);
	  
	  wo.clickOnLoginButton();
	  
	  
	 
  }
}
