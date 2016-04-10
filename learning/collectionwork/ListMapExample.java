package com.bss.learning.collectionwork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class ListMapExample {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("one");
		al.add("xwo");
		al.add("jour");
		
		al.add("mhree");
		al.add("bhree");
		al.add("dwo");
		System.out.println("Array list is"+al);

		// Sorting the Arraylist by collection.sort command
		
		Collections.sort(al);
		System.out.println("after sorted");
		System.out.println("Array list is"+al);
		
		LinkedList all=new LinkedList();
		all.add("one");
		all.add("Two");
		all.add("Four");
		all.add("hhree");
		all.add("zhree");
		all.add("uwo");
		System.out.println("Array list is"+all);
		
		// Sorting the Linkedlist by collection.sort command
		
		Collections.sort(all);
		System.out.println("after sorted");
		Iterator it= all.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	//	System.out.println("Array list is"+all);
		
	}

}
