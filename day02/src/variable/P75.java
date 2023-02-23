package variable;

import java.util.Scanner;

public class P75 {

	public static void main(String[] args) {
		int a = 10;
		int b = 10;

		System.out.printf("%d,%d\n", a, b); // 첫번째%d가 a, 두번쨰가 b
		//++증감연산자 75p 4번,5번
		int result = ++a + b++; // b++는 11   

		System.out.println(result);
		System.out.printf("%d,%d\n", a, b);
		
		
		//77p
		int aa= 10;
		int bb= 10;
		
		System.out.println((aa >= 0)||(bb >= 0));
		System.out.printf("%d,%d\n", aa, bb);
		
		int aaa= 10;
		int bbb= 10;
		
		System.out.println((aaa++ >= 0)||(bbb++ >= 0));
		System.out.printf("%d,%d\n", aaa, bbb);
		// || or   aaa만 증가시키고 true나오고 끝. bbb는 그대로 10
		
		int aaaa= 10;
		int bbbb= 10;
		
		System.out.println((aaaa++ >= 0)|(bbbb++ >= 0));
		System.out.printf("%d,%d\n", aaaa, bbbb);
		// bbbb도 증가시켜줌
	}
}
