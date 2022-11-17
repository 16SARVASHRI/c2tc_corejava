package com.capagemini.demo;

import java.util.TreeSet;

public class HashSetEx {

	public static void main(String[] args) {
		
//		TreeSet<Integer> t1=new TreeSet<>();
//		for(int i=20;i>0;i--) {
//			t1.add(i);
//		}
//		for(Integer i:t1) {
//			System.out.println(i);
//		}
		
		TreeSet<String> t2=new TreeSet<>();
		for(int i = 0;i<20;i++) {
			t2.add("IK"+i);
		}
		for(String i:t2) {
			System.out.println(i);
		}
	}
}
