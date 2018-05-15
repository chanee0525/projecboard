package org.zerock.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j;

@Controller
@Log4j
public class SampleController2 {
	
	@RequestMapping("doC")
	public String doC(@ModelAttribute("msg") String msg) {
		log.info("doC called.............");
		
		return "result";
	}

}
