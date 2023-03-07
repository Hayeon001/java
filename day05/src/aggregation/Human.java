package aggregation;

public class Human {
	private String name;
	//사람은 차를 소유하고 있다
	private Car car; //여러대 있다면 배열 활용
	public Human() {
	}
	
	public Human(String name) { //차가 없을 수도 있기에 이름만 입력해서 사용자 생성
		this.name = name;
	}

	public Human(String name, Car car) {
		this.name = name;
		this.car = car;
	}
	
	//getter setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}
	//
	
	@Override
	public String toString() {
		return "Human [name=" + name + ", car=" + car + "]";
	}

//	public void drive() {
//		car.go();
//	}
//	public void stopCar() {
//		car.stopCar();
//	}
	

}
