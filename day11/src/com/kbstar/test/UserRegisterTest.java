package com.kbstar.test;

import java.util.List;

import com.kbstar.dto.UserDTO;
import com.kbstar.frame.Service;
import com.kbstar.service.UserService;

public class UserRegisterTest {

	public static void main(String[] args) {
		Service<String, UserDTO> service = new UserService();
		UserDTO obj1 = 
			new UserDTO("id01", "pwd01", "james" , "a@naver.com", "010-1111-1111");
		//에러 발생시키기
		UserDTO obj2 = 
		new UserDTO("id02", "pwd02", "james2" , "a2@naver.com", "010-2111-1111");

		try {
			service.register(obj1);
			System.out.println("------------------------");
			service.register(obj2);
		}catch (Exception e) {
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}
	
	}	
		
}
