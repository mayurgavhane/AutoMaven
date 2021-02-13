package pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mainclass {

	
		public static WebDriver driver;
		public static Properties prop;
		
				
		public Mainclass() 
		{
			
			prop= new Properties();
			FileInputStream fin;
			try
			{
				fin= new FileInputStream("C:\\Users\\mgavhane\\eclipse-workspace\\SeleniumMav\\src\\test\\java\\config\\config.properties");
				
				prop.load(fin);
			
			}
			catch (FileNotFoundException e)
			{
				
				e.printStackTrace();
			}
			
			catch (IOException e)
			{
				e.printStackTrace();
			}
			
			
		}
		

		public static void initialization() throws InterruptedException
		
		{
			
					
			System.setProperty("webdriver.chrome.driver",prop.getProperty("Browser"));
			driver = new ChromeDriver();
			
			
			Thread.sleep(2000);
			driver.manage().window().maximize();
			
			
		    Thread.sleep(2000);
			driver.get(prop.getProperty("url"));
			driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();
			
			
		}
		
		
	}
