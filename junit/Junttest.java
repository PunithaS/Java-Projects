package com.bss.junit;



import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.testng.annotations.Parameters;
@RunWith (Parameterized.class)
public class Junttest {
public String name;
public int age;
public Junttest(String name,int age)
{
	this.name=name;
	this.age=age;

}
	@Test
	public void testMethod() {
System.out.println(name+" "+age);

	}
@Parameters
public static Collection<Object[]> parameter()
{
Object[][] pData=new Object[2][2];
pData[0][0]="xxx";
pData[0][1]=30;
pData[1][0]="yyy";
pData[1][1]=40;
return Arrays.asList(pData);
}

}
