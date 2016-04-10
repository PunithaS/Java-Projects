package com.bss.access;


public class AccessModifierSamePack {
	
	public static void main(String[] args) {
		
		AccessModifiersBase mod= new AccessModifiersBase();
		System.out.println("public"+mod.a);
		System.out.println("protected"+mod.b);
		System.out.println("default"+mod.c);
		//System.out.println("private"+mod.d);
	}

}
