package com.marolab.notice.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marolab.notice.dao.NoticeDao;
import com.marolab.notice.service.NoticeService;
import com.marolab.notice.vo.Notice;

/**
 * @author EunCheolLee
 * @since 2016.01 최초생성
 */
@Service
public class NoticeServiceImpl implements NoticeService {

	@Autowired
	private NoticeDao noticeDao;

	@Override
	public List<Notice> getNoticeList(Map param) throws Exception {
		return noticeDao.getNoticeList(param);
	}

	@Override
	public Notice getNoticeBySeq(int seq) throws Exception {
		return this.noticeDao.getNoticeBySeq(seq);
	}
	
	@Override
	public int addNotice(Notice notice) throws Exception {
		return this.noticeDao.addNotice(notice);
	}

	@Override
	public int modifyNotice(Notice notice) throws Exception {
		return this.noticeDao.modifyNotice(notice);
	}

	@Override
	public int removeNotice(Notice notice) throws Exception {
		return this.noticeDao.removeNotice(notice);
	}
	
}
