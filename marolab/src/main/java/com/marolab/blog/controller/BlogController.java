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
	
	@ResponseBody
	@RequestMapping(value="/main.do")
	public ModelAndView index(ModelMap model) throws Exception {
		List<Blog> blogList = blogService.getBlog(null);
		model.put("blogList", blogList);
		System.out.println("Controller.index - blogList : " + blogList.toString());
		
		return new ModelAndView("index", model);
	}

}
