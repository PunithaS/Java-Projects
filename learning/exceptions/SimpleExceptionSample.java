package com.bss.learning.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class SimpleExceptionSample {
	public static void main(String[] args) {
		int a[]={1,2,3,4};
		for(int i=0;i<a.length;i++)
		{
			System.out.println(i+" th value of array is "+a[i]);
		}
		
		FileInputStream fis=null;
		try
		{
		 fis= new FileInputStream("/tmp/data1.properties");
		}
		catch (FileNotFoundException e)
		{
			System.out.println("Pls check the file source");
		}
		Properties prop= new Properties();
		try {
		prop.load(fis);
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		System.out.println("Company name is "+prop.getProperty("company"));
	}

}
