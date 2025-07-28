package com.gyojincompany.ch08.part02.exer;

public class DaoExample {
	
	public static void dbWork(DataAccessObject dao) { //static 메서드로 선언
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dbWork(new OracleDao()); //업캐스팅->다형성
		dbWork(new MySqlDao());
	}

}
