package oop2;

import java.util.Random;

public class Employee {
	private String id;
	private String name;
	private int salary;

	public Employee() {
		this.id = "temp0001";
		this.name = "temp";
		this.salary = 100000000;
	}

	public Employee(String id, String name, int salary) {
		this.id = id;
		this.name = name;
		if(salary < 0) {
			this.salary = 0;
		} else {
			this.salary = salary;
		}
		
	}
	//동일한 레벨의 생성자를 호출
	public Employee(String name, int salary) {
		this("1000", name, salary); //무조건 첫줄에 사용해야함
	}
	
	//public Employee(String name, int salary) { // 이름과 연봉을 부여하면 자동으로 ID가 만들어지는 생성자
	//	Random r = new Random();
	//	// this.id = r.nextInt(100)+1; // 숫자+문자 = String //MILLISECOND : 1000=1초
	//	this.id = String.valueOf(r.nextInt(100) + 1);
	//	this.name = name;
	//	this.salary = salary;
		
	//}
	
	
	/////source >getter and setter
	public String getName() {
		return name;  //해당 객체의 이름을 변경하겠습니다
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public int getSalary() {
		return salary;
	}

	/////
	
	public int getAnnSalary() { // 급여를 요청하면 int로 반환한다
		return this.salary * 12;
	}

	public double getTax() { // 정수*실수 =실수
		return this.salary * 0.175;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}
