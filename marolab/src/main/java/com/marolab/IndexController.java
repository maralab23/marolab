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
	public ModelAndView home(ModelMap model) throws Exception {
		return new ModelAndView("home", model);
	}

	@RequestMapping(value="/about.do")
	public ModelAndView about(ModelMap model) throws Exception {
		return new ModelAndView("about", model);
	}

	@RequestMapping(value="/contact.do")
	public ModelAndView contact(ModelMap model) throws Exception {
		return new ModelAndView("contact", model);
	}	
	
}
