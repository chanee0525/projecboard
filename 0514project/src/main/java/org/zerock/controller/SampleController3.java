package org.zerock.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerock.domain.ProductVO;

import lombok.extern.log4j.Log4j;

@Controller
@Log4j
public class SampleController3 {
	
	@RequestMapping("doD")
	public String doD(Model model) {
		ProductVO product = new ProductVO("pentagon", 161010);
		
		log.info("doD");
		
		model.addAttribute(product);
		
		return "productDetail";
		
		
	}

}
