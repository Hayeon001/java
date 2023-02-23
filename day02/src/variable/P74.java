package variable;

import java.util.Random;
import java.util.Scanner;

public class P74 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("숫자를 입력하십시오(10~100)");
		String cmd = sc.next();
		//10~100 사이의 정수를 입력 받는다.
		//1부터 입력받은 숫자까지의 범위에서 랜덤한 숫자를 방생하시오
		
		Random r = new Random();
		/* int rndNum = r.nextInt(cmd); */  //cmd는 string. 
		int num = Integer.parseInt(cmd);  // string을 int로 바꿔야함
		int rndNum = r.nextInt(num)+1;  //1부터 시작해야하니까 +1
	 
		System.out.println(rndNum);  //출력
		sc.close();
	}  //빵에 쨈바르기 유튜브

}
