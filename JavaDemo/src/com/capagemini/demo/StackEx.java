package com.capagemini.demo;

import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		Stack<Integer> st=new Stack<>();
		st.push(20);
		st.push(10);
		st.push(40);
		st.push(70);
		st.push(60);
		
	    System.out.println(st);
	    
	    st.pop();
	    st.pop();
	    st.pop();
	    
	    System.out.println(st);
	}

}
