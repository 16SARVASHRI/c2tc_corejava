package com.capagemini.demo;

final class Final3
{
	void m1()
	{
		System.out.println("Super m1");
	}
}
public class Final2 extends Final3 {
	public static void main(String[]args)
	{
		Final2 f=new Final2();
		f.m1();
	}

	
	

}
