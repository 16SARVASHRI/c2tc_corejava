package com.capgemini.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApiEx {

	public static void main(String[] args) {
	
//		List<Integer> list=List.of(56,89,64,90,12,45,83);
//		System.out.println(list);
		
		List<Integer> list=new ArrayList<Integer>();
		list.add(23);
		list.add(67);
		list.add(90);
		list.add(13);
		list.add(43);
		list.add(96);
		list.add(7256);
		System.out.println("Original List:"+ list);
		
//		without Stream API
		List<Integer> listeven= new ArrayList<>();
		for(Integer i: list) {
			if(i%2==0)
			{
				 listeven.add(i);
			}
		}
		System.out.println("Processed Even no. List:"+ listeven);
	
//		with Stream API
		
		Stream<Integer> stream=list.stream();
		List<Integer> newList=stream.filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(newList);
		
//		one more way
		List<Integer> list1=list.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(list1);
	
//		shortest method
		System.out.println(list.stream().filter(i->i%2==0).collect(Collectors.toList()));
	}

}
