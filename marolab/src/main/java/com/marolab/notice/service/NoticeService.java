package com.marolab.notice.service;

import java.util.List;
import java.util.Map;

import com.marolab.notice.vo.Notice;

public interface NoticeService {
	
	public List<Notice> getNoticeList(Map param) throws Exception;
	
	public Notice getNoticeBySeq(int seq) throws Exception;
	
	public int addNotice(Notice notice) throws Exception;
	
	public int modifyNotice(Notice notice) throws Exception;
	
	public int removeNotice(Notice notice) throws Exception;

}
