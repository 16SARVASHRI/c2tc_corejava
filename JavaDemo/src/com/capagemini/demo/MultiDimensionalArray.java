package com.capagemini.demo;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		int arr[][]= {{4,6,5},{8,9,10},{1,2,3}};
	
		for (int i = 0; i < 3; i++) 
		{
		for (int j = 0; j < 3; j++) {
			System.out.print(arr[i][j]+"");
			System.out.println();
		}
	}
	}
}
