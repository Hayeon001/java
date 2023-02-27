package array;

public class P102 {

	public static void main(String[] args) {
		int a = 100; //정수
		
		int arr[] = new int[3];
		arr[0] = 10; //int arr의 0번째는 10이다
		arr[1] = 20;
		arr[2] = 30;
		System.out.println(arr);

		for(int i=0; i<arr.length ; i++) {
			System.out.printf("%d \t", arr[i]);
		}
		System.out.println("Type 2");
		for(int data:arr) {
			System.out.printf("%d \t", data);
		}
	}

}
