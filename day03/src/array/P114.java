package array;

import java.util.Arrays;
import java.util.Random;

public class P114 {

	public static void main(String[] args) {

		int arr[][] = new int[5][5]; // 가로세로 25개
		// int temp[] = new int[5];
		// int [][]arr = new int[5][5]; 이렇게도 가능

		Random r = new Random();

		for (int i = 0; i < arr.length; i++) { // 0일때
			for (int j = 0; j < arr[i].length; j++) { // j만큼 돌아라. 5번
				arr[i][j] = r.nextInt(9) + 1; // i=0,j=0 일때 랜덤숫자
			}
		}

		System.out.println(Arrays.toString(arr));

		for (int i = 0; i < arr.length; i++) { // 0일때
			for (int j = 0; j < arr[i].length; j++) { // j만큼 돌아라. 5번
				System.out.printf("%d \t", arr[i][j]);
			}
			System.out.println("");
		}

		
		//위 내용을 for-each로 변경하시오
		System.out.println("---------------------------------");

		for (int a[] : arr) {
			for (int data : a) {
				System.out.printf("%d \t", data);
			}
			System.out.println("");
		}

	}
}



