package GSF.PageObjects;

import java.time.Duration;

import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class log_in {
	
	@FindBy(xpath = "(//li[@class='login '])[1]")private WebElement login;
	
	@FindBy(id = "email")private WebElement email;
	
	@FindBy(id = "password")private WebElement password;
	
	@FindBy(id = "exampleCheck1")private WebElement rememberme;
	
	@FindBy(id = "login_submit")private WebElement loginsubmit;
	
	@FindBy(id = "login_submit")private WebElement loginBt;
	
	@FindBy(xpath = "(//button[@type='button'])[1]")private WebElement close;
	
	
	public log_in(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enteremail(String mailID, WebDriver driver) throws InterruptedException
	{
		 Wait<WebDriver> w1 =new FluentWait<>(driver).withTimeout(Duration.ofSeconds(2)).pollingEvery(Duration.ofMillis(200)).ignoring(ElementNotInteractableException.class); 
	  	  w1.until(d -> {email.isDisplayed();
	  	  return true;});
	  	  Thread.sleep(1000);
		email.sendKeys(mailID);
	}
	
	public void enterpassword(String Pass, WebDriver driver) throws InterruptedException
	{
		 Wait<WebDriver> w1 =new FluentWait<>(driver).withTimeout(Duration.ofSeconds(2)).pollingEvery(Duration.ofMillis(200)).ignoring(ElementNotInteractableException.class); 
	  	  w1.until(d -> {password.isDisplayed();
	  	  return true;});
	  	  Thread.sleep(1000);
		password.sendKeys(Pass);
	}
	
	
	public void selectrememberme()
	{
		rememberme.click();
	}
	
	public void enterlogin(WebDriver driver) throws InterruptedException
	{
		//Thread.sleep(2000);
//		Wait<WebDriver> w1 =new FluentWait<>(driver).withTimeout(Duration.ofSeconds(2)).pollingEvery(Duration.ofMillis(200)).ignoring(ElementNotInteractableException.class); 
//		 w1.until(d -> {login.isDisplayed();
//		 return true;});
		 Wait<WebDriver> w1 =new FluentWait<>(driver).withTimeout(Duration.ofSeconds(2)).pollingEvery(Duration.ofMillis(200)).ignoring(ElementNotInteractableException.class); 
	  	  w1.until(d -> {login.isDisplayed();
	  	  return true;});
		login.click();
	}
	
	public void clickclose() throws InterruptedException
	{
		Thread.sleep(1000);
		close.click();
	}
	
	public void clickOnLoginBt(WebDriver driver) throws InterruptedException
	{
		Wait<WebDriver> w1 =new FluentWait<>(driver).withTimeout(Duration.ofSeconds(2)).pollingEvery(Duration.ofMillis(200)).ignoring(ElementNotInteractableException.class); 
	  	  w1.until(d -> {loginBt.isDisplayed();
	  	  return true;});
		loginBt.click();
	}
	
}
