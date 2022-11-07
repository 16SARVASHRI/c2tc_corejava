package com.capagemini.demo;

abstract class Base1
{
	abstract void func();
}
class Derived1 extends Base1
{
	void func() {
	System.out.println("Derived func() called ");
	}
}
public class Main1 {

	public static void main(String[] args) {
		Base1 b=new Derived1();
		b.func();
	}

}
