package GSF.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Personal {
	
	@FindBy(linkText = "BUY")private WebElement buypersonal;
	
	@FindBy(xpath = "//i[@class='fa fa-minus']")private WebElement faqpersonal;
	
	public Personal(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickbuypersonal() throws Exception
	{
		Thread.sleep(1000);
		buypersonal.click();
	}
	
	public void clickfaqpersonal() throws Exception
	{
		Thread.sleep(1000);
		faqpersonal.click();
	}
	

}
