package com.marolab.blog.service.impl;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marolab.blog.dao.BlogDao;
import com.marolab.blog.service.BlogService;
import com.marolab.blog.vo.Blog;

@Service
public class BlogServiceImpl implements BlogService {

	@Autowired
	private BlogDao blogDao;
	
	public <T extends Blog> List<T> getBlog(Map param) throws SQLException {
		return blogDao.getBlog(param);
	}
	
}
