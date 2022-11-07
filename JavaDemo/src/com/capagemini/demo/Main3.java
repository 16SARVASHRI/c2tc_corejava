package com.capagemini.demo;

abstract class Base3
{
	void func()
	{
		System.out.println("Base Function is called");
	}
}
class Derived3 extends Base3{
	
}

public class Main3 {
	
	public static void main(String[] args) {
		Derived3 d2=new Derived3();
		d2.func();
	}

}
