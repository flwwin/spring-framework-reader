package com.leven.spring.reader;

import com.leven.spring.reader.cycle.A;
import com.leven.spring.reader.cycle.B;
import com.leven.spring.reader.entity.Person;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.Environment;

public class Demo {

	protected final Log logger = LogFactory.getLog(getClass());
	@Test
	public void  test(){
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		A a = (A) context.getBean("a");
		B b= (B) context.getBean("b");
		System.out.println("a = " +a);
		System.out.println("b = " +b);
	}

	@Test
	public void  test01(){
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		Environment environment = context.getEnvironment();
		String name = environment.getProperty("name");
		System.out.println("name = " + name);
	}

	@Test
	public void  test02(){
		//ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext("com/leven/spring/reader");
		Person person= (Person) applicationContext.getBean("person");
		System.out.println("person = " + person.getName());
	}
}
