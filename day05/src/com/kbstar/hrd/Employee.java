package com.kbstar.hrd;

public class Employee {
	private String id;
	private String name;
	private int salary; //월급 21억이상 못줌
	
	public Employee() {
	}
	public Employee(String id, String name, int salary) {
		this.id = id;  //this없으면 no effect
		this.name = name;
		this.salary = salary;
	}
	public double getTax() {
		double result = 0.0;
		result = this.salary * 0.17; //한 객체의 월급에 세율을 곱해서 result
		return result;
	}
	public int getAnnSalary() {
		int result = 0;
		result = this.salary*12;
		return result;
	}
	public double getAnnTax() {
		double result = 0;
		//result = (this.salary*12)*0.17;
		result = this.getAnnSalary() * 0.17;
		return result;
	}
	//private 정보 가져오거나 수정할 수 없음.
	//toString : 현업에 사용하지 않음. 테스트용
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	//getter and setter
	public String getName() {
		return name;
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
	////
	
	
	
}
