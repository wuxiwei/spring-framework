package com.test.controller;

import com.test.aop.ITestBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author wuxw
 * @since 2020/4/17
 */
@RestController
public class BookController {

	@Autowired
	private ITestBean testBean;

	@GetMapping("hello")
	public String getBook(HttpServletRequest request, HttpServletResponse response) {
		testBean.test();
		return "hello";
	}


}
