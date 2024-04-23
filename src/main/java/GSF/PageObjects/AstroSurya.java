package GSF.PageObjects;

import java.util.ArrayList;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class AstroSurya {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
		
		ChromeOptions options=new ChromeOptions();
		WebDriver driver=new ChromeDriver(options);
		
		options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
		options.addArguments("--remote-allow-origins=*");
		
		driver.navigate().to("https://astrosurya.in//");
		
		WebElement hourDropDown = driver.findElement(By.id("hourddl"));

		Select s1=new Select(hourDropDown);	
		
		s1.selectByIndex(5);
		
		
		ArrayList<String> contact=new ArrayList<String>();
		
		contact.add("Avi");
		contact.add("Ashish");
		contact.add("Ishwar");
		
		
		
		contact.add("Avi");
		contact.add("Ashish");
		contact.add("Ishwar");
		
		contact.add("Avi");
		contact.add("Ashish");
		contact.add("Ishwar");
		
		contact.add("Avi");
		contact.add("Ashish");
		contact.add("Ishwar");
		
		Iterator<String> itr=contact.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		
		}
	
	

}
