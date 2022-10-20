package com.capagemini.demo;

abstract	class	GrandFather		
{ 
	final	void	fun()		
	{		
		System.out.println("Grandfather	fun()	called");		
	} 
} 

class	Son	extends	GrandFather		
{	

} 

public class FamilyGroup {
	public	static	void	main(String	args[])		
	{	 
			GrandFather	b	=	new Son(); 
			b.fun(); 
	} 
}
