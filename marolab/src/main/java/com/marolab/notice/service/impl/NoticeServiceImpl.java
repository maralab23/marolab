package com.marolab.notice.service.impl;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marolab.notice.dao.NoticeDao;
import com.marolab.notice.service.NoticeService;
import com.marolab.notice.vo.Notice;

@Service
public class NoticeServiceImpl implements NoticeService {

	@Autowired
	private NoticeDao noticeDao;

	public <T extends Notice> List<T> getNotice(Map param) throws Exception {
		return noticeDao.getNotice(param);
	}

	public Notice getNoticeBySeq(int seq) throws Exception {
		return this.noticeDao.getNoticeBySeq(seq);
	}
	
	public int addNotice(Notice notice) throws Exception {
		return this.noticeDao.addNotice(notice);
	}

	public int modifyNotice(Notice notice) throws Exception {
		return this.noticeDao.modifyNotice(notice);
	}

	public int removeNotice(Notice notice) throws Exception {
		return this.noticeDao.removeNotice(notice);
	}
	
}
