package com.kbstar.test;

import com.kbstar.dto.AccountDTO;
import com.kbstar.dto.TransactionDTO;
import com.kbstar.dto.UserDTO;
import com.kbstar.frame.BankService;
import com.kbstar.service.BankServiceImpl;

public class BankTest {
	public static void main(String[] args) {
		BankService<UserDTO, AccountDTO, TransactionDTO, String, String>
		service = new BankServiceImpl();
		
		
		//Register
		UserDTO user = new UserDTO("id01", "pwd01", "james", "a@naver.com", "010-1");
		//service.register(user);
		try {
			service.register(user);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		//Login
		/*
		String id = "id01";
		String pwd = "pws01";
		//service.login(id, pwd);  //id, pwd를 입력받아 service의 login을 호출. 정상이면 정보를 가져온다. 
		UserDTO loginUser = null; //받을 준비
		//service.login(id, pwd);
		try {
			service.login(id, pwd);
			System.out.println(loginUser);
			System.out.println("Login OK~ Welcome~");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		*/
		
		String id = "id01";
		String pwd = "pwd02";
		//service.login(id, pwd);  //id, pwd를 입력받아 service의 login을 호출. 정상이면 정보를 가져온다. 
		UserDTO loginUser = null; //받을 준비
		//service.login(id, pwd);
		try {
			service.login(id, pwd);
			System.out.println(loginUser);
			System.out.println("Login OK~ Welcome~");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}
}
