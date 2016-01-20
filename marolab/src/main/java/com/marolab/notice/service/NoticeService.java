package com.marolab.notice.service;

import java.util.List;
import java.util.Map;

import com.marolab.notice.vo.Notice;

/**
 * @author EunCheolLee
 * @since 2016.01 최초생성
 */
public interface NoticeService {
	
	public List<Notice> getNoticeList(Map param) throws Exception;
	
	public Notice getNoticeBySeq(int seq) throws Exception;
	
	public int addNotice(Notice notice) throws Exception;
	
	public int modifyNotice(Notice notice) throws Exception;
	
	public int removeNotice(Notice notice) throws Exception;

}
