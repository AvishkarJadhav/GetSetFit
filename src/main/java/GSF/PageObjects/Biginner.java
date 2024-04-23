package GSF.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Biginner {
	
	@FindBy(xpath = "//select[@class='form-select form-select-lg mb-3 batch']")private WebElement dropdownweekbig;
	
	@FindBy(xpath = "//select[@class='form-select form-select-lg mb-3']")private WebElement dropdowntimebig;
	
	@FindBy(xpath = "//a[@id='6_month_link']")private WebElement buy6monthbig;
	
	@FindBy(xpath = "//a[@id='3_month_link']")private WebElement buy3monthbig;

	@FindBy(xpath = "//a[@id='1_month_link']")private WebElement buy1monthbig;
	
	@FindBy(xpath = "//i[@class='fa fa-minus']")private WebElement faqdropdownbig;
	
	public Biginner(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	
	}
	
	public void selectdropdownweekbig() throws Exception
	{
		Thread.sleep(1000);
		
		Select scweekbig=new Select(dropdownweekbig);
		scweekbig.selectByIndex(1);
	}
	
	public void selectdropdowntimebig() throws Exception
	{
		Thread.sleep(1000);
		
		Select sctimebig=new Select(dropdowntimebig);
		sctimebig.selectByIndex(1);
		dropdowntimebig.click();
	}
	
	public void clickbuy6monthbig() throws Exception
	{
		Thread.sleep(1000);
		buy6monthbig.click();
	}
	
	public void clickbuy3monthbig() throws Exception
	{
		Thread.sleep(1000);
		buy3monthbig.click();
	}
	
	public void clickbuy1monthbig() throws Exception
	{
		Thread.sleep(1000);
		buy1monthbig.click();
	}
	
	public void clickfaqdropdownbig() throws Exception
	
	{
		
		faqdropdownbig.click();
		
		Thread.sleep(1000);
		
		faqdropdownbig.click();
	}
	
	}
	
	
	
	
	


