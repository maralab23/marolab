package com.marolab.security.dao;

import java.util.List;

import com.marolab.security.vo.UserAuth;
import com.marolab.security.vo.User;

/**
 * @author EunCheolLee
 * @since 2016.01 최초생성
 */
public interface UserDao {

	public User getUserByUserId(String userId) throws Exception;

	public List<UserAuth> getUserAuthList(User user) throws Exception;
	
}
