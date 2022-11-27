package com.capgemini.java.generic;

class Data1<T,K>
{
	private T dt;
	private K key;
	public Data1(T dt, K key) {
		this.dt = dt;
		this.key = key;
	}
	public T getDt() {
		return dt;
	}
	public K getKey() {
		return key;
	}
	@Override
	public String toString() {
		return "Data1 [dt=" + dt + ", key=" + key + "]";
	}
	public<E,V>void display(E element,V value)
	{
		System.out.println("Element: "+element+" , Vlaue: "+value);
	}
}

public class GenericMethodDemo {
	public static void main(String[]args) {
	Data1<String,Integer> d1=new Data1<String,Integer>("Rani",5);
	System.out.println("Data: "+d1.getDt()+ " , Key: "+d1.getKey());
	d1.display("Vidya",7);
	}
}
