package com.test.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

/**
 * @author wuxw
 * @since 2020/3/31
 */
@Aspect
@Service
@Order(1)
public class AspectJTest1 {

	@Pointcut("execution(* *.test(..))")
	public void aspectJTest() {

	}

	@Before("aspectJTest()")
	public void beforeTest() {
		System.out.println("AspectJTest1--->beforeTest1");
	}

//	@After("aspectJTest()")
	public void afterTest() {
		System.out.println("AspectJTest1--->afterTest1");
	}

	// 注意：测试环绕增强的时候，要和其他增强分开测试，否则会报异常
	@Around("aspectJTest()")
	public Object aroundTest(ProceedingJoinPoint point) {
		System.out.println("AspectJTest1--->before1");
		Object o = null;
		try {
			o = point.proceed();
		} catch (Throwable throwable) {
			throwable.printStackTrace();
		}
		System.out.println("AspectJTest1--->after1");
		return o;
	}



}
