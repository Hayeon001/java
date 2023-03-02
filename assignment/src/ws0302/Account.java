package ws0302;

import ws0302.MakeAccountNumber;

public class Account {
	private String accNum;
	private String accName;
	private double balance;
	private double rate;
	private String grade;
	
	public Account() {
		this.accNum = MakeAccountNumber.makeAccNum();
	}
	//계좌 생성정보
	public Account(String accName, double balance, double rate, String grade) {
		this();
		this.accName = accName;
		this.balance = balance;
		this.rate = rate;
		this.grade = grade;
	}
	//accNum, accName, balance
	public Account(String accNum, String accName, double balance) {
		this.accNum = accNum;
		this.accName = accName;
		this.balance = balance;
	}
	//전체정보
	public Account(String accNum, String accName, double balance, double rate, String grade) {
		this.accNum = accNum;
		this.accName = accName;
		this.balance = balance;
		this.rate = rate;
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Account [accNum=" + accNum + ", accName=" + accName + ", balance=" + balance + ", rate=" + rate
				+ ", grade=" + grade + "]";
	}
	//accName
	public String getAccName() {
		return accName;
	}
	public void setAccName(String accName) {
		this.accName = accName;
	}
	
	//balance
	public double getBalance() {
		return balance;
	}
	
	//withdraw
	public void withdraw(double money) {
		if(money <= 0) {
			System.out.println("출금 금액을 확인하세요");
			return;
		}
		if(this.balance < money) {
			System.out.println("잔액을 확인하세요");
			return;
		}
		this.balance -= money;
	}
	//deposit
	public void deposit(double money) {
		if(money <= 0) {
			System.out.println("입금 금액을 확인하세요");
			return;
		}
		this.balance += money;
	}
	//interest 이자
	public double getInterest() {
		double interest = 0.0;
		interest = this.balance*(this.rate)/100;
		return interest;
	}
	//grade
	public String getGrade() {
		return grade;
	}
	
}
