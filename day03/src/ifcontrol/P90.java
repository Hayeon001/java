package ifcontrol;

public class P90 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		//두 수의 최대값과 최소값을 구하시오
		//최대값, 최소값 변수설정부터 해야함
		int max = 0;
		int min = 0;
		//둘중 비교해서 더 작은값을 min에, 더큰값을 max에
		if(a > b) {
			max = a;
			min = b;
		} else {
			max = b;
			min = a;
		}
		
		System.out.printf("MAX : %d, MIN : %d", max, min);
		
		
		/*
		 * int a = 10; int b = 20; int c = 15;
		 */
		
		//세 수의 최대값과 최소값을 구하시오
		
		


	}

}
