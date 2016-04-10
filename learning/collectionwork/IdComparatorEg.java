package com.bss.learning.collectionwork;

import java.util.*;

 class IdComparatorEg implements Comparator {

	 public int compare(Object o1,Object o2)
	 {
		 Student s1= (Student)o1;
		 Student s2=(Student)o2;
		 if(s1.id==s2.id)  
			 return 0;  
			 else if(s1.id>s2.id)  
			 return 1;  
			 else  
			 return -1;  
			 
	 }
	/* 
	 Collections.sort((List<Student>) ts,new IdComparatorEg());
		
		Iterator<Student> ittm=ts.iterator();
		System.out.println("Values of Tree set are :");
		while(ittm.hasNext())
		{
			Student stm=(Student)ittm.next();
			System.out.println(stm.id);
			System.out.println(stm.name);
			System.out.println(stm.phno);
			
			}*/

	
	 
}
