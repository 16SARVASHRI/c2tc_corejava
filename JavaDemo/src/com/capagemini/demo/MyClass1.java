package com.capagemini.demo;

public class MyClass1 {
	void function1(MyClass1 obj) 
    { 
        System.out.println("Function 1 invoked"); 
    } 
    void function2() 
    { 
        function1(this); 
    }      
    public static void main(String[] args)  { 
         
        MyClass1 obj = new MyClass1(); 
        obj.function2(); 
  
    }   

}
