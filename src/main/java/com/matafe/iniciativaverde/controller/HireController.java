package com.matafe.iniciativaverde.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.matafe.iniciativaverde.domain.Certificate;
import com.matafe.iniciativaverde.domain.Member;
import com.matafe.iniciativaverde.domain.Site;
import com.matafe.iniciativaverde.form.PageViewForm;
import com.matafe.iniciativaverde.service.PageViewCalculator;
import com.matafe.iniciativaverde.service.SiteService;

/**
 * <p>
 * Hire Contrller
 * 
 * @author Mauricio Tavares Ferraz
 */
@Controller
public class HireController {

	@Autowired
	private PageViewCalculator calculator;

	@Autowired
	private SiteService siteService;

	@RequestMapping(value = "/hire", method = RequestMethod.GET)
	public String contact(Model m) {
		m.addAttribute("pageView", new PageViewForm());
		return "hire";
	}

	@RequestMapping(value = "/hire", method = RequestMethod.POST)
	public String addContact(
			@ModelAttribute("pageView") PageViewForm pageViewForm, Model m) {
		Integer pageViews = pageViewForm.getPageViews();
		Integer trees = calculator.calculate(pageViews);
		m.addAttribute("treesCount", trees);
		return "hire";
	}

	@RequestMapping(value = "/cert", method = RequestMethod.GET)
	public String viewCert(@RequestParam("url") String url, Model m) {
		System.out.println("URL=" + url);

		// if (url == null || url.isEmpty()) {
		// result.rejectValue("url", "notFound", "not found");
		// }

		Site site = siteService.fetchSite(url);
		Member owner = site.getOwner();
		Certificate certificate = site.getLastCertificate();

		m.addAttribute("site", site);
		m.addAttribute("owner", owner);
		m.addAttribute("certificate", certificate);

		return "cert";
	}

}
