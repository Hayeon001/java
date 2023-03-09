package com.kbstar.crudservice;

import java.util.List;

import com.kbstar.dao.TransactionDAO;
import com.kbstar.dto.AccountDTO;
import com.kbstar.dto.TransactionDTO;
import com.kbstar.frame.CRUDService;
import com.kbstar.frame.DAO;
import com.kbstar.frame.Notification;
import com.kbstar.noti.NotificationImpl;

public class TransactionService implements CRUDService<String, TransactionDTO>{

	DAO<String, TransactionDTO> transDao;
	Notification notification;
	
	public TransactionService() {
		transDao = new TransactionDAO();
		notification = new NotificationImpl();
	}

	@Override
	public void register(TransactionDTO v) throws Exception {
		transDao.insert(v);
	}

	@Override
	public TransactionDTO get(String k) throws Exception {
		TransactionDTO obj = null;
		obj = transDao.select(k);
		return obj;
	}

	@Override
	public List<TransactionDTO> get() throws Exception {
		List<TransactionDTO> list = null;
		list = transDao.select();
		return list;
	}
	
	//////////////////////////////////////////////////////
	
	@Override
	public void remove(AccountDTO obj2) throws Exception {
		// TODO Auto-generated method stub
	}


	@Override
	public void modify(TransactionDTO v) throws Exception {
		// TODO Auto-generated method stub
	}

	@Override
	public void remove(String k) throws Exception {
		// TODO Auto-generated method stub
	}
	//////////////////////////////////////////////////////
	
}
