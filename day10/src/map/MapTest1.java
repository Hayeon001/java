package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest1 {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		map.put(4, "D");
		map.put(5, "E");
		
		System.out.println(map.size()); //map에 들어간 값의 개수 호출
		System.out.println(map.containsKey(6));  //6번 있어?
		System.out.println(map.containsKey(5));  //5번 있어?
		System.out.println(map.containsValue("D"));  //D 있어?
		
		System.out.println(map.get(1));  //1번 value 뭐야?
		//for문으로 돌릴 수 없어
		//key값만 빼내서 그 값으로 데이터를 호출
		//모든 키의 값을 가져오는 메소드 : KeySet
		Set<Integer> keys = map.keySet(); //1,2,3,4,5가 들어감
		System.out.println(keys.toString());
		
		for(int data :keys) {  //key 값으로 data 꺼내기
			System.out.println(map.get(data));
		}
	}

}
