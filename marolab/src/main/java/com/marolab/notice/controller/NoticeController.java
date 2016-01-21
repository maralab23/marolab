package com.marolab.notice.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.bind.annotation.RequestMapping;

import com.marolab.notice.service.NoticeService;
import com.marolab.notice.vo.Notice;
import com.marolab.security.vo.User;

/**
 * @author EunCheolLee
 * @since 2016.01 최초생성
 */
@Controller
public class NoticeController {
	
	@Autowired
	private NoticeService noticeService;

	@RequestMapping(value="/notice.do")
	public String notice(ModelMap model) throws Exception {
		
		model.put("noticeList", this.noticeService.getNoticeList(null)); 
		
		return "notice/notice";
	}
	
	@RequestMapping(value="/noticeForm.do")
	public String noticeForm(ModelMap model, HttpServletRequest request) throws Exception {
		int seq = ServletRequestUtils.getIntParameter(request, "seq", 0);
		
		if (seq != 0) {
			model.put("notice", this.noticeService.getNoticeBySeq(seq));
		}
		
		return "notice/noticeForm";
	}	
	
	@RequestMapping(value="/noticePostProcess.do")
	public String noticePostProcess(ModelMap model, HttpServletRequest request, Notice notice) throws Exception {
		String flag = ServletRequestUtils.getStringParameter(request, "flag", "");
		User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		notice.setAuthor(user.getUserId());
		
		int resultCount = 0;
		String resultMessge = "";
		if (!StringUtils.isEmpty(flag) && flag.equals("add")) {
			resultCount = this.noticeService.addNotice(notice);
			if (resultCount == 0) resultMessge = "add error"; 
		} else if (!StringUtils.isEmpty(flag) && flag.equals("modify")) { 
			resultCount = this.noticeService.modifyNotice(notice);
			if (resultCount == 0) resultMessge = "modify error";
		} else if (!StringUtils.isEmpty(flag) && flag.equals("remove")) { 
			resultCount = this.noticeService.removeNotice(notice);
			if (resultCount == 0) resultMessge = "remove error";
		} else {
			
		}
		
		return "redirect:/notice.do";
	}

}
