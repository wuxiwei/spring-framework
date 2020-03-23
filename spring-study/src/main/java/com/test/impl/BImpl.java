package com.test.impl;

import com.test.api.A;
import com.test.api.B;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("b")
public class BImpl implements B {

	@Autowired
	private A a;

	@Override
	public String bget() {
		return "B Service: " + a.toString();
	}

	public String toString() {
		return "B ServiceString";
	}

}
