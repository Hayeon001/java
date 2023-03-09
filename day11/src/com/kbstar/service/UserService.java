package com.kbstar.service;

import java.util.ArrayList;
import java.util.List;

import com.kbstar.dao.UserDAO;
import com.kbstar.dto.UserDTO;
import com.kbstar.frame.DAO;
import com.kbstar.frame.Msg;
import com.kbstar.frame.Notification;
import com.kbstar.frame.Service;
import com.kbstar.noti.NotificationImpl;

public class UserService implements Service<String, UserDTO>{
	
	DAO<String, UserDTO> userDao;
	Notification notification;
	
	@Override
	public void register(UserDTO v) throws Exception {
		userDao = new UserDAO();
		notification = new NotificationImpl();
		//비밀번호 암호화
		
		//발생한 오류를 무조건 던지기 전에 잡아서 가공. 메시지뿌리기
		//service 단계에서 메시지 보이는 기능
		try {
			userDao.insert(v);
		} catch (Exception e) {
			throw new Exception("회원가입이 실패하였습니다.(EX00001)");
		}
		
		//userDao.insert(v); //UserDAO에서 발생하는 오류는 예외처리되어 Exception 처리
		notification.sendEmail(v.getEmail(),Msg.registerMsg1);
		notification.sendSMS(v.getContact(),Msg.registerMsg2);
	}

	@Override
	public void remove(String k) throws Exception {
		UserDTO user = null;
		userDao.select(k);
		//id로 고객정보 가져와두고
		userDao.delete(k);
		//id 넣어 삭제하고
		notification.sendEmail(user.getEmail(),Msg.removeMsg1);
		notification.sendSMS(user.getContact(),Msg.removeMsg2);
		//받아둔 고객정보로 문자 발송해
	}

	@Override
	public void modify(UserDTO v) throws Exception {
		try{
			userDao.update(v);
		}catch(Exception e) {
			throw new Exception ("수령 오류");
		}
		
	}

	@Override
	public UserDTO get(String k) throws Exception {
		UserDTO obj = null;
		obj= userDao.select(k);
	
		try {
			userDao.delete(k);
		}catch(Exception e) {
			throw new Exception ("탈퇴 오류");
		}
		return obj;
		
	}

	@Override
	public List<UserDTO> get() throws Exception {
		//ArrayList<UserDTO> list = null;
		List<UserDTO> list = null;
		try{
			list = userDao.select();
		}catch(Exception e) {
			throw new Exception ("조회 오류");
		}
		return list;
	}

}
