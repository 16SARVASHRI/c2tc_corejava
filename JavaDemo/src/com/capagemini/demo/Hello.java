package com.capagemini.demo;

public class Hello {
	public static void main(String[]args) {
		Car car= new Car();
		car.setDoors("close");
		car.setSpeed(10);
		System.out.println(car.run());
	}
}


class Car{
	private String doors;
	private int speed;
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
		if(doors.equals("closed") && speed > 0)
		{
			return "running";
		}
		else
		{
			return "not running";
		}
	}
}
