package com.bss.learning.collectionwork;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class MapReader {

	public static void main(String[] args) {
		
		HashMap<Integer,String> map= new HashMap<Integer,String>();
		map.put(1, "Punitha");
		map.put(28,"onee");

		map.put(4,"lsdj");
		map.put(3,"value");
		map.put(2,"value");
		map.put(22,"one");
		map.put(5,"lsdj");
		map.put(9,"sdfs");
		//map.put(null,"one");

		
		System.out.println("HashMap value :"+ map.get(22));
		
		
		//ketset approach
		
		Set<Integer> keys=map.keySet();
		Iterator<Integer> it=keys.iterator();
		while(it.hasNext())
		{
			//System.out.println("key "+ it.next() + " " +"Value " + value);
			String value=map.get(it.next());
			System.out.println("key "+ it.next() + " " +"Value" + value);
			
		}
		
		System.out.println();
		//entryset approach
		
		Set<Entry<Integer, String>> es= map.entrySet();
		Iterator<Entry<Integer, String>> it1=es.iterator();
		while(it1.hasNext())
		{
			Entry<Integer, String> entry = it1.next();
			System.out.println(it1.equals(es));
			//System.out.println("Key is"+entry.getKey()+ " " + "value is "+ entry.getValue());
			
			
		}

	}

}
