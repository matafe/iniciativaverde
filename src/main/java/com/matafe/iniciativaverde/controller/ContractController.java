package com.matafe.iniciativaverde.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.matafe.iniciativaverde.form.PageViewForm;
import com.matafe.iniciativaverde.service.PageViewCalculator;

/**
 * <p>
 * Contract Contrller
 * 
 * @author Mauricio Tavares Ferraz
 */
@Controller
public class ContractController {

	@Autowired
	private PageViewCalculator calculator;

	@RequestMapping(value = "/contract", method = RequestMethod.GET)
	public String contact(Model m) {
		m.addAttribute("pageView", new PageViewForm());
		return "contract";
	}

	@RequestMapping(value = "/contract", method = RequestMethod.POST)
	public String addContact(
			@ModelAttribute("pageView") PageViewForm pageViewForm, Model m) {
		Integer pageViews = pageViewForm.getPageViews();
		Integer trees = calculator.calculate(pageViews);
		m.addAttribute("treesCount", trees);
		return "contract";
	}

}
