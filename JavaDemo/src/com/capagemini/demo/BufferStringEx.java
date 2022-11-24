package com.capagemini.demo;

public class BufferStringEx {

	public static void main(String[] args) {
	StringBuffer str=new StringBuffer("Hii everyone ");
	System.out.println("Welcome to "+str);
	System.out.println("Akola"+str);
	System.out.println(str);
	System.out.print("Stay safe"+str.capacity());
	System.out.println(str.codePointCount(4, 10));
	System.out.println(str.hashCode());
	System.out.println(str.reverse());
	System.out.println(str.append('h'));
	}

}
