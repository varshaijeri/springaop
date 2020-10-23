package com.varsha.spring.springaop.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.varsha.spring.springaop.ProductService;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/varsha/spring/springaop/test/config.xml");
		ProductService productService = (ProductService)ctx.getBean("productService");
		int result = productService.multiple(40, 20);
		System.out.println("Answer is: "+result);
	}

}
