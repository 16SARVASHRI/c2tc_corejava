package com.capagemini.demo;

import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorEx {
	
	void display(LinkedList<String> list) {
		ListIterator<String> it=list.listIterator();
		
		while(it.hasNext()) {
			System.out.println("Flower name is : "+ it.next());
		}
	}
	
	void display1(LinkedList<String> list1) {
		ListIterator<String> it1=list1.listIterator(list1.size());
		
		while(it1.hasPrevious()) {
			System.out.println("Flower name is : "+ it1.previous());
		}
	}
	public static void main(String[] args) {

			LinkedList<String> l1=new LinkedList<>();
			l1.add("Jasmin");
			l1.add("Rose");
			l1.add("Hibiscus");
			l1.add("Lotus");
			l1.add("Mogra");
			
			System.out.println(l1);
			System.out.println("---------------------");
			System.out.println(l1.size());
		
			System.out.println("---------------------");

			ListIteratorEx li=new ListIteratorEx();
			li.display(l1);
			System.out.println("---------------------");
			l1.sort(null);
			li.display(l1);
			System.out.println("---------------------");
			//Collections.reverse(l1);
			li.display1(l1);
	}

}
