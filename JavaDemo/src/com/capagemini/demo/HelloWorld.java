package com.capagemini.demo;

 class Truck{
	private String doors;
	private int speed;
	
	public Truck()
	{
		doors=("opened");
		speed= 0;
	}
	public Truck(String doors , int speed)
	{
		this.doors=doors;
		this.speed = speed;
	}
	public String getDoors() {
		return doors;
	}
	public void setDoors(String doors) {
		this.doors = doors;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String run() {
		if(doors.equals("closed") && speed>0) {
			return "running";
		}
		else
			return "not running";
	}
}

public class HelloWorld {

	public static void main(String[] args) {
		Truck truck= new Truck("closed",10);
		System.out.println(truck.run());
	}

}
