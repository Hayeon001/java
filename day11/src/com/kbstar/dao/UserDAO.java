package com.kbstar.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import com.kbstar.dto.UserDTO;
import com.kbstar.frame.DAO;

public class UserDAO implements DAO<String,UserDTO>{

	HashMap<String, UserDTO> db;
	
	public UserDAO() {
		db = new HashMap<>();
	}

	@Override
	public void insert(UserDTO v) throws Exception {
		if(db.containsKey(v.getId())) {
			throw new Exception("DB Error");
		}
		db.put(v.getId(), v);
	}

	@Override
	public void delete(String k) throws Exception {
		if(!db.containsKey(k)) {
			throw new Exception("");
		}
		db.remove(k);
	}

	@Override
	public void update(UserDTO v) throws Exception {
		if(!db.containsKey(v.getId())) {  //존재하지 않으면 수정못해
			throw new Exception("");
		}
		db.put(v.getId(), v);
	}

	@Override
	public UserDTO select(String k) throws Exception {
		UserDTO obj = null;
		obj = db.get(k);
		return obj;
	}
	//DB사용자정보를 가져와서 UserDTO 객체를 만들어 리턴해줘

	@Override
	public List<UserDTO> select() throws Exception {
		ArrayList<UserDTO> list = new ArrayList<UserDTO>();
		Collection<UserDTO> col =  db.values();
		
		//col에 값을 가져와서 UserDTO에 담아
		for(UserDTO obj:col) {
			list.add(obj);
		}
		return list;
	}
	//list에 UserDTO를 담아서 리턴
	//list는 리턴 못해. ArrayList사용
}
