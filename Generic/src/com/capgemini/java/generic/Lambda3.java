package com.capgemini.java.generic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Generic5{
	 private String data;

	public Generic5(String data) {
		this.data = data;
	}

	public String getData() {
		return data;
	}

	@Override
	public String toString() {
		return "Generic5 [data=" + data + "]";
	}
	
}

public class Lambda3 {

	public static void main(String[] args) {
	List<Generic5> list=new ArrayList<>();
	list.add(new Generic5("Hii"));
	list.add(new Generic5("Welcome"));
	list.add(new Generic5("To"));
	list.add(new Generic5("Akola"));
	
//by simple method
//	Collections.sort(list,new Comparator<Generic5>() {
//		public int compare(Generic5 l1,Generic5 l2) {
//			return l1.getData().compareTo(l2.getData());
//		}
//	});
	
// by lambda Expression
//	Collections.sort(list,(Generic5 l1,Generic5 l2)->{return l1.getData().compareTo(l2.getData());});

//	for(Generic5 g:list) {
//		System.out.println(g.getData());
	
	Collections.sort(list,(Generic5 l1,Generic5 l2)->{return l1.getData().compareTo(l2.getData());});
	list.forEach(temp->{System.out.println(temp.getData());});
	}
}


