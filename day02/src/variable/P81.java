package variable;

import java.util.Scanner;

public class P81 {

	public static void main(String[] args) {
		int a = 10;
		String result = (a>0 ? "정상":"비정상");
		
		/*if(a>0) {
			result = "정상";
		} else {
			result = "비정상";
		}*/
		System.out.println(result);
		
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Input Number..");  
		int num = Integer.parseInt(sc.next());  //입력된 string 값을 int로
		
		String result1 = (num > 0) ? "정상" : "비정상"; //입력된 숫자가 0보다 크면 정상 
		System.out.println(result1);
		sc.close();  //빨대 뽑기
	}
}
