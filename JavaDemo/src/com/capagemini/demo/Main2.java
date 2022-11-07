package com.capagemini.demo;
 
abstract class Base2{
	Base2(){
		System.out.println("Base Constructor is called");
	}
	abstract void func();
}
class Derived2 extends Base2{
	Derived2(){
		System.out.println("Derived Constructor is called");
	}

	@Override
	void func() {
		System.out.println("Derived Func() is called");
	}
}

public class Main2 {

	public static void main(String[] args) {
	Base2 b1=new Derived2();
	b1.func();
	Derived2 d1=new Derived2();
	}
	

}
