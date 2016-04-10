package com.bss.datadriveneg;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.*;

public class ReadExcel {


public static void main(String[] args) throws Exception {

FileInputStream fis = new FileInputStream("/Users/madhavansubramanian/Desktop/test.xls");

Workbook wb = WorkbookFactory.create(fis);

Sheet sheet= wb.getSheet("Sheet1");



for (Row row : sheet) {

System.out.println(row.getCell(0).getStringCellValue()+" : "+row.getCell(1).getStringCellValue());


}

}


}
