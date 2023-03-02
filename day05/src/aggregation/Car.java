package aggregation;

public class Car { //클래스에 의해 생성된 자동차의 속성
	public String name;
	public String color;
	public int size;
	
	//생성자. Constructor. 
	//default constructor가 없을 경우 public Car() {} 알아서 만들어서 사용. 
	
	public Car() {  //class명칭과 동일하게 생겼음
		this.name = "k1";
		this.color =  "red";
		this.size = 1000;
	}
	
	//디폴트로 설정하기도 하고, 특정할 수도 있다. Car라는 이름은 같지만 내용에 따라 다르게 호출될 수 있다
	public Car(String name, String color, int size) {
		this.name = name;
		this.color = color;
		this.size = size;
	}
	
	
	@Override
	public String toString() {
		return "Car [name=" + name + ", color=" + color + ", size=" + size + "]";
	}

	public void drive() {
		car.go();
	}
	public void stopCar() {
		car.stop();
	}
}
