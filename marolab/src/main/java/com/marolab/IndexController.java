package com.marolab;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author EunCheolLee
 * @since 2016.01 최초생성
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
