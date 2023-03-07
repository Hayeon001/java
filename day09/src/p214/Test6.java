package p214;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		double a = 0;
		double result = 10 / a;   //double 소수점 무한대 Infinity
		System.out.println(result);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //1초동안 멈췄다가 진행
		
		InputStreamReader ir = new InputStreamReader(System.in);
		System.out.println("Input Character...");
		//int b = ir.read();
		int b = 0;
		try {
			b = ir.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(b);
		System.out.println("End..");
	}

}
