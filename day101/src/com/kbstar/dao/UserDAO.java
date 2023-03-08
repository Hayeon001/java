package com.kbstar.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import com.kbstar.dto.UserDTO;
import com.kbstar.frame.DAO;

public class UserDAO implements DAO<String,UserDTO> {

	HashMap<String, UserDTO> db = null;
			
	public UserDAO() {
		db = new HashMap<>();
	}

	@Override
	public void insert(UserDTO v) throws Exception {
		if(db.containsKey(v.getId())) { //해당하는 아이디가 있어?
			throw new Exception();
		}
		db.put(v.getId(), v);
		
	}

	@Override
	public void update(UserDTO v) throws Exception {
		if(db.containsKey(v.getId())) {
			throw new Exception();
		}
		db.put(v.getId(), v);
		
	}

	@Override
	public void delete(String k) throws Exception {
		if(!db.containsKey(k)) {  //k값이 없으면 예외상황. 있으면 삭제
			throw new Exception();
		}
		db.remove(k);
		
	}

	@Override
	//id 넣으면 UserDTO 줘
	public UserDTO select(String k) throws Exception {
		UserDTO user = null;
		user = db.get(k);
		return user;
	}

	@Override
	public List<UserDTO> select() throws Exception {
		//ArrayList 만들어서 보내줘야함
		ArrayList<UserDTO> list = new ArrayList<UserDTO>();
		Collection<UserDTO> col = db.values();
		for(UserDTO u : col) {
			list.add(u);
		}
		return list;
	}
	


}
