package org.poc.techs.spring.core2.programs;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] ags) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"spring.xml");
		/**
		 * ApplicationContextAware, BeanNameAware
		 */
		TrianglePointer pointer = (TrianglePointer) context
				.getBean("trianglePointer");
		pointer.draw();
		System.out.println();

		System.out.println("Bean Definition Inheritence ");
		TrianglePointer triangle2 = (TrianglePointer) context
				.getBean("childTriangle2");
		triangle2.draw();
		System.out.println();

		System.out.println("Bean Definition in List");
		ListTriangle listTriangle1 = (ListTriangle) context
				.getBean("listChild1");
		listTriangle1.draw();
		System.out.println();
	}
}
