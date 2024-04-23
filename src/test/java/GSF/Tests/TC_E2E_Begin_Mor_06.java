package GSF.Tests;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import GSF.Utility.Utility;

public class TC_E2E_Begin_Mor_06 extends GSF_Base {
  @Test
  public void Begim_Mor_06_User_Validation() throws InterruptedException, EncryptedDocumentException, IOException {
	  
	  login.enterlogin(driver);
	  
	  login.enteremail(Utility.readDataFromExcel(3, 3), driver);
	  
	  login.enterpassword(Utility.readDataFromExcel(3, 4), driver);
	  
	  login.clickOnLoginBt(driver);
  }
}
