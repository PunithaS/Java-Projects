package com.bss.learning.test;

import org.testng.annotations.*;
import static org.testng.Assert.*;

import com.bss.CalcAPI;

public class CalcTestNG {
CalcAPI cal=new CalcAPI();
@DataProvider(name="dp1")
public Integer[][] dataprovidername()
{
	return new Integer[][] {
			{2,1,1},{4,2,2}
	};
}
	@Test(dataProvider="dp1")
	public void testadd(Integer exp,int a, int b)
	
	{
	assertEquals((Integer)cal.add(a, b),exp);
	
	}
}



