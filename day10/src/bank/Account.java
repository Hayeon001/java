package bank;

public class Account {
	private String accNo;
	private double balance;
	public Account() {
		this.accNo = MakeAccountNumber.makeAccNum();
		
	}
	//constructor에서도 Exception처리 가능
	public Account(double balance) throws Exception {
		this();
		if(balance<0) {
			throw new Exception("ER0001"); //예외객체를 만들어 던진다
		}
		this.balance = balance;
	}
	//돈만 넣으면 계좌 생성
	public Account(String accNo, double balance) throws Exception {
		if(balance<0) {
			throw new Exception("ER0001");
		}
		this.accNo = accNo;
		this.balance = balance;
	}
	
	public void withdraw(double money) throws Exception {
		if(money <= 0) {
			throw new Exception("EX0002");
		}
		if(balance<money) {
			throw new Exception("EX0003");
		}
		balance -= money;
	}
	
	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", balance=" + balance + "]";
	}
	
}
