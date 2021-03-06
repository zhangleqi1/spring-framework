package com.qi.learn.spring.config;

import com.qi.learn.spring.dto.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "com.qi.learn.spring")
@EnableAspectJAutoProxy
public class MainConfig {
	@Bean
	public Person person() {

		return new Person();
	}
}
