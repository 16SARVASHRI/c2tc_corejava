package com.capagemini.demo;

import java.util.LinkedHashSet;

public class LinkedHashSetEx {
	public static void main(String[]args) {
		LinkedHashSet<Integer> lh=new LinkedHashSet<>();
		
		for(int i=30;i>0;i--) {
			lh.add(i);
			//System.out.println(i);
		}
		for(Integer i:lh) {
			System.out.println(i);
		}
	}
}
