package com.kbstar.service;

import com.kbstar.dao.ShopDAO;
import com.kbstar.dto.ShopDTO;
import com.kbstar.frame.DAO;
import com.kbstar.frame.Service;

public class ShopService implements Service<String, ShopDTO>{

	DAO<String,ShopDTO> dao;

	public ShopService() {
		dao = new ShopDAO();
	}

	@Override
	public void register(ShopDTO v) {  //브랜치 등록
		System.out.println("Security Check...");  //보안체크
		dao.insert(v);
		System.out.println("Send mail..."); //메일발송
		System.out.println("Send SMS..."); //SMS발송
		
	}

	@Override
	public void remove(String k) {
		dao.delete(k);
		System.out.println("Send mail...");
		
	}

	@Override
	public void modify(ShopDTO v) {
		dao.update(v);
		System.out.println("Send mail...");
		
	}

	

}
