package bank;

import java.util.Scanner;

public class App2 {

	public static void main(String[] args) {
		Account acc = null; // 초기화 후 사용  //while 안에 들어오면 안돼
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("Input Command(c,w,d,s,q)..");
			String cmd = sc.next();
			if (cmd.equals("q")) {
				System.out.println("Bye..");
				break;
			} else if (cmd.equals("c")) {
				System.out.println("계좌를 개설하겠습니다.");
				System.out.println("계좌정보를 입력해주세요[name,money]");
				System.out.println("Input Name:");
				String name = sc.next();
				System.out.println("Input Money:");
				Double balance = Double.parseDouble(sc.next());
				// Account acc = new Account(name,money); //계좌 생성
				acc = new Account(name, balance);
				System.out.println(acc);
			} else if (cmd.equals("w")) {
				System.out.println("찾으실 금액을 입력하세요");
				double money = Double.parseDouble(sc.next());
				acc.withdraw(money);
				System.out.println("Withdraw :");
			} else if (cmd.equals("d")) {
				System.out.println("Deposit :");
			} else if (cmd.equals("s")) {
				System.out.println("Select :"); //조회하기
				System.out.println(acc);
			} 
		}
		sc.close();

	}

}
