package com.capagemini.demo;

public class Cube3 {
	static {
		System.out.println("Static block is invoked");
	}
	
	static int calculateCube3(int side)
	{
		return (side*side*side);
	}
	public static void main(String[]args)
	{
		System.out.println("Cube value of 7 is: "+calculateCube3(7));
	}

}
