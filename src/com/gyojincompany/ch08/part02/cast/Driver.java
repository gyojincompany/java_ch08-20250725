package com.gyojincompany.ch08.part02.cast;

public class Driver {
	public void carDrive(Vehicle vehicle) {
		if(vehicle instanceof Bus) {
			Bus bus = (Bus) vehicle; //매개변수로 입력된 인수값이 Bus로 만든 객체인지 확인 후 대입
			bus.checkFare();
		}
		vehicle.run();
	}
	
}
