package com.capagemini.demo;

class Person 
{ 
    Person() 
    { 
        System.out.println("Person class Constructor"); 
    } 
} 
  
/* subclass Group extending the Person class */ 
class Group extends Person 
{ 
    Group() 
    { 
        // invoke or call parent class constructor 
        super(); 
  
        System.out.println("Student class Constructor"); 
    } 
} 
  
/* Driver program to test*/ 
class S { 
    public static void main(String[] args) 
    { 
        Group obj = new Group(); 
    } 
} 
 



