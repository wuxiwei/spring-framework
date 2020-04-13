package com.test.aop;

import org.springframework.stereotype.Service;

/**
 * @author wuxw
 * @since 2020/3/31
 */
@Service("testBean")
public class TestBean implements ITestBean {

	private String testStr = "testStr";

	public String getTestStr() {
		return testStr;
	}

	public void setTestStr(String testStr) {
		this.testStr = testStr;
	}

	public void test() {
		System.out.println("test");
	}
}
