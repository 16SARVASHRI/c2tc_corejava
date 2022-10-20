package com.capgemini.javademo;

public class HelloWorld4 {

	public static void main(String[] args) {
		// for loop
		  for(int i=1,j=1; i<10||j<10;i++,j++)
		  { 
			  j++;
			  System.out.println("i="+i+" and j="+j); 
		  }


		  // while loop 
			  int i=1,j=1;
			  while(i<10 || j<10)
			  { 
				  i++; j++;
			      System.out.println("i="+i+" and j="+j); 
			  }	
			
		 // Do while loop
			int u = 1, p = 1;
			do {
				u++;
				p++;
				System.out.println("i=" + u + " and j=" + p);
			    } while (i < 10 || j < 10);

	}

}
