package com.capagemini.demo;

import java.util.LinkedList;

public class LinkedListEx {
	
	public static void main(String[] args) {
		
		LinkedList<String> l=new LinkedList<>();
		
		l.add("Kriti Sanon");
		l.add("Tara Sutaria");
		l.add("Jenelia");
		l.add("Puja Hegde");
		l.add("Kriti Kharbanda");
		
		System.out.println(l);
		
		l.remove("Puja Hegde");
		
		System.out.println(l);
	}
}
