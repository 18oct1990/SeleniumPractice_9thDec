package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VoluntarySignUp {
	
		WebDriver driver;
		
		public VoluntarySignUp(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver,this);
			
		}
		
		@FindBy(id="name")
		WebElement Name;
		
		
		public void enterName(String name)
		{
		
			Name.sendKeys(name);
			
		}


		
		
		
		
	}