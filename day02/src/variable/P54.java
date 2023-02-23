package variable;

public class P54 {

	public static void main(String[] args) {
		boolean b1 = 10 > 5;
				
		//정수
		/*
		 * int n1 = 10; long n2 = 0L n2= (횟수)L;
		 */
		//자바 디폴트 값은 int
		
		//실수
		double d1 = 1.0; //64비트. 사이즈가 커서 float 사용
		//float f1 = 1.0;  //오른쪽 디폴트는 double
		float f1 = 1.0F; 
		//float f1 = 1.0f; 
		
		double d2 = 1/2;  //정수와 정수가 연산되면 결과도 정수
		System.out.println(d2);
		
		double d3 = 10.0/3.0;
		System.out.println(d3);   //3.3333333333333335
		
		float f2 = 10.0F/3.0F;
		System.out.println(f2);   // 3.3333333
		
		//char
		char c1 = 'A';
		System.out.println(c1);   //A
		
		char c2 = 65;    //알파벳 대문자 A
		System.out.println(c2);     //A
		
		int n3 = 10;
		double d4 = 10.0;
		/* int result = n3 + n4; */  //n4를 int로 바꾸면.. 22억 넘을 경우 문제.. int를 double로 
		double result = n3 + d4;
		
		
		
	}

}
