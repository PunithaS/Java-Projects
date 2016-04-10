package com.bss.qaworktest;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.bss.CalcAPI;

public class DataProviderSample {
CalcAPI cal=new CalcAPI();
@DataProvider(name="DataProv")
public Integer[][] mydata()
{
	return new Integer[][]{
			{8,5,3},{-6,-2,-4}};
	}

@Test//(dataProvider="testdata")
public void testAdd(Integer exp, Inputs i) {
//public void testAdd(Integer exp, int a, int b) {
	 Inputs ip= (Inputs)i;
	  assertEquals( exp, (Integer) cal.add(i.val1,i.val2));
	  //assertEquals(  (Integer) cal.add(a,b), exp);
	  //fail("expected exceotion didn't occur");
	  //assertTrue(false);
}


@DataProvider
public String[][] simpleData()
{
	  String[][] data= new String[][]{
			   {"california", "CA"},
			   {"NewYork", "NY"},
			   {"Illinois", "IL"}
		       };
	  
	  return data;
}

@Test(dataProvider="simpleData")
public void testSimple(String s, String t)
{
	  System.out.println("First input is " +s+" and second input is "+t);
}

}

class Inputs{
	int val1, val2;
	Inputs(int a, int b)
	{
		val1=a;
		val2=b;
	}
}