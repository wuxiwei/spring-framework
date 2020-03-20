package com.test.impl;

import com.test.api.A;
import com.test.api.B;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("a")
public class AImpl implements A {

	@Autowired
	private B b;

	String test;

	@Override
	public String get() {
		return "A Service: " + b.get();
	}



}
