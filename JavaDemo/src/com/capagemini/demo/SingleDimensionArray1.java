package com.capagemini.demo;

class Student4{
	public int roll_no;
	public String name;
	Student4(int roll_no,String name){
		this.roll_no=roll_no;
		this.name=name;
	}
}
public class SingleDimensionArray1 {
	public static void main(String[] args) {
		Student4[] arr =new Student4[5];
		arr[0]=new Student4(1,"Sakshi");
		arr[1]=new Student4(2,"Vaibhav");
		arr[2]=new Student4(3,"Radhika");
		arr[3]=new Student4(4,"Rekha");
		arr[4]=new Student4(5,"Riya");
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Element at " + i + " : " + arr[i].roll_no + " " + arr[i].name);
		}

	}

}
