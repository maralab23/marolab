package com.marolab.blog.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.marolab.blog.vo.Blog;

public interface BlogDao {

	public <T extends Blog> List<T> getBlog(Map param) throws SQLException;
	
}
