package com.bss.testcalculator;
import static org.junit.Assert.assertEquals;

import org.junit.*;


import com.bss.CalcAPI1;


public class TestCalcAPIJU {
CalcAPI1 calc= new CalcAPI1();
	@Test(expected=NullPointerException.class)
	public void testAdd() {
		int res=calc.add(2, 2);
		assertEquals(9, res);
	}
	//@Ignore	
	@Test
	public void testAddNegative(){
		int res=calc.add(2, -7);
		assertEquals(-5, res);
		System.out.println(res);
	}
	
	@Test
	public void testMult()
	{
		int res= calc.mult(4, 0);
		assertEquals(0, res);
	}
	@BeforeClass
	public static void setup()
	{
		System.out.println("This is beforeclass test case");
	}
	@AfterClass
	public static void setclear()
	{
		System.out.println("This is afterclass test case");
	}
	@Before
	public void setup1()
	{
		System.out.println("This is before test case");
	}
	@After
	public void setclear1()
	{
		System.out.println("This is after test case");
	}
}
