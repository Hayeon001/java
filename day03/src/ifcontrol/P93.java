package ifcontrol;

import java.util.Scanner;

public class P93 {

	public static void main(String[] args) {
		// 숫자를 4개의 2자릿수를 입력받는다.
		// 만약 2자리 수가 아니면 프로그램 종료
		// 평균과 합계를 구한다.
		
		// 평균이 90이상이면 A
		//      80       B
		//      70       C
		//      60       D
		//60미만이면 F
		
		//합계, 평균, 학접을 출력하시오
		
		Scanner sc = new Scanner(System.in);
		
		
		
		int ko = 0;
		int en = 0;
		int ma = 0;
		int so = 0;
		
		int sum = 0;
		double avg = 0.0;  //실수처리
		String grade = "";
		
		sum = ko + en + ma + so;
		avg = sum / 4.0 ; //실수와 연산하면 실수로 변함
		
		
		
		//System.out.println("국어성적 입력 :");
		//sc.next();
		
		System.out.println("국어성적 입력 :");
		ko = Integer.parseInt(sc.next());
		if(10>
		ko || ko>=100) {
		//& && 차이
			sc.close();
			return;   //return break 차이
		}	
		System.out.println("영어성적 입력 :");
		en = Integer.parseInt(sc.next());
		if(10>en || en>=100) {
			sc.close();
			return;
		}
		System.out.println("수학성적 입력 :");
		ma = Integer.parseInt(sc.next());
		if(10>ma || ma>=100) {
			sc.close();
			return;
		}
		System.out.println("사회성적 입력 :");
		so = Integer.parseInt(sc.next());
		//ko = sc.next(); 스트링이라 이렇게 작성하면 안됨
		if(10>so || so>=100) {
			sc.close();
			return;
		}
		
		
		grade = (avg >=90) ? "A" : (avg >= 80) ? "B" : (avg >=70) ? "C" : "D";
		System.out.printf("%d, %f \n", sum, avg, grade);
		
		sc.close();
		
		
		
	}

}
