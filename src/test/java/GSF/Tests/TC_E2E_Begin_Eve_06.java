package GSF.Tests;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import GSF.Utility.Utility;

public class TC_E2E_Begin_Eve_06 extends GSF_Base {
  @Test
  public void Begin_Eve_06_User_Validation() throws EncryptedDocumentException, InterruptedException, IOException {
	  
 login.enterlogin(driver);
	  
	  login.enteremail(Utility.readDataFromExcel(4, 3), driver);
	  
	  login.enterpassword(Utility.readDataFromExcel(4, 4), driver);
	  
	  login.clickOnLoginBt(driver);
	  
	  wo.clickOnLoginButton();

  }
}
