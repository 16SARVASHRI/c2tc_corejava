package com.capagemini.demo;

import java.util.Scanner;

public class MyCollege {
	public static void main(String[]args)
	{
		System.out.println("Enter no. of x and y: ");
		 Scanner scr = new Scanner(System.in);
			int x;
			int y;
			
			x=scr.nextInt();
			y=scr.nextInt();
			System.out.println("The string you Enter is: "+(x+y));	
	}
}
