package com.marolab.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author EunCheolLee
 * @since 2016.01 최초생성
 */
@Controller
public class LoginController {

	@RequestMapping(value="/login.do")
	public String login() throws Exception{
		return "security/login";
	}
	
}
