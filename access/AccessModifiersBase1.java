package com.bss.access;

public class AccessModifiersBase1 {
	public int a=10;
	protected int b=20;
	int c=30;
	private int d=40;
	int e=10;
	
	public static void main(String[] args) {
		AccessModifiersBase1 mod= new AccessModifiersBase1();
		
		System.out.println("public"+mod.a);
		System.out.println("protected"+mod.b);
		System.out.println("default"+mod.c);
		System.out.println("private"+mod.d);
		
	}
	
	public void abcd()
	{
		
	}

}
