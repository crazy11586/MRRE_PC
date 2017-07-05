package com.jsu.po;

import java.io.Serializable;

public class Users implements Serializable{
	private String usertoken;
	private String username;
	private String password;
	private String userimg;
	private String userphone;

	public Users() {
		// TODO Auto-generated constructor stub
	}


	public String getUsertoken() {
		return usertoken;
	}


	public String getUserimg() {
		return userimg;
	}

	public void setUserimg(String userimg) {
		this.userimg = userimg;
	}

	public String getUserphone() {
		return userphone;
	}

	public void setUserphone(String userphone) {
		this.userphone = userphone;
	}

	public void setUsertoken(String usertoken) {
		this.usertoken = usertoken;
	}



	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
}
