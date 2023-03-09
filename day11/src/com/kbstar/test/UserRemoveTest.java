package com.kbstar.test;

import java.util.List;

import com.kbstar.dto.UserDTO;
import com.kbstar.frame.Service;
import com.kbstar.service.UserService;

public class UserRemoveTest {

	   public static void main(String[] args) {
	      Service<String, UserDTO> service = new UserService();
	      UserDTO obj = new UserDTO("id01", "ped01", "james", "a@naver.com", "010-9999-0202");
	      UserDTO obj2 = new UserDTO("id02", "ped02", "james", "a@naver.com", "010-9999-0202");
	      UserDTO obj3 = new UserDTO("id03", "ped03", "james", "a@naver.com", "010-9999-0202");
	      try {
	         service.register(obj);
	         service.register(obj2);
	         service.register(obj3);
	      } catch (Exception e) {
	         System.out.println(e.getMessage());
	         // e.printStackTrace();
	      }

	      // remove() 테스트
	      try {
	         service.remove("id02");
	      } catch (Exception e) {
	         System.out.println(e.getMessage());
	      }
   }

}
