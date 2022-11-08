package com.capagemini.demo;

interface Bank1{
	float rateOfInterest();
}

interface RBIBank{
	float RBIroi();
}
interface WorldBank{
	float Worldroi();
}
class SBI1 implements Bank1,RBIBank,WorldBank{
	public float rateOfInterest(){
		 return 9.15f;
	}
	public float RBIroi(){
		 return 8.7f;
	}
	public float Worldroi(){
		 return 6.7f;
	}
}
class ICICI1 implements Bank1{
	public float rateOfInterest(){
		 return 9.7f;
	}
	
}

public class MultipleInterface {

	public static void main(String[] args) {
		Bank1 b=new SBI1();
		System.out.println("ROI: " + b.rateOfInterest());
		System.out.println("ROI: " +((WorldBank) b).Worldroi());
		System.out.println("ROI: " +((RBIBank) b).RBIroi());

	}

}
