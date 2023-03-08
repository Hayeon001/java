package list;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListTest1 {

	public static void main(String[] args) {
		//List<E> //리스트에 어떤 타입을 담을 건가요
		List<Integer> list = new ArrayList<Integer>();
		//List list = new ArrayList(); //이렇게도 가능은 하지만 사용하지 않음
//		list.add(10);
//		list.add(20);
//		list.add(30);
		
		//1~10까지의 숫자를 랜덤하게 10개 담으세요
		Random r = new Random();
		for(int i=1;i<=10;i++) {
			int num = r.nextInt(10)+1;
			list.add(num);
		}
		list.add(0, 100); //0번째 값을 100으로
		list.remove(0); //0번째 빼
				
		for(int data:list) {  //오토언박싱  //list 하나하나 꺼내서 값을 집어 넣은 것
			System.out.println(data);
		}
		
		
	}

}
