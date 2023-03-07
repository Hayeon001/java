package com.kbstar.dto;

public class AdminDTO {
	private String id;
	private String pwd;
	private String level;
	
	
	public AdminDTO() {
	}

	public AdminDTO(String id, String pwd, String level) {
		this.id = id;
		this.pwd = pwd;
		this.level = level;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getPwd() {
		return pwd;
	}


	public void setPwd(String pwd) {
		this.pwd = pwd;
	}


	public String getLevel() {
		return level;
	}


	public void setLevel(String level) {
		this.level = level;
	}


	@Override
	public String toString() {
		return "AdminDTO [id=" + id + ", pwd=" + pwd + ", level=" + level + "]";
	}
	
	

}
