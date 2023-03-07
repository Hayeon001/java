package ws0307;

import java.util.Scanner;

public class App { // 화면
	// 계좌생성 r
	// 계좌정보조회 b
	// 계좌입금 w
	// 계좌출금 d

	public static void main(String[] args) throws MinusException, MinusBalance {
		Account acc = new Account();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Input command(q, r, b, w, d)");
			// resister, balance, withdraw, deposit
			String cmd = sc.next();
			
			if (cmd.equals("q")) {
				System.out.println("Bye..");
				break;
			} else if (cmd.equals("r")) {
				System.out.println("상품명(NAME)을 입력하세요...");
				String name = sc.next();
				System.out.println("예금주이름(accHolder)을 입력하세요...");
				String accHolder = sc.next();
				System.out.println("신규금액을 입력하세요...");
				double balance = Double.parseDouble(sc.next());
				acc = new Account(name, accHolder, balance);
				System.out.println(acc);
				
			} else if (cmd.equals("b")) {
				System.out.println(acc);
				System.out.println("계좌번호:"+acc.getAccNo()
								   +"\n상품명:"+acc.getName()
								   +"\n예금주:"+acc.getAccHolder()
								   +"\n잔액:"+acc.getBalance()+"원");
			
			//출금	
			} else if (cmd.equals("w")) {
				System.out.println("출금하실 금액을 입력해주세요");
				double money = Double.parseDouble(sc.next());
				acc.withdraw(money);
				System.out.println("계좌 잔액은 "+ acc.getBalance() + "원 입니다.");
			
			//입금
			} else if (cmd.equals("d")) {
				System.out.println("입금하실 금액을 입력해주세요");
				double money = Double.parseDouble(sc.next());
				acc.deposit(money);
				System.out.println("계좌 잔액은 "+ acc.getBalance() + "원 입니다.");
			}
			
		}
		sc.close();
	}
}
