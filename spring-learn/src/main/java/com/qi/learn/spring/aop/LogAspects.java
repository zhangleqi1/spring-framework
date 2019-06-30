package com.qi.learn.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LogAspects {
	@Pointcut("execution( * com.qi.learn.spring.service.*.*(..))")
	private void pointCut() {

	}

	@Around("pointCut()")
	public void around(ProceedingJoinPoint proceedingJoinPoint) {
		try {
			System.out.println("切之前执行");
			proceedingJoinPoint.proceed();
			System.out.println("切之后执行");
		} catch (Throwable throwable) {
			throwable.printStackTrace();
		}

	}

}
