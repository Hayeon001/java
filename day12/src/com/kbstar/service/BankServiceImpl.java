/**
 * 
 */
package com.kbstar.service;

import java.util.List;

import com.kbstar.dao.AccountDAO;
import com.kbstar.dao.TransactionDAO;
import com.kbstar.dao.UserDAO;
import com.kbstar.dto.AccountDTO;
import com.kbstar.dto.TransactionDTO;
import com.kbstar.dto.UserDTO;
import com.kbstar.frame.BankService;
import com.kbstar.frame.DAO;
import com.kbstar.frame.MakeAccountNumber;
import com.kbstar.frame.Notification;
import com.kbstar.noti.NotificationImpl;

/**
 * @author hayoni
 *
 */
//public class BankServiceImpl implements BankService<V1, V2, V3, K, P> {
public class BankServiceImpl implements BankService<UserDTO, AccountDTO, TransactionDTO, String, String> {

	DAO<String,UserDTO> userDao;
	DAO<String,AccountDTO> accountDao;
	DAO<String, TransactionDTO> trDao;
	Notification notification;
	
	public BankServiceImpl() {
		userDao = new UserDAO();
		accountDao = new AccountDAO();
		trDao = new TransactionDAO();
		notification = new NotificationImpl();
	}

	@Override
	public void register(UserDTO v) throws Exception {
		//userDao.insert(v); 
		try {
			userDao.insert(v);
		}catch(Exception e) {
			throw new Exception("등록오류");
		}
		notification.sendEmail(v.getEmail(), "축하합니다.");
		notification.sendSMS(v.getContact(), "축하합니다.");
		
	}

	@Override
	public UserDTO login(String k, String p) throws Exception {
		//사용자가 입력 > DB 정보가 있는지 확인. 있으면 가져와서 비교 > 같으면 로그인 성공 / 다르면 실패 > 성공하면 UserDTO 던져주기
		UserDTO user = null;
		user = userDao.select(k);
//		if(user == null) { //k값의 user가 없으면
//			
//		}
		if(user != null) { //k값의 user가 있으면
			if(user.getPwd().equals(p)) { //p 비교해서 같으면
				System.out.println("Login OK");  //Login OK
			}else {
				throw new Exception("로그인 실패..");
			}
		} else {
			throw new Exception("로그인 실패..");
		}
		return user;
	}
	

	@Override
	public void makeAccount(String k, double balance) throws Exception {
		
		//AccountDTO account = new AccountDTO(MakeAccountNumber.makeAccNum(), balance, k);
		String accNo = MakeAccountNumber.makeAccNum();
		AccountDTO account = new AccountDTO(accNo, balance, k);
		//계좌 객체를 만들땐 (AccountDTO : accNo,balance,holder)가 필요
		
		accountDao.insert(account); //계좌 DB에 등록
		
		UserDTO user = userDao.select(k);
		
		notification.sendEmail(user.getEmail(), accNo + "계좌를 개설하셨습니다");
		notification.sendSMS(user.getContact(), accNo + "계좌를 개설하셨습니다");
		
	}

	@Override
	public UserDTO getUserInfo(String k) throws Exception {
		UserDTO user = null;
		user = userDao.select(k);
		
		return user;
	}
	
	@Override
	public void transaction(String sendAcc, String receiveAcc, double balance, String desc) throws Exception {
												//이체할 금액
		System.out.println("금결원 전송..");
		
		//계좌번호정보 가져오기
		AccountDTO acc = null;
		acc = accountDao.select(sendAcc); //accountDao 사용할 수 있도록 상단에 정의
		//balance-이체금액 = 잔액
		double abalance = acc.getBalance()-balance;
		//계좌정보 수정
		acc.setBalance(abalance);
		accountDao.update(acc);
		//거래내역 추가
		TransactionDTO tr = new TransactionDTO(MakeAccountNumber.makeTrNum(), sendAcc, balance, "0", desc);
		trDao.insert(tr);
		
		//email, SMS발송 
		//acc정보 안의 고객id로 조회 . 로그인 할 때 정보를 사용하도록 해도 되지만,, 이체할때 실시간 정보로 사용하는게 베스트!
		String uid = acc.getHolder();
		UserDTO u = userDao.select(uid);
		
		notification.sendEmail(u.getEmail(), sendAcc + "에서 " + balance + "원이 출금되었습니다.");
		notification.sendSMS(u.getContact(), sendAcc + "에서 " + balance + "원이 출금되었습니다.");
		//완료
		
		
		//계좌 잔액 조회 : 계좌번호 넣고 잔액조회 AccountDAO
		//송금할 계좌/금액/비고 입력
		//계좌 금결원 전송/정상계좌 확인
		//송금여부/금액/받는사람이름 재확인
		//송금, 잔액차감, 거래내역에 기록
	}

	
	
	@Override
		public List<AccountDTO> getAllAccount(String k) throws Exception {
			// TODO Auto-generated method stub
			return null;
		}
	
	@Override
	public List<TransactionDTO> getAllTr(String Acc) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	
	

}
