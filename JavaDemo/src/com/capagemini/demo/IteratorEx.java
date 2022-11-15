package com.capagemini.demo;

import java.util.Iterator;
import java.util.LinkedList;

public class IteratorEx {
	void display(LinkedList<String> list) {
		Iterator<String> it=list.iterator();
		while(it.hasNext()) {
			System.out.println("Player name is : "+it.next());
		}
	}
	public static void main(String[] args) {
		LinkedList<String> player=new LinkedList<>();
		player.add("Dhoni");
		player.add("Virat");
		player.add("KL Rahul");
		player.add("Sachin");
		player.add("Rohit");
		player.peek();
		player.set(3, "Hardik");
		player.addLast("Bumrah");
	
		
		System.out.println(player.clone());
		System.out.println(player.get(3));
		System.out.println(player.containsAll(player));
		System.out.println(player.offerFirst("Virat"));
		System.out.println(player.hashCode());
		System.out.println(player.poll());
		System.out.println(player.descendingIterator());
		System.out.println(player);
		
		IteratorEx ie=new IteratorEx();
		ie.display(player);
		
	}

}
