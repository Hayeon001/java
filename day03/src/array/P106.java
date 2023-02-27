package array;

import java.util.Arrays;
import java.util.Random;

public class P106 {

	public static void main(String[] args) {

		int arr[] = new int[10];
		Random r = new Random();

		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(99) + 1;
		}
		
		System.out.println(Arrays.toString(arr));
		
		
		//배열에서 홀수 값의 합과 평균을 구하시오
		
		int sum = 0;
		double avg = 0.0;
		int cnt = 0;
		
		for(int a:arr) {
			if( a%2 == 1) {    //또는 (a%2 != 0)
				sum += a;
				cnt++;
			}
		}
		
		avg = sum / (cnt * 1.0);
		System.out.printf("%d, %4.2f", sum, avg);	
	}
}
