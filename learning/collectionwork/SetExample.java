package com.bss.learning.collectionwork;

import java.util.HashSet;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		// Hash set
		HashSet<Integer> set =new HashSet<Integer>();
		set.add(1);
		set.add(3);
		set.add(23);
		set.add(2323);
		set.add(100);
		set.add(100);
	
		System.out.println("Values of set are :"+ set);
		
		
		HashSet<String> setStrings= new HashSet<String>();
		setStrings.add("puni");
		setStrings.add("betasoft");
		setStrings.add("buni");
		setStrings.add("betassoft");
		setStrings.add("pusjsni");
		setStrings.add("betasoft");
		//setStrings.add(24);
		setStrings.add("abd");
		//setStrings.addAll(set);
		System.out.println("Values of set are :"+ setStrings);
		
		//Tree set
		// if i didnt define integer it wont show compilation error but it show run time error
		
		TreeSet<Integer> ts=new TreeSet<Integer>();
		ts.add(15);
		ts.add(26);
		ts.add(10);
		ts.add(2);
		//ts.add("add");
		System.out.println("Values of set are :"+ ts);
		
		
		TreeSet<String> tsString=new TreeSet<String>();
		tsString.add("abcd");
		tsString.add("abdcde");
		tsString.add("aybcdf");
		tsString.add("xabcd");
		tsString.add("mbcd");
		tsString.add("pbcd");
		tsString.add("5");
		// tsString.add(5); //error will occur


		System.out.println("Values of set are :"+ tsString);

		
	}

}
