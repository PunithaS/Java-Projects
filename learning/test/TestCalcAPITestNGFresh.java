package com.bss.learning.test;

import java.util.HashMap;

import org.testng.annotations.*;

import  static org.testng.Assert.*;

import com.bss.CalcAPI;


public class TestCalcAPITestNGFresh {
	CalcAPI calc= new CalcAPI();
	int ar[]={1,2};
	HashMap input= new HashMap();
	@BeforeClass
	public static void setUpClass()
	{
		//read data from excel and assign it to input
	}
 
	@Test (groups={"smoke"})
  public void testAddP() {
	  int res=calc.add(2, 7);
	  assertEquals(res, 9);
  }
	@Test (groups={"smoke"}, enabled=false)
	  public void testAddN() {
		  int res=calc.add(-2, -7);
		  assertEquals(res, -9);
	  }
	@Test (groups={"reg","compatibility"}, dependsOnMethods="testAddZ")
	  public void testAddPN() {
		  int res=calc.add(2, -7);
		  assertEquals(res, -5);
	  }
	@Test (groups={"reg"})
	  public void testAddZ() {
		  int res=calc.add(2, 0);
		  assertEquals(res, 2);
	  }
	@Test (expectedExceptions={ArithmeticException.class, ArrayIndexOutOfBoundsException.class})
	public void testDiv()
	{	
		calc.add(3, ar[1]);
		System.out.println("After firstline of code");
		calc.div(6, 0);
		System.out.println("After second line of code");
	}
}
