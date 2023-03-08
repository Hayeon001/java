package p214;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input num...");
		int num = 0;
		try {
			num = Integer.parseInt(sc.next()); //숫자 이외 입력시 오류 발생하는 라인
			//분모에 0은 들어올 수 없음
			int result = 10/num; //분모0 입력시 오류발생 라인. 숫자라서 윗 라인은 실행됨
			System.out.println(result);
		}catch(Exception e) {
			System.out.println("잘못 입력 하셨습니다....");
		}
		//구체적으로 뭐가 잘못되었는지 메시지를 뿌릴 수 없음
		sc.close();

		System.out.println("End App..");
	}

}
