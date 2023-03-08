package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MapTest4 {

	public static void main(String[] args) {
		Map<String, UserDTO> db = new HashMap<String, UserDTO>();
		//넣을때 put 가져올때 get
		db.put("id01", new UserDTO("id01", "pwd01", "james1"));
		db.put("id02", new UserDTO("id02", "pwd02", "james2")); // 저장소에 3명이 들어감
		db.put("id03", new UserDTO("id03", "pwd03", "james3")); // db=저장소.

		// db.get("id02"); //id02요청하면 new UserDTO("id02","pwd02","james2") 호출됨
		UserDTO u = db.get("id02");
		System.out.println(u);
		// 값 수정
		UserDTO uu = new UserDTO("id02", "0000", "james2");
		db.put(uu.getId(), uu); // uu의 id값을 넣고 uu 수정해라
		// 전체 사용자 정보 출력
		Collection<UserDTO> col = db.values();
		System.out.println(col.size());
		for (UserDTO user : col) {
			System.out.println(user);
			
	
		}
	}
}
