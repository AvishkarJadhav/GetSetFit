package GSF.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OurServices {
	
	@FindBy(linkText = "OUR SERVICES")private WebElement OurServicesHeader;
	
	@FindBy(xpath = "(//p[text()='view details'])[1]")private WebElement Intermediate;
	
	@FindBy(xpath = "(//p[text()='view details'])[2]")private WebElement Beginner;
	
	@FindBy(xpath = "(//p[text()='view details'])[3]")private WebElement PersonalTraining;
	
	@FindBy(xpath = "(//p[text()='view details'])[4]")private WebElement PersonalDiet;
	
	public OurServices(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void clickonOurServies() throws Exception
	{
		Thread.sleep(1000);

		OurServicesHeader.click();
	}
	
	public void clickonInterOS() throws Exception
	{
		Thread.sleep(1000);

		Intermediate.click();
	}
	
	public void clickonBeginnerOS() throws Exception
	{
		Thread.sleep(1000);

		Beginner.click();
	}
	
	public void clickOnPersoanlOS() throws Exception
	{
		Thread.sleep(1000);

		PersonalTraining.click();
	}
	
	public void clickonDiet() throws Exception
	{
		Thread.sleep(1000);

		PersonalDiet.click();
	}
	
	
	
}
