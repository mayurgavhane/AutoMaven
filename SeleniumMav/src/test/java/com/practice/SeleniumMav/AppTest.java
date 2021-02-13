package com.practice.SeleniumMav;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AppTest {
	
	WebDriver driver;
	
	@BeforeMethod
	public void InitiateTest() {
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mgavhane\\Documents\\Mayur Learning Notes\\Driver\\chromedriver.exe");
		
		 driver=new ChromeDriver();
		
		
		driver.manage().window().maximize();
	}
	
	@Test
	public void ActualTest() throws InterruptedException {
		driver.get("https://www.rediff.com");
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/a[2]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/ul/li[5]/a")).click();
		Thread.sleep(2000);
		WebElement T= driver.findElement(By.xpath("//*[@id=\"marketNews\"]/div[5]/div/p/a"));
		String s=T.getText();
		System.out.println(s);
		
	}
		
	@AfterMethod
		public void Closure() {
			driver.close();
			
		}
		
						
		
		
	
	
}
    