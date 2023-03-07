package com.kbstar.dao;

import com.kbstar.dto.AdminDTO;
import com.kbstar.frame.DAO;

public class AdminDAO implements DAO<String, AdminDTO> {

	@Override
	public void insert(AdminDTO v) {
		System.out.println(v.getId() + "관리자 님이 저장 되었습니다.");
		
	}

	@Override
	public void delete(String k) {
		System.out.println(k + "관리자 님이 삭제 되었습니다.");
		
	}

	@Override
	public void update(AdminDTO v) {
		System.out.println(v.getId() + "관리자 님의 정보가 수정 되었습니다.");
		
	}
	

	
}
