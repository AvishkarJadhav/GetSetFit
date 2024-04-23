package listner;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import GSF.Tests.GSF_Base;
import GSF.Utility.Utility;
import net.bytebuddy.utility.RandomString;

public class Listners extends GSF_Base implements ITestListener {
	
@Override
public void onTestSuccess(ITestResult result) {
	// TODO Auto-generated method stub
	try {
		String rts = RandomString.make(4);
		Utility.Screenshot1(driver, result.getName()+rts);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	Reporter.log("Test case "+result.getName()+" is passed.", true);

}

@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
	try {
		String rts = RandomString.make(4);
		Utility.Screenshot0(driver, result.getName()+rts);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	Reporter.log("Test case "+result.getName()+" is failed.", true);	}
}
