package com.capagemini.demo;

class One
{
	void disp1()
	{
		System.out.println("ONE");
	}
}
class Two extends One
{
	void disp2()
	{
		System.out.println("Two");
	}
}
class Three extends Two
{
	void disp3()
	{
		System.out.println("Three");
	}
}
class Four extends Three
{
	void disp4()
	{
		System.out.println("Four");
	}
}


public class FamilyPackage {
	public static void main (String[] args) {
		Four obj1 = new Four();
		obj1.disp1();
		obj1.disp2();
		obj1.disp3();
		obj1.disp4();
	}
}
