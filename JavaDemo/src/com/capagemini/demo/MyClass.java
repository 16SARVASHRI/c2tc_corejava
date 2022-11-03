package com.capagemini.demo;

public class MyClass {
	int num; 
	 
 	MyClass() 
 	{ 
 	} 
 	MyClass(int num) 
 	{ 
 		this.num = num; 
 	}      
 	public static void main(String[] args)  { 
     
 	MyClass obj = new MyClass(32); 
    System.out.println("Num value : "+obj.num);  
 	}   

}
