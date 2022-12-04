package com.capgemini.java.generic;

interface Demo2{
	public void demo(int x,int y);
}

public class Lambda5 {

	public static void main(String[] args) {
	Demo2 d=( int x,int y )->{System.out.println("Addition :"+(x+y));

	};
	d.demo(56,89);
}
}
