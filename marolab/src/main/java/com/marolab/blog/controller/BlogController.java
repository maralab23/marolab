package com.marolab.blog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.marolab.blog.service.BlogService;
import com.marolab.blog.vo.Blog;

@Controller
public class BlogController {
	
	@Autowired
	private BlogService blogService;
	
	@RequestMapping(value="/home.do")
	public ModelAndView home(ModelMap model) throws Exception {
		List<Blog> blogList = blogService.getBlog(null);
		model.put("blogList", blogList);
		System.out.println("Controller.index - blogList : " + blogList.toString());
		
		return new ModelAndView("home", model);
	}

	@RequestMapping(value="/about.do")
	public ModelAndView about(ModelMap model) throws Exception {
		return new ModelAndView("about", model);
	}

	@RequestMapping(value="/post.do")
	public ModelAndView post(ModelMap model) throws Exception {
		return new ModelAndView("post", model);
	}

	@RequestMapping(value="/contact.do")
	public ModelAndView contact(ModelMap model) throws Exception {
		return new ModelAndView("contact", model);
	}

}
