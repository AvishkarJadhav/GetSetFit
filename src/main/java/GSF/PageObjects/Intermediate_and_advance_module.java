package GSF.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Intermediate_and_advance_module {
	
	@FindBy(xpath = "//select[@class='form-select form-select-lg mb-3 batch']")private WebElement dropdownweek;
	
	@FindBy(xpath = "//select[@class='form-select form-select-lg mb-3']")private WebElement dropdowntime;
	
	@FindBy(id = "//a[@id='6_month_link']")private WebElement buy6monthh;
	
	@FindBy(id = "//a[@id='3_month_link']")private WebElement buy3month;
	
	@FindBy(id = "//a[@id='1_month_link']")private WebElement buy1month;

	@FindBy(xpath = "//i[@class='fa fa-minus']")private WebElement faqdrop;

    public Intermediate_and_advance_module(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }
    
    public void selectdropdownweek() throws Exception
    {
		Thread.sleep(1000);

    	Select scweek=new Select(buy6monthh);
    	scweek.selectByIndex(0);
    			
    }
    
    public void selectdropdowntime() throws Exception
    {
		Thread.sleep(1000);

    	Select sctime=new Select(dropdowntime);
    	sctime.selectByIndex(0);
    }
      
    public void clickbuy6monthh() throws Exception
    {
		Thread.sleep(1000);

    	buy6monthh.click();
    }
    
    public void clickbuy3month() throws Exception
    {
		Thread.sleep(1000);

    	buy3month.click();
    }
    
    public void clickbuy1month() throws Exception
    {
		Thread.sleep(1000);

    	buy1month.click();
    }
    
    public void clickfaqdrop() throws Exception
    {
    	faqdrop.click();
    	
    	Thread.sleep(1000);
    	
    	faqdrop.click();
    }
}



