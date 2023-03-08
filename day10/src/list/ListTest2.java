package list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ListTest2 {

	public static void main(String[] args) {
		
		//List<Integer> list = new List<Integer>();  //인터페이스는 객체를 생성할 수 없음
		List<Integer> list = new ArrayList<Integer>();
		//List<Integer> list = new LinkedList<Integer>();
		//ArrayList<Integer> list = new ArrayList<Integer>(); //확장성 필요없을때. Array만 쓸거야
		
		//1~10까지의 숫자를 20개 입력한다.
		//단, while문을 이용한다
		//list 정보를 출력하시오
		
		Random r = new Random();
		
		while (list.size() < 20) {  //0부터 시작
			int num = r.nextInt(10)+1;
			list.add(num);
		}
		
		System.out.println(list.size());
		System.out.println("-------------------");
		for(int data:list) {
			System.out.println(data);
		}
	}

}
