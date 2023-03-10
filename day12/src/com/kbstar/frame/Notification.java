package com.kbstar.frame;

public interface Notification {
	public void sendEmail(String email, String msg) throws Exception;
						//메일주소        //쓸 내용
	public void sendSMS(String contact, String msg) throws Exception;
	
}
