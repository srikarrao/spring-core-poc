package org.poc.techs.spring.core2.programs;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp_init {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"spring-2.xml");
		context.registerShutdownHook();
		Triangle_Init tle = (Triangle_Init) context.getBean("init_triangle");
		tle.draw();
	}

}
