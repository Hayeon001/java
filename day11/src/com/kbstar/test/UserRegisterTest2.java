package com.kbstar.test;

import java.util.List;

import com.kbstar.dto.UserDTO;
import com.kbstar.frame.Service;
import com.kbstar.service.UserService;

public class UserRegisterTest2 {

	public static void main(String[] args) {
		Service<String, UserDTO> service = new UserService();
		UserDTO obj1 = 
			new UserDTO("id01", "pwd01", "james" , "a@naver.com", "010-1111-1111");
		UserDTO obj2 = 
			new UserDTO("id02", "pwd01", "james" , "a@naver.com", "010-1111-1111");
		UserDTO obj3 = 
			new UserDTO("id03", "pwd01", "james" , "a@naver.com", "010-1111-1111");
		
		try {
			service.register(obj1);
			service.register(obj2);
			service.register(obj3);
			System.out.println("------------------------");
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		//get(k) test -------------------
		UserDTO user = null;
		try {
			user = service.get("id01");
			System.out.println(user);
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		//get() test -------------------
		//Emp e = new Manager
		//List list = new ArrayList();
		List<UserDTO> list = null;
		try {
			list = service.get();
			for(UserDTO u : list){
				System.out.println(u);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		//remove() test
		//service.remove("id02");
		try {
			service.remove("id02");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	
		
}
