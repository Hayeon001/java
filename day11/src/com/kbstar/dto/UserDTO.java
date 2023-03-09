package com.kbstar.dto;

public class UserDTO {
	private String id;
	private String pw;
	private String name;
	private String email;
	private String contact; //전화번호
	
	public UserDTO() {
	}

	public UserDTO(String id, String pw, String name) {
		this.id = id;
		this.pw = pw;
		this.name = name;
	}

	public UserDTO(String id, String pw, String name, String email, String contact) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.email = email;
		this.contact = contact;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	@Override
	public String toString() {
		return "UserDTO [id=" + id + ", pw=" + pw + ", name=" + name + ", email=" + email + ", contact=" + contact
				+ "]";
	}

	
	
	

}
