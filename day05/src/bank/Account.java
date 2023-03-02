package bank;

public class Account {
	private String accNum;
	private String accName;
	private double balance;
	
	public Account() {
		//this.accNum = ""; //계좌번호 생성하는 클래스 생성해서 사용하자
//		MakeAccountNumber makenum = new MakeAccountNumber();
//		this.accNum = makenum.makeAccNum();
		this.accNum = MakeAccountNumber.makeAccNum(); //static 사용하면 변수지정없이 이렇게 사용가능

	}
	
	public Account(String accName, double balance) { //accNum 안받는 생성자
		this(); //public Account() 호출
		this.accName = accName;
		this.balance = balance;
	}

	public Account(String accNum, String accName, double balance) {
		this.accNum = accNum;
		this.accName = accName;
		this.balance = balance;
	}
	
	@Override
	public String toString() {
		return "Account [accNum=" + accNum + ", accName=" + accName + ", balance=" + balance + "]";
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void withdraw(double money) {
		if(money <= 0) {
			System.out.println("출금 금액을 확인하세요");
			return;
		}
		if(this.balance < money) {
			System.out.println("잔액을 확인하세요");
			return;
		}
		//this.balance = this.balance - money;
		this.balance -= money;
	}
	
	

	public void deposit(double money) {
		if(money <= 0) {
			System.out.println("입금 금액을 확인하세요");
			return;
		}
		//this.balance = this.balance + money;
		this.balance += money;
	}
}
