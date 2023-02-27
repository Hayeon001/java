package array;

import java.util.Arrays;
import java.util.Random;

public class P104_1 {

	public static void main(String[] args) {

		int arr[] = new int[10];
		Random r = new Random();

		for (int i = 0; i < arr.length; i++) { // 0부터 9
			arr[i] = r.nextInt(99) + 1; // 1부터 99까지
		}

		System.out.println(Arrays.toString(arr));

		// 배열의 평균과 합을 구하시오
		int sum = 0; // for문 밖에서 선언
		for (int a : arr) {
			sum += a;
		}
		double avg = 0.0;
		// avg = sum / arr.length; //둘중 하나를 실수로 바꿔야 함
		avg = sum / (arr.length * 1.0);

		System.out.printf("%d, %4.2f", sum, avg);
	}
}