package org.poc.techs.spring.core1.programs;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class DrawingApp {

	@SuppressWarnings("resource")
	public static void main(String[] ags) {
		// Triangle tle = new Triangle();
		// BeanFactory factory = new XmlBeanFactory(new
		// FileSystemResource("spring.xml"));
		// Triangle triangle = (Triangle) factory.getBean("triangle");

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"spring.xml");

		System.out.println("Conventional beans: ");
		Triangle triangle = (Triangle) context.getBean("triangle");
		triangle.draw();
		System.out.println();

		System.out.println("Reference beans: ");
		TrianglePointer pointer = (TrianglePointer) context
				.getBean("trianglePointer");
		pointer.draw();
		System.out.println();

		System.out.println("Inner beans: ");
		TriangleInnerBean innerBean = (TriangleInnerBean) context
				.getBean("inner");
		innerBean.draw();
		System.out.println();

		System.out.println("Collection-List beans: ");
		ListTriangle list = (ListTriangle) context.getBean("listTriangle");
		list.draw();
		System.out.println();

		System.out.println("Autowired beans: ");
		TrianglePointer autowire = (TrianglePointer) context
				.getBean("trianglePointer2");
		autowire.draw();
		System.out.println();

	}
}
