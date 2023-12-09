package BaseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	public static WebDriver driver;
	
	public void invokeBrowser()
	{
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Amitkumar_Singh\\eclipse-workspace\\SeleniumProject\\src\\test\\resources\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
	}
	public void closeBrowser()
	{
		driver.close();
	}

}