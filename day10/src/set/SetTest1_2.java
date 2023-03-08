package set;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class SetTest1_2 {

	public static void main(String[] args) {
		
		Set<Integer> set = new HashSet<Integer>();
		//1~10까지의 숫자를 10개 입력하세요
		//set.size가 10이 될때까지 계속 도는 while문
	
		Random r = new Random();
		
		while(set.size()<10) {
			int num = r.nextInt(10)+1;
			set.add(num);
		}
		System.out.println(set.size());
		System.out.println("-------------------");
		for(int data:set) {
			System.out.println(data);
		}
		
	}

}
