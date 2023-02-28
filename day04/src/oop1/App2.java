package oop1;

public class App2 {

	public static void main(String[] args) {
		Car car1 = new Car("k2 ", "blue", 2000); //Class Car에 의해 만들어진 하나의 객체 car1. new에 의해 생성자 호출합니다
		car1.go();
		car1.stop();
		
		System.out.println("----------------------------------");
		
		// = : 오른쪽으로 실행하고 왼쪽으로 돌아가는 형태
	}

}
