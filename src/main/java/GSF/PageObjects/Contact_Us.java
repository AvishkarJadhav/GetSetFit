package GSF.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Contact_Us {
	
	@FindBy(linkText = "contact us")private WebElement contactUsHeader;
	
	@FindBy(name = "full_name")private WebElement FullName;
	
	@FindBy(name = "email")private WebElement Classname;
	
	@FindBy(name = "subject")private WebElement Subject;
	
	@FindBy(name = "message")private WebElement Message;
	
	@FindBy(id = "contact_us_btn")private WebElement sendbutton;
	
	public Contact_Us(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
  
	public void clickoncontactus() throws Exception
	{
		Thread.sleep(1000);

		contactUsHeader.click();
	}
	
	public void enterfullname() throws Exception
	{
		Thread.sleep(1000);

		FullName.sendKeys("ishwar patekar");
	}
	
	public void enterclassname() throws Exception
	{
		Thread.sleep(1000);

		Classname.sendKeys("ssc");
	}
	
	public void entermessage() throws Exception
	{
		Thread.sleep(1000);

		Message.sendKeys("hello friends");
		
	}
	
	public void clickonsendbutton() throws Exception
	{
		Thread.sleep(1000);

		sendbutton.click();
	}
	
	
}
