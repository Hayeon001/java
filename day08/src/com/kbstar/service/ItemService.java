package com.kbstar.service;

import com.kbstar.dao.ItemDAO;
import com.kbstar.dto.ItemDTO;
import com.kbstar.frame.DAO;
import com.kbstar.frame.SearchService;
import com.kbstar.frame.Service;

//ItemService. 상품을 등록하는 역할
public class ItemService implements Service<Integer, ItemDTO>, SearchService { //다중인터페이스 사용가능

	DAO<Integer, ItemDTO> dao; //Integer와 ItemDTO 형태로 dao를 사용하겠다
	
	public ItemService() {
		dao = new ItemDAO(); //프로모션. 상위클래스 변수에 하위클래스 객체 담기.//만약 DB경로가 바뀌게 되면 ItemDAO변경해서 연결 가능
	}
	
	@Override
	public void register(ItemDTO v) {
		System.out.println(v + "Data Check..");  //잘못된 데이터가 들어와 문제되지 않도록 꼭 체크
		dao.insert(v);
		System.out.println("Send SMS..");
	}

	@Override
	public void remove(Integer k) {
		System.out.println(k + "Data Check..");  //잘못된 데이터가 들어와 문제되지 않도록 꼭 체크
		dao.delete(k);
		System.out.println("Send SMS..");	
	}

	@Override
	public void modify(ItemDTO v) {
		System.out.println(v + "Data Check..");  //잘못된 데이터가 들어와 문제되지 않도록 꼭 체크
		dao.update(v);
		System.out.println("Send SMS..");		
	}

	@Override
	public void search() {
		System.out.println("Item search..");
		
	}
	
	
	
}
