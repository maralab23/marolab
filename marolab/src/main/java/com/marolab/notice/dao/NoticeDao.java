package com.marolab.notice.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.marolab.notice.vo.Notice;

public interface NoticeDao {

	public <T extends Notice> List<T> getNotice(Map param) throws SQLException;
	
}
