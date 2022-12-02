package com.capgemini.java.generic;

interface Lambda7{
	abstract void display();
}

public class LambdaEx {

	public static void main(String[] args) {
		Lambda7 l=()->System.out.println("Example of Lambda Operator");
		l.display();
	}

}
