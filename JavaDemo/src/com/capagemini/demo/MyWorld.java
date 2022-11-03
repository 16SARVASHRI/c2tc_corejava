package com.capagemini.demo;

public class MyWorld {
	int num; 
    public void setNum(int num) 
    { 
        this.num = num; 
    }      
    public static void main(String[] args)  { 
         
        MyWorld obj = new MyWorld(); 
        obj.setNum(5); 
         
        System.out.println("Num value : "+obj.num); 
  
     }   

}
