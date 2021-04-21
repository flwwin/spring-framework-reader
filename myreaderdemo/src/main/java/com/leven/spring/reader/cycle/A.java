package com.leven.spring.reader.cycle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class A {
	protected final Log logger = LogFactory.getLog(getClass());
	private B b;

	public B getB() {
		return b;
	}

	public void setB(B b) {
		logger.info("a creating....");
		this.b = b;
	}
}
