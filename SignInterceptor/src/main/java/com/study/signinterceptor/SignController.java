package com.study.signinterceptor;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.stduy.signinterceptor.dto.SignDTO;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping("/sign")
public class SignController {
	
	private static final Logger logger = LoggerFactory.getLogger(SignController.class);
	

	
	
	@RequestMapping(value = "/in", method = RequestMethod.GET)
	public String sign(SignDTO dto) {				
		return "sign/in";
	}
	@RequestMapping(value = "/in", method = RequestMethod.POST)
	public String signProcess(SignDTO dto, HttpSession session) {	
		
		
		System.out.println(dto.getId());
		
		//db에서 id와 pw가 있는지 검사한다. 
		
		if(dto != null && dto.getId() != null && !"".equals(dto.getId())){
			session.setAttribute("login", dto.getId());
			return "redirect:/home";
		}else{
			return "redirect:/sign/in";
		}

	}
	
	
	
}
