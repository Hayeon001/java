package com.kbstar.dao;

import com.kbstar.dto.ItemDTO;
import com.kbstar.frame.DAO;

//ItemDAO역할. 데이터를 업데이트 하는 역할
//public class ItemDAO implements DAO<int, ItemDTO>{
public class ItemDAO implements DAO<Integer, ItemDTO>{

	@Override
	public void insert(ItemDTO v) {
		connect();
		System.out.println(v);
		System.out.println("Inserted...");
		close();
	}

	@Override
	public void delete(Integer k) {  //언박싱. //int id = 100; //정수형태 k에 들어갈 수 있음
		connect();
		System.out.println(k);
		System.out.println("Deleted...");
		close();
	}

	@Override
	public void update(ItemDTO v) {
		System.out.println(v);
		System.out.println("Updated...");
	}
	

}
