package array;

import java.util.Arrays;
import java.util.Random;

public class P104 {

	public static void main(String[] args) {

		int arr[] = new int[10]; // 배열선언 //배열이 있다 라는 것은 for문이 도는 것
		// 배열을 돌리는방법
		// i사용 for(int i=0; i<arr.length ; i++) { //위치값이 필요할떄 유리
		// 콜론사용 for(int data:arr) {

		Random r = new Random();

		for (int i = 0; i < arr.length; i++) {
	//		int data = r.nextInt(99) + 1; // 1부터 99
	//		arr[i] = data;
			arr[i] = r.nextInt(99) + 1; //한줄로 줄이면
		}
		
		System.out.println(Arrays.toString(arr));
		
		for(int a:arr) {
			System.out.printf("%d \t", a);			
		}
	}

}
