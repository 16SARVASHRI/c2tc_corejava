package com.capagemini.demo;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		
		HashSet<String> h=new HashSet<>();
		h.add("Shreya Ghoshal");
		h.add("Jonita Gandhi");
		h.add(null);
		h.add("Shreya Ghoshal");

		Set<String> h1=new HashSet<>();	
		h1.add("Alka Yagnik");
		h.add("Shreya Ghoshal");
		h.add("Palak Muchhal");
		h.add(null);
		h.add("Shreya Ghoshal");
		h.add("Jonita Gandhi");
		
		System.out.println(h.size());
		System.out.println(h.contains("shreya Ghoshal"));
		System.out.println(h.getClass());
		System.out.println(h.isEmpty());
		System.out.println(h.equals(h1));
		System.out.println(h.isEmpty());

		System.out.println(h);
	}

}
