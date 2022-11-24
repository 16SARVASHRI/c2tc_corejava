package com.capagemini.demo;

public class StringEx {

	public static void main(String[] args) {
		String str= new String("COETA CSE");
		String str1=new String("coeta cSE");
		System.out.println(str);
		System.out.println(str1.codePointBefore(3));
		System.out.println(str.compareTo(str1));
		System.out.println(str1.equalsIgnoreCase(str1));

		String str2=str.substring(0, 6);
		System.out.println(str2);


	}

}
