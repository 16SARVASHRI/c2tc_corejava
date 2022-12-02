package com.capgemini.java.generic;

public class Lambda1 {

	public static void main(String[] args) {
		Thread t=new Thread(new Runnable() {
			public void run() {
				System.out.println("My Thread id is running");
			}
		});
		t.start();
	}

}
