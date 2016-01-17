package com.marolab.notice.dao.impl;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.marolab.notice.dao.NoticeDao;
import com.marolab.notice.vo.Notice;

@Repository
public class NoticeDaoImpl implements NoticeDao {

	@Autowired
	private SqlSession sqlSession;

	public <T extends Notice> List<T> getNotice(Map param) throws SQLException {
		return sqlSession.selectList("notice.getNotice", param);
	}
	
}
