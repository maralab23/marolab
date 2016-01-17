package com.marolab.notice.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.marolab.notice.vo.Notice;

public interface NoticeService {
	
	public <T extends Notice> List<T> getNotice(Map param) throws SQLException;

}
