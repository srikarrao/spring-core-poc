package org.poc.techs.spring.core2.programs;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Triangle_Init /* implements InitializingBean, DisposableBean */{

	private Point pointA;
	private Point pointB;
	private Point pointC;

	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	public void draw() {
		System.out.println("PointA : (" + getPointA().getX() + ","
				+ getPointA().getY() + ")");

		System.out.println("PointB : (" + getPointB().getX() + ","
				+ getPointB().getY() + ")");

		System.out.println("PointC : (" + getPointC().getX() + ","
				+ getPointC().getY() + ")");
	}

	/*
	 * @Override public void afterPropertiesSet() throws Exception {
	 * System.out.println("InitializingBean init method called for Triangle"); }
	 * 
	 * @Override public void destroy() throws Exception {
	 * System.out.println("Destroying method called for Triangle"); }
	 */

	/**
	 * Spring-Bean init method
	 */
	public void myInit() {
		System.out.println("My init method called for Triangle!");
	}

	/**
	 * Spring-Bean destroy method
	 */
	public void cleanup() {
		System.out.println("My cleanup method called for Triangle!");
	}
}
