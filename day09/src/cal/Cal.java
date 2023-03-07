package cal;

public class Cal { //계산기 기능
	public static double div(int a, int b) throws Exception{
		double result = 0.0;
		try{
			result = a/b;
		}catch(Exception e) {
			//System.out.println("잘못 입력 하셨습니다.");  //기능에서 출력하는건 의미없어
			throw e; //UI로 던지기
		
		}
		return result;
	}
	public static double div(double a, double b) throws InfinityException {  //함수의 기능은 동일하나 들어가는
		double result = 0.0;
		if(b==0.0) { //b가 0.0이 되면 예외를 만들어서 던짐
			throw new InfinityException();
		}
		result = a/b;
		return result;
	}
}
