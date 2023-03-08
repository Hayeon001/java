package com.kbstar.service;

import com.kbstar.dao.UserDAO;
import com.kbstar.dto.UserDTO;
import com.kbstar.frame.DAO;
import com.kbstar.frame.Service;

public class UserService implements Service<String,UserDTO>{

	DAO<String,UserDTO> dao;
	
	public UserService() {
		dao = new UserDAO();
	}
	
	@Override
	public void register(UserDTO v) throws Exception {  //회원가입신청
		System.out.println("Security Check...");  //보안체크
		try {
			dao.insert(v);
		} catch (Exception e) {
			throw e;
		}
		System.out.println("Send mail..."); //메일발송
		System.out.println("Send SMS..."); //SMS발송
	}

	@Override
	public void remove(String k) throws Exception {
		try {
			dao.delete(k);  //문제발생
		} catch (Exception e) {  //문제잡아 Log찍는 단계
			throw e;             //던짐. -끝- 밑으로 진행안됨
		}
		System.out.println("Send mail...");
	}

	@Override
	public void modify(UserDTO v) throws Exception {
		try {
			dao.update(v);
		} catch (Exception e) {
			throw e;
		}
		System.out.println("Send mail...");
	}



//	@Override
//	public void remove(String k) {
//		dao.delete(k);
//		System.out.println("Send mail..."); //정상적으로 삭제되었습니다. 메일발송
//	}
//
//	@Override
//	public void modify(UserDTO v) {
//		dao.update(v);
//		System.out.println("Send mail...");
//		
//	}

}
