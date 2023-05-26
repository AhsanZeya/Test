package com.good.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GoodController {
	
	@RequestMapping("/")
	public String newOk() {
		return "new";
	}
	

	//Second Edituting
}
