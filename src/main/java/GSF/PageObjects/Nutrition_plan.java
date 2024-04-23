package GSF.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Nutrition_plan {
	
	@FindBy(linkText = "BUY")private WebElement butnutrtion;
	
	@FindBy(xpath = "//i[@class='fa fa-minus']")private WebElement faqnutrition;

	public Nutrition_plan(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickbutnutrtion() throws Exception
	{
		Thread.sleep(1000);
		butnutrtion.click();
	}
	
	public void clickfaqnutrition() throws Exception
	{
		
		faqnutrition.click();
		
		Thread.sleep(1000);
		
		faqnutrition.click();
	}
	
}
