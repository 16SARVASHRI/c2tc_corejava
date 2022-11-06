package com.capagemini.demo;
class Teachers 
{ 
    void message() 
    { 
        System.out.println("This is Teachers class"); 
    } 
} 
  
/* Subclass Student */ 
class Students extends Teachers 
{ 
    void message() 
    { 
        System.out.println("This is students class"); 
    }   
    void display() 
    {     
        message(); 
 
        super.message(); 
    } 
} 
  
/* Driver program to test */ class Seminar1 { 
    public static void main(String args[]) 
    { 
        Students s = new Students(); 
 
        s.display(); 
    } 
}	


