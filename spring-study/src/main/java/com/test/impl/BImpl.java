package com.test.impl;

import com.test.api.A;
import com.test.api.B;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BImpl implements B {

	@Autowired
	private A a;

	@Override
	public String get() {
		return "B Service: " + a.get();
	}
}
