package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.Mainclass;

public class ApplicationLogin extends Mainclass{

	@BeforeMethod
	public void setUp() throws InterruptedException {
		initialization();
		System.out.println("Login Page Opened");

	}

	@Test
	public void loginTest() throws InterruptedException {
		LoginPage logn = new LoginPage(driver);

		Thread.sleep(2000);
		logn.typeusername();
		logn.enterpassword();
		logn.clikloginbutton();

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}

