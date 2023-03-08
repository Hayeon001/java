package com.kbstar.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import com.kbstar.dto.ItemDTO;
import com.kbstar.frame.DAO;

public class ItemDAO implements DAO<Integer,ItemDTO> {

	HashMap<Integer, ItemDTO> db = null;
			
	public ItemDAO() {
		db = new HashMap<>();
	}

	@Override
	public void insert(ItemDTO v) throws Exception {
		if(db.containsKey(v.getId())) { //해당하는 아이디가 있어?
			throw new Exception();
		}
		db.put(v.getId(), v);
		
	}

	@Override
	public void update(ItemDTO v) throws Exception {
		if(db.containsKey(v.getId())) {
			throw new Exception();
		}
		db.put(v.getId(), v);
		
	}

	@Override
	public void delete(Integer k) throws Exception {
		if(!db.containsKey(k)) {  //k값이 없으면 예외상황. 있으면 삭제
			throw new Exception();
		}
		db.remove(k);
		
	}

	@Override
	//id 넣으면 UserDTO 줘
	public ItemDTO select(Integer k) throws Exception {
		ItemDTO item = null;
		item = db.get(k);
		return item;
	}

	@Override
	public List<ItemDTO> select() throws Exception {
		//ArrayList 만들어서 보내줘야함
		ArrayList<ItemDTO> list = new ArrayList<ItemDTO>();
		Collection<ItemDTO> col = db.values();
		for(ItemDTO u : col) {
			list.add(u);
		}
		return list;
	}

	


}
