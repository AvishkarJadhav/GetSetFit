package GSF.PageObjects;

import java.time.Duration;

import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import net.bytebuddy.asm.MemberSubstitution.FieldValue;

public class Workout {
	
	@FindBy(linkText = "workout")private WebElement workoutHeader;
	
	@FindBy(id = "live-tab")private WebElement liveTab;
	
	@FindBy(id = "previous-tab")private WebElement previousTab;
	
	@FindBy(xpath = "//button[@class='accordion-button collapsed']")private WebElement previousoptionstab;
	
	@FindBy(xpath = "//i[@class='fa-solid fa-play']")private WebElement weekvideo;
	
	@FindBy(xpath  = "(//a[@href='https://thegsf.co/logout'])[1]")private WebElement logoutBt;
	
	@FindBy(linkText  = "Join Now")private WebElement JoinButton;



    public Workout(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }

    public void clickworkoutHeader() throws InterruptedException
    {
    	Thread.sleep(1000);
    	workoutHeader.click();
    }

    public void clickliveTab() throws Exception

    {
    	Thread.sleep(1000);
    	liveTab.click();
    }
    
    public void clickpreviousTab(WebDriver driver) throws Exception
    {
  	  Wait<WebDriver> w1 =new FluentWait<>(driver).withTimeout(Duration.ofSeconds(2)).pollingEvery(Duration.ofMillis(200)).ignoring(ElementNotInteractableException.class); 
  	  w1.until(d -> {previousTab.isDisplayed();
  	  return true;});
    	previousTab.click();
    }
    
    public void clickpreviousoptionstab() throws Exception
    {
    	Thread.sleep(1000);
    	previousoptionstab.click();
    }

    public void clickweekvideo() throws Exception
    {
    	Thread.sleep(1000);
    	weekvideo.click();
    }
    
    public void clickOnLogout() throws InterruptedException
    {
    	Thread.sleep(1000);
    	logoutBt.click();
    }
    
    public void clickOnLoginButton() throws InterruptedException
    {
    	Thread.sleep(1000);
    	JoinButton.click();
    }
}
