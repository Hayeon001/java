package ifcontrol;

public class ws2 {

	public static void main(String[] args) {
		// 과제
		String email = "jmlee@tonesol.com";

		String id = "";
		String domain = "";

		System.out.printf("%s, %s", id, domain);

		
		
		
		
		
		// if(grade == "VIP") 아님!
		// if(grade.equals("VIP")

		// 또는 or ||
		// & &&

		// 세 수의 최대값과 최소값을 구하시오
		int a = 10;
		int b = 20;
		int c = 15;

		// 방법1
		int max = 0;
		int min = 0;

		if (a > b) {
			max = a;
			min = b;
			if (a < c) {
				max = c;
			} else {
				if (b > c) {
					min = c;
				}
			}
		} else {
			max = b;
			min = a;
			if (b < c) {
				max = c;
			} else {
				if (a > c) {
					min = c;
				}
			}
		}

		// 방법2
		// a>b) ? ((a>c)? a:c): (b>c)?b:c;
		// < < <

		/*
		 * max = (a>b) ? ((b>c) ? a : (a>c)? a) : () ( ) : ()
		 * 
		 * a>b>c a>b b>c 1 a,c a>c>b b<c a>c 2 a,b b>a>c a<c 5 b,c b>c>a a<b b>c a>c 3
		 * b,a c>a>b a<c 4 c,b c>b>a b<c 6 c,a
		 * 
		 */

		// 방법3

		/*
		 * if(a>b) { max = Math.max(a,c); min = Math.min(b,c); } else { max =
		 * Math.max(b,c); min = Math.min(a,c); }
		 */

		System.out.printf("MAX : %d, MIN : %d", max, min);

		
		
		
		
		
		// 숫자4개 해보기
		/*
		 * int a = 10; int b = 20; int c = 15; int d = 30;
		 */
		
		
		
		
		
		
		//cnt
		
		
		
		
		
		//int형태  cnt, sum을 실수로 바꾸는 방법
		
		
		
		
		
		//합과 평균을 구하시오  
		// 짝수만
		//continue로 바꿔보기
		
		/*
		 * int sum = 0; double avg = 0.0;
		 * 
		 * System.out.println("Start.."); int cnt = 0;
		 * 
		 * int i =1; while(i <= 100) { if(i%2 ==0) { sum += i; cnt++; }
		 * 
		 * i++; }
		 * 
		 * avg = (sum*1.0) / cnt; System.out.printf("%d, %f \n", sum, avg);
		 * System.out.println("End.."+i);
		 */
		
		

	}

}
