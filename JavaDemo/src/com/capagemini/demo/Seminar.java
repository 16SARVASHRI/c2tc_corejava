package com.capagemini.demo;

public class Seminar {
	final int a;
	final static int b;
	Seminar(){
		a=30;
	}
	void displayValue() {
		 System.out.println("Value of a: " +a); 
	}
	static{
		b=23;
		System.out.println("Value of b: " +b); 
	}
	public static void main(String[]args)
	{
		Seminar s=new Seminar();
		s.displayValue();
	}
}
