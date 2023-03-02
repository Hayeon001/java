package ws0302;

import ws0228.Employee;

public class App {

	public static void main(String[] args) {
//		Account 클래스가 다음과 같이 설계 되어 있다.
//		Account 클래스를 구현 하시오
//		단, 계좌 번호는 자동 생성 한다.(MakeAccountNumber 이용)
//		기능, 입금, 출금, 현재이자금액
//		App.java를 통해 Application 을 구현 하시오
//		1. 6개의 Account 객체 배열을 만들어 다음과 같은 객체를 입력 한다.
//		new Account("james1", 10000, 0.35, "VIP");
//		new Account("james2", 10000, 0.45, "GOLD");
//		new Account("james3", 10000, 0.55, "SIVER");
//		new Account("james4", 10000, 0.15, "GOLD");
//		new Account("james5", 10000, 0.28, "SIVER");
//		new Account("james6", 10000, 0.31, "VIP");
//		2. 6개의 계좌 정보를 출력 하시오
//		3. 모든 계좌의 잔액과 현재 이자금액을 출력 하시오
//		4. VIP들의 잔액의 합과 평균으을 출력 하시오

		//계좌정보 출력
		Account[] arrAcc = {
				new Account("james1", 10000, 0.35, "VIP"),
				new Account("james2", 10000, 0.45, "GOLD"),
				new Account("james3", 10000, 0.55, "SIVER"),
				new Account("james4", 10000, 0.15, "GOLD"),
				new Account("james5", 10000, 0.28, "SIVER"),
				new Account("james6", 10000, 0.31, "VIP")
		};
		
		for(int i=0; i<6 ;i++) {
				System.out.println(arrAcc[i].toString());
			};
		
		//모든 계좌의 잔액과 현재 이자금액
		for(int i=0; i<6 ;i++) {
				System.out.println(arrAcc[i].getAccName()+"의 잔액은 "+arrAcc[i].getBalance()+"원, 현재이자금액은 "+Math.round(arrAcc[i].getInterest())+"원 입니다.");
		}
		
		//VIP들의 잔액의 합과 평균
		int vipsum = 0;
		double avg = 0.0;
		int cnt = 0;
		
		for (int i = 0; i < arrAcc.length; i++) {
			if(arrAcc[i].getGrade().equals("VIP")) {
				vipsum += arrAcc[i].getBalance();
				cnt++;
			}
		
		}
		avg = vipsum / (cnt * 1.0);
		System.out.printf("%d, %4.2f", vipsum, avg);	}

}
