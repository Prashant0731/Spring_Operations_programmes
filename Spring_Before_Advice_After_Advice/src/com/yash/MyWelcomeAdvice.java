package com.yash;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class MyWelcomeAdvice implements MethodBeforeAdvice {

	public void before(Method m, Object args[], Object target) throws Throwable {
		System.out.println(" Am from BeforeAdvice to  "+m.getName());
	}
}
