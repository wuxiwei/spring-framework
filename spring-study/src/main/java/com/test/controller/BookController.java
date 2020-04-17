package com.test.controller;

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

	@GetMapping("hello")
	public String getBook(HttpServletRequest request, HttpServletResponse response) {
		return "hello";
	}


}
