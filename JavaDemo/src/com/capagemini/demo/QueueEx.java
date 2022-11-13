package com.capagemini.demo;

import java.util.PriorityQueue;
//import java.util.Queue;

public class QueueEx {

	public static void main(String[] args) {
		PriorityQueue<Integer> qu=new PriorityQueue<>();

		//Queue<Integer> qu=new PriorityQueue<>();
		qu.add(10);
		qu.add(30);
		qu.add(50);
		qu.add(40);
		qu.add(90);
		
		System.out.println(qu);
		
		qu.remove(30);
		qu.remove(40);
		System.out.println(qu);
		
	}

}
