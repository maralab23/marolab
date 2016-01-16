package com.marolab.blog.dao.impl;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.marolab.blog.dao.BlogDao;
import com.marolab.blog.vo.Blog;

@Repository
public class BlogDaoImpl implements BlogDao {

	@Autowired
	private SqlSession blog;

	public <T extends Blog> List<T> getBlog(Map param) throws SQLException {
		return blog.selectList("blog.getBlog", param);
	}
	
}
