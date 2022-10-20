
package com.capgemini.javademo;

public class BreakCount{
    //declared the main method
	public static void main(String[] args) {
		//for loop is started
		for(int i=1; i<=10; i++)
        {
       	 if(i == 1)
       	 {
       		 continue;   // break;
       	 }
       	 System.out.println(i);
        }
	}
}

