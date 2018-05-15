package org.zerock.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import lombok.extern.log4j.Log4j;

@Controller
@Log4j
public class Samplecontroller4 {
	
	@RequestMapping("doE")
	public String doE(RedirectAttributes rttr) {
		log.info("doE called but redirect to /doF............");
	
	return "redirect:/doF";
	}
	
	@RequestMapping("doF")
	public void doF(@ModelAttribute String msg) {
		log.info("doF called.............."+msg);
	}

}
