package set;

import java.util.HashSet;
import java.util.Set;

public class SetTest1 {

	public static void main(String[] args) {
		//List와 차이점: 중복 허용 안함
		
		Set<Integer> set = new HashSet<Integer>();
		set.add(10);
		set.add(10);
		set.add(20);
		set.add(10);
		
		for(int data:set) {
			System.out.println(data);
		}
		
	}

}
