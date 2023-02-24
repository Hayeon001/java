package ifcontrol;

public class ws {

	public static void main(String[] args) {
		// 1~100까지 숫자 중
		// 1. 3의 배수의 합과 평균
		// 2. 4의 배수의 합과 평균
		// 3. 7의 배수의 합과 평균을 구하시오 (각각)

		//3의 배수
		int sum1 = 0;
		double avg1 = 0.0;
		
		System.out.println("Start..");
		int cnt1 = 0; //카운트
		for (int i=1 ; i<=100 ; i++) {     
			if(i%3 == 0) {
				sum1 += i;
				cnt1++;
			}
		}
		
		avg1 = sum1 / (cnt1*1.0);
		System.out.printf("%d, %f \n", sum1, avg1);
		System.out.println("End.." + cnt1);
		
		//4의 배수
		int sum2 = 0;
		double avg2 = 0.0;
		
		System.out.println("Start..");
		int cnt2 = 0;
		for (int i=1 ; i<=100 ; i++) {     
			if(i%4 == 0) {
				sum2 += i;
				cnt2++;
			}
		}
		avg2 = sum2 / (cnt2*1.0);
		System.out.printf("%d, %f \n", sum2, avg2);
		System.out.println("End.." + cnt2);
		
		//7의 배수
		int sum3 = 0;
		double avg3 = 0.0;
		
		System.out.println("Start..");
		int cnt3 = 0;
		for (int i=1 ; i<=100 ; i++) {     
			if(i%7 == 0) {
				sum3 += i;
				cnt3++;
			}
		}
		avg3 = sum3 / (cnt3*1.0);  //int형태  cnt, sum을 실수로 바꾸는 방법
		System.out.printf("%d, %f \n", sum3, avg3);
		System.out.println("End.." + cnt3);
		
		
		//System.out.println("End..");
		
		
	}

}
