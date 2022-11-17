package com.capagemini.demo;

import java.util.HashMap;

public class HashMapEx {

	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<>();
		hm.put(01, "Vedant");
		hm.put(02, "Sarvashri");
		hm.put(null, "Vedant");
		hm.put(04, "Rekha");
		hm.put(05, "Riya");
		hm.put(05, null);
		
		System.out.println(hm);
		System.out.println(hm.containsKey(05));
		System.out.println(hm.entrySet());
		System.out.println(hm.keySet());
	}

}
