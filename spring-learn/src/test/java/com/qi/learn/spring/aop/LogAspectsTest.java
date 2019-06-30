package com.qi.learn.spring.aop;

import com.qi.learn.spring.config.AopConfig;
import com.qi.learn.spring.service.PersonService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LogAspectsTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(AopConfig.class);
		PersonService personService = annotationConfigApplicationContext.getBean(PersonService.class);
		personService.addPerson();

	}

}