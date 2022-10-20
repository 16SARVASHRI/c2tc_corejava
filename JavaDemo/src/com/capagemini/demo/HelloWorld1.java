package com.capagemini.demo;
abstract	class	Parent		
{ 
	Parent()		
	{		
		System.out.println("Parent	Constructor	Called");		
	} 
	
	abstract	void	fun(); 
}
class	Child	extends	Parent	
	{ 
	Child()
	{		
			System.out.println("Child Constructor	Called");		
	} 
	void	fun()		
	{		
		System.out.println("Child	fun()	called");		
	} 
} 


public class HelloWorld1 {
	public	static	void	main(String	args[])		
	{	 
			Parent	d	=	new	Child(); 
			d.fun();
	} 
}
