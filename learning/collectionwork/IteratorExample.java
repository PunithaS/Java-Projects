package com.bss.learning.collectionwork;

import java.util.HashSet;
import java.util.Iterator;

public class IteratorExample {

	public static void main(String[] args) {
		
		HashSet<Integer> set =new HashSet<Integer>();
		set.add(1);
		set.add(3);
		set.add(23);
		set.add(2323);
		set.add(100);
		set.add(100);
	
		System.out.println("Values of set are :"+ set);
		
		
		// to print only odd from the collection
		Iterator<Integer> it=set.iterator();// we can mention type of iterator also in this declaration
		
		while(it.hasNext())
		{
			//int a= it.next(); //it shows error it cant convert object to integer
			Integer a= (Integer) it.next();
			if(a%2!=0)
				System.out.println(a);
			
			
		}
		
			
	}

}
