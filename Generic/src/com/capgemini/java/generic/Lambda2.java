package com.capgemini.java.generic;

interface Demo{
	public void display();
}

public class Lambda2 {

	public static void main(String[] args) {
		new Thread(()->{ System.out.println("This is Thread Example via Lambda operator");}).start();
	}

}
