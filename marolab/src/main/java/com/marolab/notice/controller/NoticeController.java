package com.marolab.notice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.marolab.notice.service.NoticeService;
import com.marolab.notice.vo.Notice;

@Controller
public class NoticeController {
	
	@Autowired
	private NoticeService noticeService;

	@RequestMapping(value="/notice.do")
	public ModelAndView notice(ModelMap model) throws Exception {
		
		List<Notice> noticeList = this.noticeService.getNotice(null);
		model.put("noticeList", noticeList);
		
		return new ModelAndView("notice", model);
	}	

}
