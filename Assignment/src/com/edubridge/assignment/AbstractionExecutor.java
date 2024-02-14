package com.edubridge.assignment;
//driver class
public class AbstractionExecutor {

	public static void main(String[] args) {
		Motorcycle m=new Motorcycle();
		Car c=new Car();
		c.startEngine();
		c.stopEngine();
		m.startEngine();
		m.stopEngine();

	}

}
