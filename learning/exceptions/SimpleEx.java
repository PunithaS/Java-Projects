package com.bss.learning.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class SimpleEx {

	public static void main(String[] args) {
		int a[]={1,2,3,4};
		for(int i=0;i<a.length;i++)
		{
			System.out.println(i+" th value of array is "+a[i]);
		}
		
		FileInputStream fis=null;
		Properties prop= null;
		try
		{
		 fis= new FileInputStream("/tmp/data1.properties");
		
		 prop= new Properties();
		
		prop.load(fis);
		}
		catch (FileNotFoundException e)
		{
			
		}
		catch (IOException e)
		{
			
		}
		System.out.println("Company name is "+prop.getProperty("company"));
	
	}

}
