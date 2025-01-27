package com.javaconcepts.read_write_excel;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReadWrireRunner {

	public String ReadExcel(String sheetName, int rNum, int cNum) {
		String data = "";

		try {
			FileInputStream fis = new FileInputStream("C:\\Spring\\read-write-excel\\src\\main\\resources\\UserDetails.xlsx");
			
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sheet = wb.getSheet(sheetName);
			Row row = sheet.getRow(rNum);
			Cell cell = row.getCell(cNum);
			data = cell.getStringCellValue();
			
			System.out.println(data);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return data;

	}
	
	public void WriteExcel(String sheetName, int rNum, int cNum,String DATA) {
		

		try {
			FileInputStream fis = new FileInputStream("C:\\Spring\\read-write-excel\\src\\main\\resources\\UserDetails.xlsx");
			
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sheet = wb.getSheet(sheetName);
			Row r= sheet.getRow(rNum);
			
			//System.out.println("row no is" + row);
			
					
			Cell c= r.createCell(cNum);

		     c.setCellValue(DATA);
		     
		    System.out.println (DATA);
			
			System.out.println("cell is " +cNum);
			
			     
			     FileOutputStream  fos = new FileOutputStream ("C:\\Spring\\read-write-excel\\src\\main\\resources\\UserDetails.xlsx");
			
		            wb.write(fos);

		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExcelReadWrireRunner excelReader = new ExcelReadWrireRunner();
		String uName =excelReader.ReadExcel("User_credentials", 2, 0);
		System.out.println ("UserName is  :" +  uName);
		
		
		String pwd=excelReader.ReadExcel("User_credentials", 2, 1);
		System.out.println ("Password is  :" +  pwd);
		//System.out.println ("Status is  :" + DATA );
		excelReader.WriteExcel("User_credentials",2, 2,"PASS");
		


	}

}
