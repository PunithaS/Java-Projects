package com.bss.learning.collectionwork;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.TreeMap;

public class MapExample {

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

		
		System.out.println("HashMap value :"+ map);
		
		
		TreeMap tm= new TreeMap(map);
	//	tm.put(4, 3);
		System.out.println("TreeMap value :"+ tm);
		/*Hashtable ht= new Hashtable();
		ht.put(null, "arg1");
		*/
		
		
	}

}
