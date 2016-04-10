package com.bss.learning.collectionwork;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class IteratorList {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("one");
		al.add("Two");
		al.add("Four");
		
		al.add("Three");
		al.add("Three");
		al.add("Two");
		

		System.out.println("Array list is"+al);
		
		
		// skip the third element
		Iterator<String> it1=al.iterator();
		int count=0;
		while(it1.hasNext())
		{
			System.out.println("count is "+count);
			
			String a=(String) it1.next();// if u skip this line it will not skip the 3rd value
			
			if(count!=3)
				System.out.println(a);
			count++;
			
		}
		
		
		
		LinkedList<String> all=new LinkedList<String>();
		all.add("one");
		all.add("Two");
		all.add("Four");
		all.add("Three");
		all.add("Three");
		all.add("Two");
		

		System.out.println("Linked list is"+all);
		

	}

}
