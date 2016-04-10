package com.bss.access;



public class AccessModifierSamePack1 {
	
	public static void main(String[] args) {
		AccessModifiersBase1 mod= new AccessModifiersBase1();
		System.out.println("public"+mod.a);
		System.out.println("protected"+mod.b);
		System.out.println("default"+mod.c);
		//System.out.println("private"+mod.d);
	}

}
