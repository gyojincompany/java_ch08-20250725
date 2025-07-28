package com.gyojincompany.ch08.part02.cast;

public class Bus implements Vehicle {

	@Override
	public void run() { //인터페이스의 추상 메소드 오버라이딩
		// TODO Auto-generated method stub
		System.out.println("버스가 달립니다!");
	}
	
	public void checkFare() { //Bus 클래스에만 존재하는 메소드
		System.out.println("승차요금을 체크합니다.");
	}

}
