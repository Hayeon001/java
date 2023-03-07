package calculator;

import calculator.calculator;

public class Ui {

	public static void main(String[] args) {
		//User interface
		//계산기화면 : int result = sum(); save();
		//계산기기능 : int sum(int a, int b); void save();
		calculator cal = new calculator();
		int result = 0;
		result = cal.sum(10, 20);
		System.out.println(result);
		cal.save(result); 
		//void 함수라서 결과리턴 없음. 저장하고 끝!
		System.out.println("OK");
		//단, 문제상황시 알려줌 : 예외처리
	}

}
