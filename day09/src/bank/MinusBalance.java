package bank;

public class MinusBalance extends Exception {
	public MinusBalance() {
	}
	public MinusBalance(String msgcode) {
		super(msgcode);
	}
}
