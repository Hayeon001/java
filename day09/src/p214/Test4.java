package p214;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input num...");
		int num = 0;
		try {
			num = Integer.parseInt(sc.next());
			int result = 10/num;
			System.out.println(result);
		}catch(ArithmeticException e1) {  //e1는 임의 지정값.
			System.out.println("분모가 0입니다...");
			return; 
		}catch(NumberFormatException e2) {
			System.out.println("숫자를 입력하세요...");
			return;
		
		//-----문제발생시 더이상 실행되지 않도록 하고 싶을 때 return 사용
		}finally{
			System.out.println("예외상황 발생하더라도 반드시 실행...");
			sc.close();
		}

		System.out.println("End App..");
	}

}
