package array;

import java.util.Arrays;
import java.util.Random;

public class P105 {

	public static void main(String[] args) {

		int arr[] = new int[5];

		Random r = new Random();

		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(9) + 1;
		}

		System.out.println(Arrays.toString(arr));

		// 배열의 합과 평균을 구하시오 //104_1
		// 홀수번째 합과 평균을 구하시오

		int sum = 0;
		double avg = 0.0;
		int cnt = 0;

//		for (int i = 0; i < arr.length ;i++) {
//			if(i % 2 == 0) {
//				continue;  //짝수는 넘어가고 홀수만 더하기
//			}
//			sum += arr[i];

//		}

		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				sum += arr[i]; // 홀수번째 값을 추출해서 더하기
				cnt++; // 홀수번째를 카운트
			}
		}
		avg = sum / (cnt * 1.0);
		System.out.printf("%d, %4.2f", sum, avg);
	}

}
