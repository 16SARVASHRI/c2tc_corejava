package com.capgemini.java.generic;

interface Demo8{
	public int demo1();
}

public class Lambda4 {

	public static void main(String[] args) {
		Demo8 d1=()->45-67;
		System.out.println(d1.demo1());
	}

}
