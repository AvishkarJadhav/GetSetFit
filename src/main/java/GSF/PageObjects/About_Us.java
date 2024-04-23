package GSF.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class About_Us  {
	
	@FindBy(linkText = "about us")private WebElement about_Us_Header;
	
	public About_Us(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void clickonAboutUs() throws Exception
	{
		Thread.sleep(1000);

		about_Us_Header.click();
	}
}
