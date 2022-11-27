package com.capgemini.java.generic;

class Team
{
	private Object str;

	public Team(Object str) {
		super();
		this.str = str;
	}

	public Object getStr() {
		return str;
	}

	@Override
	public String toString() {
		return "Team [str=" + str + "]";
	}
}

public class ObjectEx {

	public static void main(String[] args) {
	Team t=new Team("Kho-Kho");
	String out=(String)t.getStr();
	System.out.println(out);
	}

}
