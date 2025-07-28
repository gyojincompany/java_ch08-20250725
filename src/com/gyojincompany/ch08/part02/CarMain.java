package com.gyojincompany.ch08.part02;

public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		car.run();
		
		car.frontLeftTire = new KumhoTire();
		car.frontRightTire = new KumhoTire();
		car.run();
		
		
	}

}
