package com.capgemini.java.generic;

interface Lambda
{
	public void display();
}

public class LambdaDemo {

	public static void main(String[] args) {
		Lambda l=()->{
			System.out.println("I am a Student");
			System.out.println("I am a Student");
			System.out.println("I am a Student");
			System.out.println("I am a Student");
		};
		l.display();
	}

}
