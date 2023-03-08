package com.kbstar.dao;

import com.kbstar.dto.ItemDTO;
import com.kbstar.frame.DAO;

public class ItemDAO implements DAO<Integer, ItemDTO>{

	@Override
	public void insert(ItemDTO v) throws Exception {
		connect();
		if(v.getId() == 10) {
			throw new Exception("EX0007");
		}
		System.out.println(v);
		System.out.println("Inserted...");
		close();
	}

	@Override
	public void delete(Integer k) throws Exception {  //언박싱. //int id = 100; //정수형태 k에 들어갈 수 있음
		connect();
		if(k == 10) {
			throw new Exception("EX0008");
		}
		connect();
		System.out.println(k);
		System.out.println("Deleted...");
		close();
	}

	@Override
	public void update(ItemDTO v) throws Exception {
		if(v.getId() == 10) {
			throw new Exception("EX0009");
		}
		connect();
		System.out.println(v);
		System.out.println("Updated...");
	}
	

}
