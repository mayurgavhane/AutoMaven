package com.practice.SeleniumMav;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class InputDataForLoop {

	public static void main(String[] args) throws Exception {
		
		File src=new File ("C:\\Users\\mgavhane\\Desktop\\TestData\\TestData.xlsx");
		
FileInputStream input=new FileInputStream(src);		

         XSSFWorkbook wb= new XSSFWorkbook (input);
         XSSFSheet sheet =wb.getSheet("Sheet1");
         
         int r=sheet.getLastRowNum();
         int c=sheet.getFirstRowNum();

         for (int i=0;i<=r;i++) {
        	 
        	String S= sheet.getRow(i).getCell(0).getStringCellValue();
        	
        	System.out.println(S);
         }
         for (int j=0;j<=c;j++) {
        	 String S1=sheet.getRow(0).getCell(1).getStringCellValue();
        	 System.out.println(S1);
        	 
         }
         
         

	}

}
