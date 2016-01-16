package com.marolab.blog.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.marolab.blog.vo.Blog;

public interface BlogService {
	
	public <T extends Blog> List<T> getBlog(Map param) throws SQLException;

}
