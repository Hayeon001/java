package cal;

import java.util.Scanner;

public class CalUI { //계산기 화면

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Input 2 Number");
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		double result = 0.0;
		try {
			result = Cal.div(a, b);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("분모가 0입니다.");
		}
		System.out.println(result);
		
		sc.close();

	}

}
