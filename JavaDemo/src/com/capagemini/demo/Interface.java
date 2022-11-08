package com.capagemini.demo;

interface Bank{
	float rateOfInterest();
}
class SBI implements Bank
{
	public float rateOfInterest() {
		return 9.15f;
	}
}
class ICICI implements Bank
{
	public float rateOfInterest() {
		return 9.7f;
	}
}

public class Interface {

	public static void main(String[] args) {
		Bank b=new SBI();
		System.out.println("ROI: "+b.rateOfInterest());
		Bank b1=new ICICI();
		System.out.println("ROI: "+b1.rateOfInterest());

	}

}
