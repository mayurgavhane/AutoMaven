package com.practice.SeleniumMav;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InputData {
	static WebDriver driver;

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mgavhane\\Documents\\Mayur Learning Notes\\Driver\\chromedriver.exe");
		
		 driver=new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();
		Thread.sleep(3000);
		
		File src=new File ("C:\\Users\\mgavhane\\Desktop\\TestData\\TestData.xlsx");
		
		FileInputStream input=new FileInputStream(src);		

		XSSFWorkbook wb= new XSSFWorkbook (input);
		XSSFSheet sheet =wb.getSheet("Sheet1");
		String S= sheet.getRow(0).getCell(0).getStringCellValue();
		System.out.println(S);
		String S1= sheet.getRow(0).getCell(1).getStringCellValue();
		
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(S);
		driver.findElement(By.xpath("//*[@id=\"passwd\"]")).sendKeys(S1);
        driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[2]/a")).click();
        
        String S2= sheet.getRow(1).getCell(0).getStringCellValue();
		System.out.println(S2);
		String S3= sheet.getRow(1).getCell(1).getStringCellValue();
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(S2);
		driver.findElement(By.xpath("//*[@id=\"passwd\"]")).sendKeys(S3);
        driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span")).click();
        Thread.sleep(2000);
        
        System.out.println("Invalid login credentials");
        
				
		driver.close();
		
		
		
		
		
	




	}

}
