package com.kbstar.dao;

import com.kbstar.dto.ItemDTO;
import com.kbstar.frame.DAO;

public class ItemDAO implements DAO<String, ItemDTO> {

	@Override
	public void insert(ItemDTO v) {
		System.out.println(v.getId() + "상품이 저장 되었습니다.");
		
	}

	@Override
	public void delete(String k) {
		System.out.println(k + "상품이 삭제 되었습니다.");
		
	}

	@Override
	public void update(ItemDTO v) {
		System.out.println(v.getId() + "상품의 정보가 수정 되었습니다.");
		
	}
}
