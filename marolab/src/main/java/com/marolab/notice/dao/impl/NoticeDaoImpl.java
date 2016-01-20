package com.marolab.notice.dao.impl;

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

	@Override
	public List<Notice> getNoticeList(Map param) throws Exception {
		return sqlSession.selectList("notice.getNoticeList", param);
	}

	@Override
	public Notice getNoticeBySeq(int seq) throws Exception {
		return sqlSession.selectOne("notice.getNoticeBySeq", seq);
	}
	
	@Override
	public int addNotice(Notice notice) throws Exception {
		return sqlSession.insert("notice.addNotice", notice);
	}

	@Override
	public int modifyNotice(Notice notice) throws Exception {
		return sqlSession.update("notice.modifyNotice", notice);
	}

	@Override
	public int removeNotice(Notice notice) throws Exception {
		return sqlSession.delete("notice.removeNotice", notice);
	}
	
}
