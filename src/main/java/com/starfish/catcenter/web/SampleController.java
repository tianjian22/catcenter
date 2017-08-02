package com.starfish.catcenter.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SampleController {

	@RequestMapping(value = "/hello1", method = RequestMethod.GET)
	public String printHello(ModelMap modelMap) {
		modelMap.put("message", "hello");

		modelMap.addAttribute("message", "hello111");
		return "hello.vm";
	}

}