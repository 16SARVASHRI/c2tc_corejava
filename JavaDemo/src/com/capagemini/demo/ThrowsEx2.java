package com.capagemini.demo;

import java.io.IOException;
import java.sql.SQLException;

public class ThrowsEx2 {
	void m1() throws ArithmeticException
	{
		try {
			throw new ArithmeticException("Condition is not accepted ");
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	void m2() throws IOException
	{
		System.out.println("Method2 is created ");
	}
	void m3() throws SQLException
	{
		System.out.println("Method3 is created ");
	}
	public static void main(String[] args) throws ArithmeticException,IOException, SQLException {
		ThrowsEx2 th=new ThrowsEx2();
		th.m1();
		th.m2();
		th.m3();
	}
}
