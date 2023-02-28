package oop3;

public class App {

	public static void main(String[] args) {
		Car car = new Car("C1", "red", 1000, 50);  //name,color,size,fsize
		System.out.println(car.toString()); //자동차 정보 출력
		//Car [name=C1, color=red, size=1000, fsize=50, cfsize=0] 기름이 없으니 못가도록해야
		
		car.go(10);
		car.setCfsize(30);
		car.go(10);
		System.out.println(car.toString());
		
	}

}
