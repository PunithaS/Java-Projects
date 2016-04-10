package com.bss.testcalculator;

import static org.junit.Assert.assertEquals;
import java.io.*;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Test;
import com.bss.CalcAPI1;


public class TestCalcExcelReading {
	
		CalcAPI1 cal=new CalcAPI1();
		
		@Test
		public void testAdd() {
		
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
				
				//System.out.println(row.getCell(0).getNumericCellValue()+" : "+row.getCell(1).getNumericCellValue());
				int res=cal.add(a, b);
				assertEquals(c, res);
				System.out.println("result passed"+" "+res+" "+c);
			}
			
		} catch (Exception e) {
		
			
			e.printStackTrace();
		}
		}
		}



