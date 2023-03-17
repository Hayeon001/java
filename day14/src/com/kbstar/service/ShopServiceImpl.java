package com.kbstar.service;

import java.util.List;

import com.kbstar.dao.CartDaoImpl;
import com.kbstar.dao.CustDaoImpl;
import com.kbstar.dao.ItemDaoImpl;
import com.kbstar.dto.Cart;
import com.kbstar.dto.Cust;
import com.kbstar.dto.Item;
import com.kbstar.frame.DAO;
import com.kbstar.frame.ShopService;

public class ShopServiceImpl implements ShopService<Cust, Cart> {

	DAO<String, String, Cust> custDao;
	DAO<String, String, Item> itemDao;
	DAO<String, String, Cart> cartDao;

	public ShopServiceImpl() {
		custDao = new CustDaoImpl();
		itemDao = new ItemDaoImpl();
		cartDao = new CartDaoImpl();
	}

	@Override
	public Cust login(String id, String pwd) throws Exception {
		// 사용자가 입력 > DB 정보가 있는지 확인. 있으면 가져와서 비교 > 같으면 로그인 성공 / 다르면 실패 > 성공하면 Cust
		// 던져주기
		Cust cust = null;
		cust = custDao.select(id);
//				if(user == null) { //id값의 cust가 없으면
//					
//				}
		if (cust != null) { // id값의 cust가 있으면
			if (cust.getPwd().equals(pwd)) { // pwd 비교해서 같으면
				System.out.println("Login OK"); // Login OK
			} else {
				throw new Exception("로그인 실패..");
			}
		} else {
			throw new Exception("로그인 실패..");
		}
		return cust;
	}

	@Override
	public void register(Cust v) throws Exception {
		//userDao.insert(v); 
		try {
			custDao.insert(v);
		}catch(Exception e) {
			throw new Exception("등록오류");
		}
		//notification.sendEmail(v.getEmail(), "축하합니다.");
		//notification.sendSMS(v.getContact(), "축하합니다.");
	}

	@Override
	public List<Cart> myCart(String id) throws Exception {
		// 사용자id를 넣으면 id에 해당하는 cart를 가져와 list를 만들어 return //search
		List<Cart> list = null;
		list = cartDao.search(id);
		//cart에 상품이 없을 경우 예외처리
		
		return list;
	}

}
