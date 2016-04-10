package com.bss.learning.collectionwork;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;


public class Student{

	int id;  
	String name;  
	String email;
	long phno=0;
	
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no. of Student");
		int n=0;
		n=s.nextInt();
		
		
		HashMap<Integer,Student> map= new HashMap<Integer,Student>();
		System.out.println("Enter Student Id,Name,Phno,Email");
		
		
		for(int i=0;i<n;i++)
		{
			Student st1= new Student();
			st1.id= s.nextInt();
			st1.name=s.next();
			st1.phno=s.nextLong();
			st1.email=s.next();
			
			map.put(i,st1);
	
		
		}

		//Getting vlaues by Keyset
		Set<Integer> k=map.keySet();
		Iterator<Integer> it=k.iterator();
		while (it.hasNext())
		{
			Student st=map.get(it.next());
			System.out.println(st.id+" "+st.name+" "+st.phno+" "+st.email);
			System.out.println();
		
		}
		

		//Getting values by Entry set
		
		Set<Entry<Integer,Student>> ek=map.entrySet();
		Iterator<Entry<Integer,Student>> it1=ek.iterator();
		while(it1.hasNext())
		{
			Entry<Integer,Student> et=it1.next();
			System.out.println(et.getKey()+" "+et.getValue().id+" "+et.getValue().name+" "+et.getValue().phno);
			
		}
	 
	}


}
