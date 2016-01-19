package com.marolab;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.marolab.notice.service.NoticeService;
import com.marolab.notice.vo.Notice;

/**
 * @author EunCheolLee
 * @since 2016.01
 */
@Controller
public class IndexController {

	@RequestMapping(value="/home.do")
	public String home() throws Exception {
		return "home";
	}

	@RequestMapping(value="/about.do")
	public String about() throws Exception {
		return "about";
	}

	@RequestMapping(value="/contact.do")
	public String contact() throws Exception {
		return "contact";
	}	
	
}
