package com.marolab.notice.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.marolab.notice.vo.Notice;

public interface NoticeDao {

	public <T extends Notice> List<T> getNotice(Map param) throws Exception;
	
	public Notice getNoticeBySeq(int seq) throws Exception;

	public int addNotice(Notice notice) throws Exception;
	
	public int modifyNotice(Notice notice) throws Exception;
	
	public int removeNotice(Notice notice) throws Exception;
	
}
