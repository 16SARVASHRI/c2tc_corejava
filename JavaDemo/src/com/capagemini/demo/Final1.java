package com.capagemini.demo;

	class S1 {
	void m1()
	{
		 System.out.println("Final m1 "); 
	}
	final void m2()
	{
		 System.out.println("Final m2"); 
	}
}
	public class Final1 extends S1
	{
		void m1()
		{
			 System.out.println("F m1"); 
		}
		public static void main(String[]args)
		{
			S1 f=new S1();
			f.m1();
			f.m2();
		}
	}
