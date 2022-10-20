package com.capgemini.javademo;
class Car {
		private String doors;
		private String engine;
		private String driver;
		private int speed;
		
		public int getSpeed() {
			return speed;
		}
		public void setSpeed(int speed) {
			this.speed = speed;
		}
}

 public class Hello {
	public static void main(String[]args)
	{
	Car car= new Car();
	car.setSpeed(10);
	System.out.println(car.getSpeed());
	}
}
