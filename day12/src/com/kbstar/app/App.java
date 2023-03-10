package com.kbstar.app;

import java.util.Scanner;

import com.kbstar.dto.AccountDTO;
import com.kbstar.dto.TransactionDTO;
import com.kbstar.dto.UserDTO;
import com.kbstar.frame.BankService;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.BankServiceImpl;
import com.kbstar.service.UserService;

public class App {

	public static void main(String[] args) {
		
		BankService<UserDTO, AccountDTO, TransactionDTO, String, String>
		service = new BankServiceImpl();
		
		//userInfo 조회할때. 로그인 되어 있는 상태니까 UserService활용
		CRUDService<String, UserDTO> userService = new UserService();
		
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			UserDTO user = null;
			System.out.println("Register(r) or Login(l) or Quit(q)");
			String cmd = sc.next();
			if(cmd.equals("q")) {
				break;
			}else if (cmd.equals("r")) {
				System.out.println("Register");
				String id = sc.next();
				String pwd = sc.next();
				String name = sc.next();
				String email = sc.next();
				String contact = sc.next();
				user = new UserDTO(id, pwd, name, email, contact);
				//service.register(user);
				try {
					service.register(user);
					System.out.println();
				}catch (Exception e) {
					System.out.println(e.getMessage());
				}
				
				
			}else if (cmd.equals("l")) {
				System.out.println("Login");
				String id = sc.next();
				String pwd = sc.next();
				//UserDTO user = null;
				try {
					user = service.login(id,pwd);
					System.out.println(user);
					System.out.println("로그인 성공");
					System.out.println("------------------------------");
					//로그인 성공이 되면 계좌개설 /이체 /조회 가능
					
					while(true) {
						//UserDTO user = null;
						System.out.println("Menu(m,t,a,i,tr,e)...");
						//makeAccount Transaction selectAccount userInfo selectTransaction exit
						String cmn = sc.next();
						
						if(cmn.equals("e")) {
							break;  //logout
							
						}else if (cmn.equals("m")) {
							System.out.println("Make Account..");
							double balance = Double.parseDouble(sc.next());
							service.makeAccount(user.getId(), balance);  //계좌개설완료
							System.out.println("Make Account Completed..");
							
						}else if (cmn.equals("t")) {
							System.out.println("Transaction..");
							//이체: 내계좌 상대계좌
							String sendAcc = sc.next();
							String receiveAcc = sc.next();
							double balance = Double.parseDouble(sc.next());
							String desc = sc.next();
							service.transaction(sendAcc, receiveAcc, balance, desc);
							System.out.println("Transaction Completed..");
							
						}else if (cmn.equals("i")) {
							System.out.println("User Info.."); //로그인한 사용자의 정보조회
							String rid = user.getId(); //이미 로그인 했기에 user정보가 살아있음
							UserDTO ruser = null;
							ruser = service.getUserInfo(rid);
							System.out.println(ruser);
						
						//내 계좌정보 가져오기	
						}else if (cmn.equals("a")) { 
							System.out.println("select Account..");
						
						//나의 계좌중 하나의 거래내역 가져오기	
						}else if (cmn.equals("tr")) {
							System.out.println("select Transaction..");
						
						}
					}
					
				}catch(Exception e) {
					System.out.println(e.getMessage());
				}
			}
}

}

}
