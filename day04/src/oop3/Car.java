package oop3;

import java.util.Scanner;

import oop2.Employee;

public class Car { //클래스에 의해 생성된 자동차의 속성
	private String name;
	private String color;
	private int size;
	private int fsize;   //연료통사이즈
	private int cfsize;  //현재 기름 양
	
	
	
	//생성자. Constructor. 	
	public Car() {
	}



	public Car(String name, String color, int size, int fsize) {
		this.name = name;
		this.color = color;
		this.size = size;
		this.fsize = fsize; //처음 자동차에는 현재 기름양 넣을 필요 없음
	}



	//public Car(String name, String color, int size, int fsize, int cfsize) {
	//	this.name = name;
	//	this.color = color;
	//	this.size = size;
	//	this.fsize = fsize;
	//	this.cfsize = cfsize; //필수는 아니지만 언젠가 쓸지모르니까
	//}
	public Car(String name, String color, int size, int fsize, int cfsize) {
		this(name, color, size, fsize);
		this.cfsize = cfsize;
	}



	@Override
	public String toString() {
		return "Car [name=" + name + ", color=" + color + ", size=" + size + ", fsize=" + fsize + ", cfsize=" + cfsize
				+ "]";
	}

	//public static void main(String[] args) {
	//	System.out.println("주유량을 입력하세요");
	//	car
	//}
	
	// 기름을 넣는다.
	// 기름통 양만큼 넣을 수 있다. 용량 이상 못들어어간다. 마이너스 값은 오류메시지 노출
	// 다시 주유 하세요
	public void setCfsize(int size) { //기름넣는 행위에 대한 리턴 없음. 기름통보다 많이 넣으려할경우 반응
		if(size <= 0 || fsize < (cfsize + size)) {
			System.out.println("다시 주유량을 입력하세요");
			return;
		}
		cfsize += size;
	}
	
	// 주행을 한다.
	//1리터당 10km를 주행할 수 있다. 달리면 기름 감소
	public void go(int distance) {
		if (cfsize < 0 || cfsize < (distance/10)) {
			System.out.println("주유하고 출발하세요");
			return;
		}
		System.out.printf("%s %d Go...", this.name, distance);	
		cfsize = cfsize - (distance/10); //10키로 달리면 키로당 1리터 줄어든다
	}
	
	//멈춘다. 기름이 없으면 못가야함
	public void stop() {
		System.out.printf("%s Stop...", this.name);
	}
	
}
