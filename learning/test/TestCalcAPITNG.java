package com.bss.learning.test;

import org.testng.annotations.*;

import static org.testng.Assert.*;

import com.bss.CalcAPI;


public class TestCalcAPITNG {
CalcAPI calc= new CalcAPI();
	@Test
	public void testAdd() {
		int res=calc.add(2, 7);
		assertEquals(9, res);
		res=calc.add(2, -7);
		assertEquals(-5, res);
		System.out.println("This is testAdd");
	}
	
	
	@Test
	public void testMult()
	{
		System.out.println("This is testMult");
		int res= calc.mult(4, 0);
		assertEquals(1, res);
	}
	
	@Test(expectedExceptions={ArithmeticException.class,NullPointerException.class})
	public void testDiv()
	{
		int res=calc.div(4, 1);
		
	}
	
	
	@Test
	public void testAdd1() {
		int res=calc.add(2, 7);
		assertEquals(9, res);
		res=calc.add(2, -7);
		assertEquals(-5, res);
		System.out.println("This is testAdd");
	}
	
	
	@Test
	public void testMult1()
	{
		System.out.println("This is testMult");
		int res= calc.mult(4, 0);
		assertEquals(1, res);
	}
	
	@Test
	public void testDiv1()
	{
		int res=calc.div(4, 1);
		
	}
	
	@Test
	public void testAdd2() {
		int res=calc.add(2, 7);
		assertEquals(9, res);
		res=calc.add(2, -7);
		assertEquals(-5, res);
		System.out.println("This is testAdd");
	}
	
	
	@Test
	public void testMult2()
	{
		System.out.println("This is testMult");
		int res= calc.mult(4, 0);
		assertEquals(1, res);
	}
	
	@Test
	public void testDiv2()
	{
		int res=calc.div(4, 1);
		
	}
	@BeforeMethod
	public void setUP()
	{
		System.out.println("This is before");
	}
	@AfterMethod
	public void tearDown()
	{
		System.out.println("This is after");
	}
	

	@BeforeClass
	public static void setUPClass()
	{
		System.out.println("This is before class");
	}
	@AfterClass
	public static void tearDownClass()
	{
		System.out.println("This is after class");
	}
}
