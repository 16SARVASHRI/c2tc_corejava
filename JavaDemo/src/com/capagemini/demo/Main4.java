package com.capagemini.demo;

abstract class Base4
{
	final void func()
	{
		System.out.println("Derived func is called");
	}
}
class Derived4 extends Base4
{
}

public class Main4 {

	public static void main(String[] args) {
		Base4 b2=new Derived4();
		b2.func();
	}

}
