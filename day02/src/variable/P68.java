package variable;

import java.util.Random;

public class P68 {
	/* String s1 = (String)10; */  //어떤 오류(??)
	/* String s1 = 10; */    //어떤 오류(??)
 
	public static void main(String[] args) {

		//parseInt
		String s1 = "10"; // 문자10
		int s2 = Integer.parseInt(s1); // parseInt : API
		int a = 10;
		System.out.println(s2 + a);  //10+10 = 20

		/*
		 * int n1 = 10; String n2 = n1 + "";
		 */

		int n1 = 10;
		String n2 = String.valueOf(n1);

		Random r = new Random();
		int randomNumber = r.nextInt(10);  //0부터 9까지. 10까지 하려면 (10)+1
		System.out.println(randomNumber);   //(??)랜덤숫자
		
	}

}
