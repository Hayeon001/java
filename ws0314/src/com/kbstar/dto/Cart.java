package com.kbstar.dto;

import java.util.Date;

public class Cart {
	private String id; //장바구니 번호
	private String user_id; //고객1
	private String item_id; //상품1
	private int cnt;
	private Date regdate;

	public Cart() {
	}

	
	


	


	//insert
	public Cart(String user_id, String item_id, int cnt) {
		this.user_id = user_id;
		this.item_id = item_id;
		this.cnt = cnt;
	}
	
	//update
	public Cart(String id, String user_id, String item_id, int cnt) {
		this.id = id;
		this.user_id = user_id;
		this.item_id = item_id;
		this.cnt = cnt;
	}



	public Cart(String id, String user_id, String item_id, int cnt, Date regdate) {
		this.id = id;
		this.user_id = user_id;
		this.item_id = item_id;
		this.cnt = cnt;
		this.regdate = regdate;
	}

	
	






	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getItem_id() {
		return item_id;
	}

	public void setItem_id(String item_id) {
		this.item_id = item_id;
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

	public Date getRegdate() {
		return regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}

	@Override
	public String toString() {
		return "Cart [id=" + id + ", user_id=" + user_id + ", item_id=" + item_id + ", cnt=" + cnt + ", regdate="
				+ regdate + "]";
	}

}
