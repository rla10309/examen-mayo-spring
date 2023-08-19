package com.dawes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MaInController {
	
	@RequestMapping({"/", "/index"})
	public String index() {
		return "index";
	}

}
