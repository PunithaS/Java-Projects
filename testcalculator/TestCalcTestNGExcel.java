package com.bss.testcalculator;

import static org.junit.Assert.assertEquals;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.*;

import com.bss.CalcAPI1;

public class TestCalcTestNGExcel {
	CalcAPI1 cal=new CalcAPI1();
	Sheet sh;
	int a=0;
	int b=0;
	int c=0;
	int res=0;
  @BeforeTest
  public void testConnectExcel()
  {
	  try {
			FileInputStream fis= new FileInputStream("/Users/madhavansubramanian/Desktop/test.xls");
				Workbook wb=WorkbookFactory.create(fis);
			    sh=wb.getSheet("Sheet1");
	  }		catch (Exception e) {
					e.printStackTrace();
				}
	  }
	@Test
  public void testAdd()  {
		
		for (Row row : sh) {
			a=(int) row.getCell(0).getNumericCellValue();
			b=(int) row.getCell(1).getNumericCellValue();
			c=(int) row.getCell(2).getNumericCellValue();
		
		res=cal.add(a, b);
		assertEquals(c, res);
		System.out.println("Addition result passed "+" "+res+" "+c);
		}
  }
	@Test
	  public void testSub()  {
			
			for (Row row : sh) {
				a=(int) row.getCell(0).getNumericCellValue();
				b=(int) row.getCell(1).getNumericCellValue();
				c=(int) row.getCell(3).getNumericCellValue();
			
			res=cal.sub(a, b);
			assertEquals(c, res);
			System.out.println("Subtraction result passed"+" "+res+" "+c);
	  }
	}
	
	
}

