package com.marolab.security.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.marolab.security.dao.UserDao;
import com.marolab.security.vo.UserAuth;
import com.marolab.security.vo.User;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public User getUserByUserId(String userId) throws Exception {
		return sqlSession.selectOne("user.getUserByUserId", userId);
	}

	@Override
	public List<UserAuth> getUserAuthList(User user) throws Exception {
		return sqlSession.selectList("user.getUserAuthList", user);
	}
	
}
