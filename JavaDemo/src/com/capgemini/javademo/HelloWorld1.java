package com.capgemini.javademo;
//Class Declaration
public class HelloWorld1 {
	public static void main(String[] args) 
	{
			//nested for loop started
			for (int i = 1; i <= 5; i++)
			{
				for (int j = 1; j <= i; j++) 
				{
					System.out.println('@');
				}
				System.out.println();
			}
		}

}
