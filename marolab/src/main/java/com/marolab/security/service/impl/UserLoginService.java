package com.marolab.security.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.marolab.security.dao.UserDao;
import com.marolab.security.vo.User;

/**
 * @author EunCheolLee
 * @since 2016.01 최초생성
 */
@Service
public class UserLoginService implements UserDetailsService {
	
	@Autowired
	private UserDao userDao;

	@Override
	public UserDetails loadUserByUsername(String userId) throws UsernameNotFoundException {
		User user = null;
		
		try {
			user = this.userDao.getUserByUserId(userId);
			
			if (user != null) {
				this.setAuthorities(user);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return user;
	}
	
	private void setAuthorities(User user) throws Exception {
		user.setAuthorities(this.userDao.getUserAuthList(user));
	}
	
}
