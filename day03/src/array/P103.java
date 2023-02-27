package array;

public class P103 {

	public static void main(String[] args) {
		
		//int arr[] = new int[3];  //[]위치 상관없음
		//int []arr = new int[3];
		//arr[0] = 10; //int arr의 0번째는 10이다
		//arr[1] = 20;
		//arr[2] = 30;
		int arr[] = {10,20,30}; //이렇게도 사용가능
		//int arr[] = {10,20,30.0};  //같은 타입으로만 가능. 30.0안돼
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
