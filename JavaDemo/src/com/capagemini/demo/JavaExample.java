package com.capagemini.demo;

public class JavaExample {
	private static String str ="TNS Java Training";
	static class MyNestedClass{
		public void disp()
		{
			System.out.println(str);
		}
	}
	public static void main(String[]args)
	{
		JavaExample.MyNestedClass j=new JavaExample.MyNestedClass();
		j.disp();
	}
}
