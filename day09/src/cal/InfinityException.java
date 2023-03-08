package cal;

public class InfinityException extends Exception{
	public InfinityException() {
		
	}
	public InfinityException(String msgcode) { //msgcode 오류메시지. 오류코드를 바로노출시킬수도 있음
		super(msgcode);
	}

}
