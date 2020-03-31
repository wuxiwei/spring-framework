package com.test.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Service;

/**
 * @author wuxw
 * @since 2020/3/31
 */
@Aspect
@Service
public class AspectJTest {

	@Pointcut("execution(* *.test(..))")
	public void aspectJTest() {

	}

	@Before("aspectJTest()")
	public void beforeTest() {
		System.out.println("beforeTest");
	}

//	@After("aspectJTest()")
//	public void afterTest() {
//		System.out.println("afterTest");
//	}

	@Around("aspectJTest()")
	public Object aroundTest(ProceedingJoinPoint point) {
		System.out.println("before1");
		Object o = null;
		try {
			o = point.proceed();
		} catch (Throwable throwable) {
			throwable.printStackTrace();
		}
		System.out.println("after1");
		return o;
	}



}
