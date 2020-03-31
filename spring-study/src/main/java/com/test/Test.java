package com.test;

import com.test.aop.TestBean;
import com.test.api.A;
import com.test.api.B;
import com.test.impl.AImpl;
import com.test.impl.BImpl;
import com.test.impl.StudentA;
import com.test.impl.UserServiceImpl;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * @author wuxiwei
 * @date 2020/3/15
 */
//@ComponentScan("com.test")
public class Test {

	public static void main(String[] args) {
//		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Test.class);
//		AImpl a = context.getBean(AImpl.class);
//		BImpl b = context.getBean(BImpl.class);
//		System.out.println(a.get());
//		System.out.println(b.get());

//		XmlBeanFactory bf = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
		ApplicationContext bf = new ClassPathXmlApplicationContext("applicationContext.xml");

		A a = (A) bf.getBean("a");
		B b = (B) bf.getBean("b");
		TestBean testBean = (TestBean) bf.getBean("testBean");
		testBean.test();
//		System.out.println(a.aget());
//		System.out.println(b.bget());

//		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//		System.out.println(context.getBean("a", StudentA.class));


//		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//		System.out.println(context.getBean("a", AImpl.class).get());
//		System.out.println(context.getBean("b", BImpl.class).get());




	}

}
