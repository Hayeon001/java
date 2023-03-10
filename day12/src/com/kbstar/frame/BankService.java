package com.kbstar.frame;

import java.util.List;
import com.kbstar.dto.AccountDTO;
import com.kbstar.dto.TransactionDTO;
/**
 * 23.3.10
 * @author hayoni (작업한 사람)
 *
 * 
 * @param <V1>UserDTO
 * @param <V2>AccountDTO
 * @param <V3>TransactionDTO
 * @param <K>String id
 * @param <P>String pwd
 */

public interface BankService <V1, V2 ,V3 ,K, P>{
	public void register(V1 v) throws Exception;
	public V1 login(K k, P p) throws Exception;
	//(화면에서)로그인하면 로그인된 사용자정보 리턴. 화면에 기본정보 표시
	public V1 getUserInfo(K k) throws Exception;
	public void makeAccount(K k, double balance) throws Exception;
	public List<V2> getAllAccount(K k) throws Exception;
	//id01이 가지고 있는 모든 계좌 정보를 줘
	public List<V3> getAllTr(String Acc) throws Exception;
	public void transaction(String sendAcc, String receiveAcc, double balance, String desc) throws Exception;
	//
	
	
}