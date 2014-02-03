package com.matafe.iniciativaverde.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * <p>
 * Welcome Controller
 * 
 * @author Mauricio Tavares Ferraz
 */
@Controller
@RequestMapping("/welcome")
public class HelloController {

	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		System.out.println("OK");
		model.addAttribute("message", "Spring 3 MVC Hello World");
		return "hello";
	}

}