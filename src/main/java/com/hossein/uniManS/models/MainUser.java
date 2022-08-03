package com.hossein.uniManS.models;

import com.hossein.uniManS.models.roles.RoleModel;

public class MainUser {
	
	private String username;
	private String password;
	private RoleModel role;
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
	public RoleModel getRole() {
		return role;
	}
	public void setRole(RoleModel role) {
		this.role = role;
	}

}
