package com.capagemini.demo;
class Super 
{ 
	 	void disp() 
	 	{ 
	 	 	System.out.println("Super Class"); 
	 	} 
} 
class subclass extends Super 
{ 
 	@Override  	void disp() 
	 	{ 
	 	 	super.disp(); 
	 	 	System.out.println("Only Sub Class"); 
	 	} 
} 
public class Cube 
{ 
	 	public static void main(String[] args)  
	 	{ 
 	 	subclass obj = new subclass();  	 	
 	 	obj.disp(); 
 	 	 
 	 	 
	 	} 
 
} 

