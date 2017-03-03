package com.ichunming.common.helper;

public class SessionInfo {
	
	private Integer role;
	
	private String username;
	
	private String password;

	public SessionInfo(Integer role, String username, String password) {
		this.role = role;
		this.username = username;
		this.password = password;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Integer getRole() {
		return role;
	}

	public void setUid(Integer role) {
		this.role = role;
	}
}