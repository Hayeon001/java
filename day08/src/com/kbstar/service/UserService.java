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
	public void register(UserDTO v) {  //회원가입신청
		System.out.println("Security Check...");  //보안체크
		dao.insert(v);
		System.out.println("Send mail..."); //메일발송
		System.out.println("Send SMS...");  //sms발송  //비정상 거래시 원상복구.롤백. DB 다시 뺴야
	}

	@Override
	public void remove(String k) {
		dao.delete(k);
		System.out.println("Send mail...");
	}

	@Override
	public void modify(UserDTO v) {
		dao.update(v);
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
