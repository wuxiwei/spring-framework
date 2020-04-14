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
@Order(2)
public class AspectJTest {

	@Pointcut("execution(* *.test(..))")
	public void aspectJTest() {

	}

	@Before("aspectJTest()")
	public void beforeTest() {
		System.out.println("AspectJTest--->beforeTest");
	}

//	@After("aspectJTest()")
	public void afterTest() {
		System.out.println("AspectJTest--->afterTest");
	}

	// 注意Ajc：测试环绕增强的时候，要和其他增强分开测试，否则会报异常
	@Around("aspectJTest()")
	public Object aroundTest(ProceedingJoinPoint point) {
		System.out.println("AspectJTest--->before");
		Object o = null;
		try {
			o = point.proceed();
		} catch (Throwable throwable) {
			throwable.printStackTrace();
		}
		System.out.println("AspectJTest--->after");
		return o;
	}



}
