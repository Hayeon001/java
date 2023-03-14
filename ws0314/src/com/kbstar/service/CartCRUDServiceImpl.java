package com.kbstar.service;

import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.SQLRecoverableException;
import java.util.List;

import com.kbstar.dao.CartDaoImpl;
import com.kbstar.dto.Cart;
import com.kbstar.frame.CRUDService;
import com.kbstar.frame.DAO;
import com.kbstar.frame.MakeItemNumber;

public class CartCRUDServiceImpl implements CRUDService<String, Cart>{

	DAO<String, String, Cart> dao;
	
	public CartCRUDServiceImpl() {
		dao = new CartDaoImpl();
	}

	@Override
	public void register(Cart v) throws Exception {
		// 데이터 검증
		// DB입력
		try {
			String id = MakeItemNumber.makeCartNum();
			v.setId(id);
			dao.insert(v);
		}catch(Exception e) {
			if (e instanceof SQLIntegrityConstraintViolationException) {
				throw new Exception("ID가 중복되었습니다.");
			}else {
				throw new Exception("시스템 장애입니다.");
			}
		}
		//Email, SMS
		
	}

	@Override
	public void remove(String k) throws Exception {
		try {
			dao.delete(k);
		}catch(Exception e) {
			if(e instanceof SQLRecoverableException) {
				throw new Exception("시스템 장애");
			}else {
				throw new Exception("해당 ID가 존재하지 않습니다.");
			}
		}
		
	}

	@Override
	public void modify(Cart v) throws Exception {
		try{
			dao.update(v);
		}catch(Exception e) {
			if(e instanceof SQLRecoverableException) {
				throw new Exception("시스템 장애");
			}else {
				e.printStackTrace();
				throw new Exception("해당 ID가 존재하지 않습니다.");
			}
		}
		
		
	}
	
	@Override
	public Cart get(String k) throws Exception {
		Cart cart = null;
		try {
			cart = dao.select(k);
		}catch(Exception e) {
			if(e instanceof SQLRecoverableException) {
				throw new Exception("시스템 장애입니다.");
			}else {
				throw new Exception("ID가 존재하지않습니다.");
			}
		}
		return cart;
	}

	@Override
	public List<Cart> get() throws Exception {
		List<Cart> list = null;
		try {
			list = dao.selectAll();
		}catch(Exception e) {
			if(e instanceof SQLRecoverableException) {
				throw new Exception("시스템 장애입니다.");
			}else {
				throw new Exception("조회 내용이 없습니다.");
			}
		}
		return list;
	}


	
}