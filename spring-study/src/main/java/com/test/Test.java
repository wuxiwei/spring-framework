package com.test;

import com.test.api.A;
import com.test.api.B;
import com.test.impl.UserServiceImpl;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.io.ClassPathResource;

/**
 * @author wuxiwei
 * @date 2020/3/15
 */
//@ComponentScan("com.test")
public class Test {

	public static void main(String[] args) {
//		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Test.class);
//		UserServiceImpl bean = context.getBean(UserServiceImpl.class);
//		System.out.println(bean.hello());

		XmlBeanFactory bf = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
		A a = (A) bf.getBean("a");
		B b = (B) bf.getBean("b");

		System.out.println(a.get());
		System.out.println(b.get());


	}

}
