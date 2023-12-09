package TestCases;

import org.testng.annotations.Test;

import PageObjectModel.VoluntarySignUp;
import BaseClass.BaseClass;

public class TC_01_Signup extends BaseClass {
	
	@Test
	public void signUp() throws InterruptedException
	{

		TC_01_Signup su=new TC_01_Signup();
		VoluntarySignUp vsu = new VoluntarySignUp(driver);
		su.invokeBrowser();
		vsu.enterName("Amit");
		Thread.sleep(5000);
		su.closeBrowser();
		

	}
}