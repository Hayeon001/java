package overloading;

public class calculator {
//	public int sum2(int a, int b) { //숫자 두개가 들어가면 더해서 결과를 리턴
//		int result = 0;
//		result = a + b;
//		return result;
//	}
//
//	public int sum3(int a, int b, int c) { //argument는 같을수 없어
//		int result = 0;
//		result = a + b +c;
//		return result;
//	}
//	
//	public int sum4(int a, int b, int c, int d) {
//		int result = 0;
//		result = a + b + c + d;
//		return result;
//	}
	
	
	//overloading
	//double로 바꿔도 상관없음 리턴타입 신경 안씀
	
	public int sum(int a, double b) { 
		int result = 0;
		result = a + (int)b;
		return result;
	}

	
	public int sum(int a, int b) { //sum으로 통일 
		int result = 0;
		result = a + b;
		return result;
	}

	public int sum(int a, int b, int c) { //argument는 같을수 없어
		int result = 0;
		result = a + b +c;
		return result;
	}
	
	public int sum(int a, int b, int c, int d) {
		int result = 0;
		result = a + b + c + d;
		return result;
	
	}
}