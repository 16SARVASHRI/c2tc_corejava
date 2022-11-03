package com.capagemini.demo;

public class Cube1 {
	int side;
	static int objectcount=0;
	
	Cube1()
	{
		objectcount ++;
	}
	
	Cube1(int x){
		side = x;
		objectcount ++;
	}
	public static void main(String[] args)
	{
		Cube1 c2=new Cube1(12);
		Cube1 c3=new Cube1(10);
		
		System.out.println("No.of Cube Objects =" +objectcount);
	}

}


