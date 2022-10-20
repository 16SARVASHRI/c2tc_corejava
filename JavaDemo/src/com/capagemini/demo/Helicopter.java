package com.capagemini.demo;
abstract	class	Student		
{			 	
	void	fun()	
	{	
		System.out.println("Student	fun()	called");		
	} 
} 

class	Teacher	extends	Student		
{
	 
} 
		 
public class Helicopter {
	public	static	void	main(String	args[])		
	{	 
			Teacher	d	=	new	Teacher(); 							
			d.fun(); 
	} 
}
