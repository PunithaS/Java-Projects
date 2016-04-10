package com.bss.polymorphism;

import java.util.Scanner;

public class Phone {
	public static void main(String[] args) {
		Phone p = new Phone();
		p.dial(456798);
		p.dial();
	}
	
	public void dial(int n)
	{
		System.out.println("Dialing "+n);
	}
	public void dial()
	{
		Scanner s= new Scanner (System.in);
		System.out.println("Enter the number to dial..");
		int numbertocall= s.nextInt();
		dial(numbertocall);
		
		s.close();
	}
	
	public void receive()
	{
		System.out.println("hey... answer the call....");
	}

}
