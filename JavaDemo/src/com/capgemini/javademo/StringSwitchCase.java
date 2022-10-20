package com.capgemini.javademo;

public class StringSwitchCase {
	public static void main(String[] args) {
		//string name  is declared
		String name="author";

		//switch case started
		switch (name.toLowerCase()) 
		{
		case "author":
			System.out.println("VIKAS");
			break;
		case "team":
			System.out.println("Team Java Full Stack");
			break;
		case "editor":
			System.out.println("Vishnu & Krishna");
			break;
		default:
			System.out.println("Invalid entry");
			break;
	}

	}
}

