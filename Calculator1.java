package com.bss;

import java.util.Scanner;

/**
 * 
 * @author praveen
 * @version 1.0
 */
public class Calculator1 {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner reader= new Scanner(System.in);
		
		System.out.println("Enter the first input");
		int a= reader.nextInt();
		
		System.out.println("Enter the second input");
		int b= reader.nextInt();
		
		System.out.println("Enter the operation you wanna perform like 1 for add, 2 for sub etc");
		int op= reader.nextInt();
		
		
		CalcAPI1 calc= new CalcAPI1(); // Calling the default constructor to create objects
		
		
		switch (op) {
		case 1:
			System.out.println("Sum is "+calc.add(a, b));
			
			break;
		case 2:
			System.out.println("diff is "+ calc.sub(a, b));
			
			break;
		case 3:
			System.out.println("Multiplication is "+ calc.mult(a, b));
			break;
		case 4:
			System.out.println("division  is "+ calc.div(a, b));
			break;

		default:
			System.out.println("please check the operation input");
			break;
		}
		
		
	}
	
	

}
