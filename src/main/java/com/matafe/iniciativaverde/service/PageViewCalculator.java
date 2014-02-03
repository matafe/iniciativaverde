package com.matafe.iniciativaverde.service;

import org.springframework.stereotype.Component;

/**
 * <p>
 * Description
 * 
 * @author Mauricio Tavares Ferraz
 */
@Component
public class PageViewCalculator {

	public static Integer NUMBER = 8333;

	public Integer calculate(Integer pageViews) {
		if (pageViews <= 0) {
			return 0;
		}

		if (pageViews < NUMBER) {
			return 1;
		}

		Integer div = pageViews / NUMBER;
		Integer quoc = pageViews % NUMBER;

		Integer result = null;

		if (quoc > 0) {
			result = div + 1;
		} else {
			result = div;
		}

		return result;

	}
}
