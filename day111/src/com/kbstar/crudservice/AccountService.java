package com.kbstar.crudservice;

import java.util.List;

import com.kbstar.dao.AccountDAO;
import com.kbstar.dto.AccountDTO;
import com.kbstar.frame.DAO;
import com.kbstar.frame.Notification;
import com.kbstar.frame.CRUDService;
import com.kbstar.noti.NotificationImpl;

public class AccountService implements CRUDService<String, AccountDTO>{

	DAO<String, AccountDTO> accDao;
	Notification notification;
	
	
	public AccountService() {
		accDao = new AccountDAO();
		notification = new NotificationImpl();
	}
	
	@Override
	public void register(AccountDTO v) throws Exception {
		// 계좌개설
		accDao.insert(v);
	}

	public void remove(String k) throws Exception {
		accDao.delete(k);
	}

	@Override
	public void modify(AccountDTO v) throws Exception {
		accDao.update(v);
	}

	@Override
	public AccountDTO get(String k) throws Exception {
		AccountDTO obj = null;
		obj = accDao.select(k);
		return obj;
	}

	@Override
	public List<AccountDTO> get() throws Exception {
		//get() 모든 계좌 조회
		List<AccountDTO> list = null;
		list = accDao.select();
		return list;
	}

	@Override
	public void remove(AccountDTO obj2) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
