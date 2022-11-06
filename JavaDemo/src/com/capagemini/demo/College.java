package com.capagemini.demo;

class Parents{}
class Childs extends Parents{}
public class College {
	public static void main(String[] args) {
		Childs cobj=new Childs();
		if(cobj instanceof Childs)
			System.out.println("cobj is instance of Child"); 
		else 
		    System.out.println("cobj is NOT instance of Child"); 
		 
		if(cobj instanceof Parents)
			System.out.println("cobj is instance of Parent");
		else 
	        System.out.println("cobj is NOT instance of Parent"); 
	}

}
