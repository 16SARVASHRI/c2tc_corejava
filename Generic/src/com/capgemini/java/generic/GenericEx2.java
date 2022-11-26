package com.capgemini.java.generic;

class Student<N>
{
	private N obj;

	public Student(N obj) {
		this.obj = obj;
	}

	public N getObj() {
		return obj;
	}

	@Override
	public String toString() {
		return "Student [obj=" + obj + "]";
	}
}

public class GenericEx2 {

	public static void main(String[] args) {
		Student<String> s=new Student<>("Sarvashri");
		String out=s.getObj();
		System.out.println(out);
	}

}
