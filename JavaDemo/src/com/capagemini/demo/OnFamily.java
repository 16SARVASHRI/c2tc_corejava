package com.capagemini.demo;

class Tree
{
	void disp1()
	{
		System.out.println("Tree");
	}
}
class Fruits extends Tree
{
	void disp2()
	{
		System.out.println("Fruits");
	}
}

 class OnFamily {

	public static void main(String[] args) {
		Fruits obj = new Fruits();
		obj. disp1();
		obj. disp2();

	}

}
