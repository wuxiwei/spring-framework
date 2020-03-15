package com.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author wuxiwei
 * @date 2020/3/15
 */
@ComponentScan("com.test")
public class Test {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Test.class);
		UserServiceImpl bean = context.getBean(UserServiceImpl.class);
		System.out.println(bean.hello());
	}

}
