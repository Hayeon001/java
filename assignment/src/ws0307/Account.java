package ws0307;

public class Account {
	private String accNo;
	private String name;
	private String accHolder; //예금주
	private static double balance;
	
	//Constructor - 음수 예외 상황
	public Account() {
		this.accNo = MakeAccountNumber.makeAccNo();
	}
	//계좌생성 - 상품명,예금주, 금액
	public Account(String name, String accHolder, double balance) throws MinusBalance{
		this();
		this.name = name;
		this.accHolder = accHolder;
		this.balance = balance;
		
		if(balance < 0) {
			throw new MinusBalance("M00002");
		} else {
			this.balance = balance;
		}
	}


	public Account(String accNo, String name, String accHolder, double balance){
		this.accNo = accNo;
		this.name = name;
		this.accHolder = accHolder;
		this.balance = balance;
	}
	
	public String getAccNo() {
		return accNo;
	}
	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(String accHolder) {
		this.accHolder = accHolder;
	}
	

	//계좌 정보 조회
	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", name=" + name + ", accHolder=" + accHolder + ", balance=" + balance + "]";
	}
	//잔액조회
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Account(String accNo, double balance) {
		this.accNo = accNo;
		this.balance = balance;
	}
	
	
	//출금 -  음수 예외상황, 잔액부족 예외상황
	public void withdraw(double money) throws MinusException, MinusBalance{
		if(money <= 0.0) {
			throw new MinusException("M00001");
		} else if(money>this.balance) {
			throw new MinusBalance("M00002");
		} else {
			this.balance -= money;
		}
	}
	
	
	//입금 - 음수 예외상황. 화면에 출력
	public void deposit(double money) throws MinusException{
		if(money <= 0.0) {
			throw new MinusException("M00001");
		} else {
			this.balance += money;
		}
	}
	
}
