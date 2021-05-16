package com.leven.spring.reader.life;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import java.util.Properties;

@Service
public class PropertiesDemo {

	@Value("classpath:test.properties")
	private Resource properties;

	public Resource getProperties() {
		return properties;
	}

	public void setProperties(Resource properties) {
		this.properties = properties;
	}
}
