package com.hossein.uniManS.dto.login;

public class AuthRes {
	
	private final String jwtToken;

	public AuthRes(String jwtToken) {
		super();
		this.jwtToken = jwtToken;
	}

	public String getJwtToken() {
		return jwtToken;
	}

}
