package p214;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {
		int ar[] = new int[10];
		Random r = new Random();
		
		//for(int a : ar)
		for(int i=0; i<ar.length; i++) {
			ar[i] = r.nextInt(10)+1;
		}
		
//		for(int data:ar) {
//			System.out.println(data);
//			Thread.sleep(2000);
		for(int data:ar) {
			System.out.println(data);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}
	}

}
