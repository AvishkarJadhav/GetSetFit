package GSF.Tests;

import org.testng.annotations.Test;
//@Listeners(listner.Listners.class)
public class TC002 extends GSF_Base {
  @Test
  public void ValidateLoginPage() throws InterruptedException {
	  
	  Thread.sleep(1000);
	  login.enterlogin(driver);
	  
	  login.enteremail(email, driver);
	  
	  login.enterpassword(pass, driver);
	  
	  login.selectrememberme();
	  
	  login.clickOnLoginBt(driver);
  }
}
