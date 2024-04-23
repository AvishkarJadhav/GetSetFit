package GSF.PageObjects;

import java.time.Duration;

import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;


public class HomePage {
	
	@FindBy (xpath = "(//a[@href='https://thegsf.co/Home'])[1]")private WebElement HomeHeader;
	
	@FindBy(xpath = "//p[@id='about-us-section']")private WebElement JoinCommunityBT;
	
	@FindBy(xpath = "(//p[text()='view details'])[1]")private WebElement Intermediate;
	
	@FindBy(xpath = "(//p[text()='view details'])[2]")private WebElement Beginner;
	
	@FindBy(xpath = "(//p[text()='view details'])[3]")private WebElement PersonalTraining;
	
	@FindBy(xpath = "(//p[text()='view details'])[4]")private WebElement PersonalDiet;
	
	@FindBy(xpath = "/html/body/section[7]/div/div/button[1]")private WebElement backwardarrow;
	
	@FindBy(xpath = "/html/body/section[7]/div/div/button[2]")private WebElement forwardarrow;
	
	@FindBy(xpath = "(//div[@class='icons'])[1]")private WebElement HoverIcons; //Loop from 1st to 8th icon
	
	@FindBy(xpath = "(//div[@class='mob-card-head'])[1]")private WebElement priyank;
	
	@FindBy(xpath = "(//div[@class='mob-card-head'])[2]")private WebElement Henal;

	@FindBy(xpath = "(//div[@class='mob-card-head'])[3]")private WebElement Mahima;

	@FindBy(xpath = "(//div[@class='mob-card-head'])[4]")private WebElement Hemali;

	@FindBy(xpath = "(//a[@href='https://thegsf.co/Home'])[4]")private WebElement footerLogo;
	
	@FindBy(xpath = "//a[@href='https://www.instagram.com/getsetfit/?hl=en']")private WebElement InstaLogo;
	
	@FindBy(xpath = "//a[@href='https://in.linkedin.com/company/getsetfit']")private WebElement LinkedInLogo;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void ClickOnHome() throws InterruptedException
	{
//		Thread.sleep(1000);
//		 Wait<WebDriver> w1 =new FluentWait<>(driver).withTimeout(Duration.ofSeconds(2)).pollingEvery(Duration.ofMillis(200)).ignoring(ElementNotInteractableException.class); 
//		 w1.until(d -> {HomeHeader.isDisplayed();
//		 return true;});
		HomeHeader.click();
	}
	
	public void validateVisibility() throws InterruptedException
	{
		Thread.sleep(1000);
		HomeHeader.isDisplayed();
		System.out.println(HomeHeader.isDisplayed());
	}
	public void clickOnJoinBT() throws InterruptedException
	{
		Thread.sleep(1000);
		JoinCommunityBT.click();
	}
	
	public void clickonIntermediate()
	{
		Intermediate.click();
	}
	
	public void clickonBeginner()
	{
		Beginner.click();
	}
	
	public void clickonpertra()
	{
		PersonalTraining.click();
	}
	
	public void clickonperdiet()
	{
		PersonalDiet.click();
	}
	
	public void clickonbackarr()
	{
		backwardarrow.click();
	}
	
	public void clickonforwarr()
	{
		forwardarrow.click();
	}
	
	public void hovico()
	{
		HoverIcons.click();
	}
	
	public void hoveronpriyank ()
	{
		priyank.click();
	}
	
	public void hoveronhenal ()
	{
		Henal.click();
	}

	public void hoveronmahima ()
	{
		Mahima.click();
	}
	
	public void hoveronhemali ()
	{
		Hemali.click();
	}

    public void homefooterlogo()
    {
    	footerLogo.click();
    }

    public void homeinstalogo()
    {
    	InstaLogo.click();
    }
    public void homelinklogo()
    {
    	LinkedInLogo.click();
    }
}
