package org.springframework.cycle;


public class B {

	//protected final Log logger = LogFactory.getLog(getClass());

	private A a;

	public A getA() {
		return a;
	}

	public void setA(A a) {
		//logger.info("B createing ......");
		this.a = a;
	}
}
