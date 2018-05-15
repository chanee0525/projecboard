package org.zerock.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j;

@Log4j
@Controller
public class SampleController {

	@RequestMapping("doA")
	public void doA() {
		log.info("doA called..............");
	}

	@RequestMapping("doB")
	public void doB() {
		log.info("doB called.............");
	}

}
