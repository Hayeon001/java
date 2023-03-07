package p214;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input num...");
		int num = 0;
		try {
			num = Integer.parseInt(sc.next()); //숫자 이외 입력시 오류 발생하는 라인
			//분모에 0은 들어올 수 없음
			int result = 10/num; //분모0 입력시 오류발생 라인. 숫자라서 윗 라인은 실행됨
			System.out.println(result);
		}catch(ArithmeticException e1) {  //e1는 임의 지정값.
			System.out.println("분모가 0입니다...");
			//e1.printStackTrace();
			//return;  //여기서 main이 끝나버림. close 실행 안되서 큰일남
		}catch(NumberFormatException e2) {
			System.out.println("숫자를 입력하세요...");
		}
		//코드는 길어지지만 구체적인 메시지 표시 가능.
		sc.close();

		System.out.println("End App..");
	}

}
