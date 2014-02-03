package com.matafe.iniciativaverde.test.util;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.matafe.iniciativaverde.service.PageViewCalculator;

/**
 * <p>
 * Description
 * 
 * @author Mauricio Tavares Ferraz
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:test-context.xml",
		"classpath:/META-INF/spring/applicationContext.xml" })
public class PageViewCalculatorTest {

	@Autowired
	private PageViewCalculator calculator;

	@Test
	public void testCalc() {
		Assert.assertEquals(Integer.valueOf(0), calculator.calculate(-1));
		Assert.assertEquals(Integer.valueOf(0), calculator.calculate(0));
		Assert.assertEquals(Integer.valueOf(1), calculator.calculate(1));
		Assert.assertEquals(Integer.valueOf(1), calculator.calculate(8000));
		Assert.assertEquals(Integer.valueOf(1), calculator.calculate(8333));
		Assert.assertEquals(Integer.valueOf(2), calculator.calculate(8334));
		Assert.assertEquals(Integer.valueOf(2), calculator.calculate(16666));
		Assert.assertEquals(Integer.valueOf(3), calculator.calculate(16667));
		Assert.assertEquals(Integer.valueOf(3), calculator.calculate(24999));
		Assert.assertEquals(Integer.valueOf(4), calculator.calculate(25000));
		Assert.assertEquals(Integer.valueOf(4), calculator.calculate(25001));
	}
}
