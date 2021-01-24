package com.leven.spring.reader;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.util.Assert;

import java.util.concurrent.Semaphore;

public class Demo {
//	@Test
//	public void  test(){
//		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//		Person person= (Person) context.getBean("person");
//		Assert.assertEquals("luozhou",person.getName());
//	}


	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		Person person= (Person) context.getBean("person");
		//Assert.assertEquals("luozhou",person.getName());
		System.out.println("person = " + person.getName());

		/*XmlBeanFactory bf = new XmlBeanFactory(new ClassPathResource("bean.xml"));
		Person person1 = (Person) bf.getBean("person");
		System.out.println("person1.getName() = " + person1.getName());*/

		//AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();

	}
}
