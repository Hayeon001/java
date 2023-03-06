package com.kbstar.app;

import com.kbstar.dao.AccountMariaDBDAO;
import com.kbstar.dao.AccountOracleDAO;
import com.kbstar.dao.UserMariaDBDAO;
import com.kbstar.dao.UserOracleDAO;
import com.kbstar.dto.AccountDTO;
import com.kbstar.dto.UserDTO;
import com.kbstar.frame.DAO;

public class App {

	public static void main(String[] args) {
//		DAO dao = new UserOracleDAO();
//		UserDTO user = new UserDTO("id01", "pw02", "james");
//		dao.insert(user);

//		DAO dao = new AccountOracleDAO();
//		AccountDTO account = new AccountDTO("100", "자유저축", 1000);
//		dao.insert(account);
		
//		DAO dao = new AccountMariaDBDAO();
//		AccountDTO account = new AccountDTO("200", "정액적립", 1000);
//		dao.insert(account);
		
		DAO dao = new UserMariaDBDAO();
		UserDTO user = new UserDTO("id01", "pw02", "james");
		dao.insert(user);
	}

}
