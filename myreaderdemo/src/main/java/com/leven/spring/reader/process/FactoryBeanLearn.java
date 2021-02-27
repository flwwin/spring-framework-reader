package com.leven.spring.reader.process;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class FactoryBeanLearn implements FactoryBean {

	public Object getObject() throws Exception {
		//这个Bean是我们自己new的，这里我们就可以控制Bean的创建过程了
		return new FactoryBeanService();
	}

	public Class<?> getObjectType() {
		return FactoryBeanService.class;
	}

	public boolean isSingleton() {
		return true;
	}
}

class FactoryBeanService{

	public void say(){
		System.out.println("hello start...");
	}
}