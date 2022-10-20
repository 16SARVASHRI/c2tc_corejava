package com.capagemini.demo;

public class Poly {
	void add(int x, int y) 
 	{ 
 	 	System.out.println("Add is "+(x+y)); 
 	} 
	 
 	void add(int x, int y, int z) 
 	{ 
 	 	System.out.println("Add is "+(x+y+z)); 
 	} 
	 
	 
 	public static void main(String[] args)  
 	{ 
	Poly obj = new Poly();  	
	obj.add(5, 4);  	
	obj.add(5, 5, 4); 

 	} 

}
