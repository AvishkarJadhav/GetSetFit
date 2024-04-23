package GSF.Tests;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import GSF.Utility.Utility;

public class TC_E2E_Intermediate_Mor_03 extends GSF_Base {
  @Test
  public void Intermediate_Mor_03_User_Validation() throws EncryptedDocumentException, InterruptedException, IOException {
	  login.enterlogin(driver);
	  
	  login.enteremail(Utility.readDataFromExcel(6, 3), driver);
	  
	  login.enterpassword(Utility.readDataFromExcel(6, 4), driver);
	  
	  login.clickOnLoginBt(driver);
  }
}
