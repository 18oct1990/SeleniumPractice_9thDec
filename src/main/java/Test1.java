
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test1 {
	
	@Test
	public void openURL() throws InterruptedException {
  
        // Set the system property first
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Amitkumar_Singh\\eclipse-workspace\\SeleniumProject\\src\\test\\resources\\chromedriver.exe");

        // Create the ChromeDriver instance
        WebDriver driver = new ChromeDriver();

        // Navigate to the URL
        String url = "http://testautomationpractice.blogspot.com/";
        driver.get(url);
        
        driver.findElement(By.id("name")).sendKeys("Amit");
       

        //Close the browser
        driver.quit();
    }
}
