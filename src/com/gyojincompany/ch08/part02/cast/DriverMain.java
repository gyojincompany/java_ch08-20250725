package com.gyojincompany.ch08.part02.cast;

public class DriverMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Truck truck = new Truck();
		
		driver.carDrive(bus);
		driver.carDrive(truck);
	}

}
