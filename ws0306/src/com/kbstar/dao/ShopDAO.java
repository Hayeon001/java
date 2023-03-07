package com.kbstar.dao;

import com.kbstar.dto.ShopDTO;
import com.kbstar.frame.DAO;

public class ShopDAO implements DAO<String,ShopDTO>{

	@Override
	public void insert(ShopDTO v) {
		System.out.println("(ID:"+v.getId()+")" + v.getName()+"점이 저장 되었습니다.");
	}

	@Override
	public void delete(String k) {
		System.out.println(k + "점이 삭제 되었습니다.");
	}

	@Override
	public void update(ShopDTO v) {
		System.out.println("(ID:"+v.getId()+")" + v.getName() + "점의 정보가 수정되었습니다.");
	}

	
	
	
}
