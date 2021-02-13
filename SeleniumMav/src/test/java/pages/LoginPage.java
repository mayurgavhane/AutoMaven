package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends Mainclass {
	
	
	By username = By.name("email");
	By password = By.name("passwd");
	By loginbutton = By.xpath("//*[@id=\"SubmitLogin\"]/span");

		//Create a constructor
		
	public LoginPage( WebDriver driver)
	{
		this.driver=driver;
				
	}
	
	public void typeusername()
	{
		driver.findElement(username).sendKeys("testuser@mailinator.com");
		
	}
	public void enterpassword()
	{
		driver.findElement(password).sendKeys("Password1");
	}
	
	
	public void clikloginbutton()
	{
		driver.findElement(loginbutton).click();
	}


}

