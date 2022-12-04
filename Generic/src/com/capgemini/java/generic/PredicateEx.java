package com.capgemini.java.generic;

import java.util.function.IntPredicate;

public class PredicateEx {


	public static void main(String[] args) {
		IntPredicate obj=i->i<76;
		IntPredicate obj1=i->i>34;
//		System.out.println(obj.or(obj1).test(86));
	System.out.println(obj.and(obj1).test(65));
	}

}
