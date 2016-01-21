package com.marolab.common.interceptor;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * @author EunCheolLee
 * @since 2016.01
 * Error 처리를 위한 공통 Controller 정의
 */
@Controller
public class ErrorController {

	@RequestMapping(value="error.do")
	public String error(ModelMap model, HttpServletRequest request) throws Exception {
		Exception exception = (Exception) request.getAttribute("javax.servlet.error.exception");
		
		String errorMessage = exception.getMessage();
		if (!StringUtils.isEmpty(errorMessage)) {
			model.put("errorMessage", errorMessage);
		}
		
		return "common/error";
	}
	
}
