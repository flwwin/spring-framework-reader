package com.leven.spring.reader.cycle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class B {

	protected final Log logger = LogFactory.getLog(getClass());

	private A a;

	public A getA() {
		return a;
	}

	public void setA(A a) {
		logger.info("B createing ......");
		this.a = a;
	}
}
