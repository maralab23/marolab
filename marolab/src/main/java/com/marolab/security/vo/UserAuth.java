package com.marolab.security.vo;

import org.springframework.security.core.GrantedAuthority;

/**
 * @author EunCheolLee
 * @since 2016.01 최초생성
 */
public class UserAuth implements GrantedAuthority {

	private String userId;
	
	private String auth;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getAuth() {
		return auth;
	}

	public void setAuth(String auth) {
		this.auth = auth;
	}

	@Override
	public String getAuthority() {
		return this.auth;
	}
	
}
