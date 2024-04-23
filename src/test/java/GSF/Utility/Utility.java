package GSF.Utility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

import net.bytebuddy.utility.RandomString;


public class Utility {
	
	/*Commonly used methods
	1.Read data from Excel
	2.ScreenShot
	3.Wait
	4.Scroll into view
	*/
	
	// 1.Read data from Excel

	public static String readDataFromExcel(int row, int cell) throws EncryptedDocumentException, IOException
	{
		
		//Real users
//		File myFile=new File("D:\\GSF - GetSetFit\\CSV\\Test 1 v1 S30.xlsx");
		
		//Demo users
		File myFile=new File("D:\\GSF - GetSetFit\\CSV\\Format.xlsx");

		String Value = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(row).getCell(cell).getStringCellValue();

		
		
//		String Value = WorkbookFactory.create(myFile).getSheet("BeginMor 1").getRow(row).getCell(cell).getStringCellValue();

//		String Value = WorkbookFactory.create(myFile).getSheet("BeginEve 1").getRow(row).getCell(cell).getStringCellValue();

//		String Value = WorkbookFactory.create(myFile).getSheet("StrongMor 1").getRow(row).getCell(cell).getStringCellValue();
		
//		String Value = WorkbookFactory.create(myFile).getSheet("StrongEve 1").getRow(row).getCell(cell).getStringCellValue();
		
//		String Value = WorkbookFactory.create(myFile).getSheet("GSF Exclusive").getRow(row).getCell(cell).getStringCellValue();


		Reporter.log("Fetching data from excel sheet");
		
		return Value;
	}
	
	//Screenshot
	
	public static void Screenshot1(WebDriver driver, String ScreenshotName) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String rts = RandomString.make(4);
		File Dest=new File("./Screenshots\\Pass_Test_Screenshots\\"+ScreenshotName+""+rts+".png");
		
		FileHandler.copy(src, Dest);
		
		Reporter.log("Taking screenshot", true);
	}
	
	public static void Screenshot0(WebDriver driver, String ScreenshotName) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String rts = RandomString.make(4);
		File Dest=new File("./Screenshots\\Failed_test_Screenshots\\"+ScreenshotName+""+rts+".png");
		
		FileHandler.copy(src, Dest);
		
		Reporter.log("Taking screenshot", true);
	}
	
	//Wait
	
	public static void Wait(WebDriver driver, int waitTime)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(waitTime));
		Reporter.log("Waiting for "+waitTime+"ms",true);
		
		
	}
	
	// 4.Scroll into view

	public static void ScrollIntoView(WebDriver driver, WebElement element)
	{
		Wait(driver, 500);
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)", element);
		Reporter.log("Scrolling into view", true);
	}
}
