package GSF.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Download {
	
	@FindBy(linkText = "download")private WebElement DownloadHeader;
	
	@FindBy(xpath = "//a[@href='https://apps.apple.com/us/app/gsf/id6455990055']")private WebElement App_Store;
	
	@FindBy(xpath = "//a[@href='https://playstore.com/us/app/gsf/id6455990055']")private WebElement Play_Store;

	public Download (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void clickonDownloadHeader()
	{
		DownloadHeader.click();
	}
	
	public void clickonAppStore()
	{
		App_Store.click();
	}
	
	public void clickonPlayStore()
	{
		Play_Store.click();
	}
	
}
