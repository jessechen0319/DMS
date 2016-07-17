package com.amd.dms.test.db;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBeanTest {

	@Test
	public void test() {
		ApplicationContext context = 
	             new ClassPathXmlApplicationContext("classpath:spring-config.xml");

	      TestBeanDAOImpl studentJDBCTemplate = 
	      (TestBeanDAOImpl)context.getBean("testBeanDAOImpl");
	      
	      studentJDBCTemplate.create("Zara", 11);
	      studentJDBCTemplate.create("Nuha", 2);
	      studentJDBCTemplate.create("Ayan", 15);
	}

}
