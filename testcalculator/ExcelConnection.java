/*package com.bss.testcalculator;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelConnection {
	
public void excelreading{
	try {
		FileInputStream fis= new FileInputStream("/Users/madhavansubramanian/Desktop/test.xls");
		
			Workbook wb=WorkbookFactory.create(fis);
			Sheet sh=wb.getSheet("Sheet1");
			int a;
			int b;
			int c;
			
			for (Row row : sh) {
				a=(int) row.getCell(0).getNumericCellValue();
				b=(int) row.getCell(1).getNumericCellValue();
				c=(int) row.getCell(2).getNumericCellValue();
			}

	catch (Exception e) {
		
		
		e.printStackTrace();
	}
}
}		


*/