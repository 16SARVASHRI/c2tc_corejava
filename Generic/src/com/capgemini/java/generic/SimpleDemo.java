package com.capgemini.java.generic;

class Data{
	private float str;

	public Data(float str) {
		this.str = str;
	}

	public float getStr() {
		return str;
	}
	
}
public class SimpleDemo {

	public static void main(String[] args) {
		Data d=new Data(5.67f);
		float out=d.getStr();
		System.out.println(out);
	}

}
