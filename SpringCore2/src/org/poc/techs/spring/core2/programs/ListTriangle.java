package org.poc.techs.spring.core2.programs;

import java.util.List;

public class ListTriangle {
	private List<Point> pointsList;

	public List<Point> getPointsList() {
		return pointsList;
	}

	public void setPointsList(List<Point> pointsList) {
		this.pointsList = pointsList;
	}

	public void draw() {
		for (Point point : pointsList) {
			System.out.println("Point : (" + point.getX() + "," + point.getY()
					+ ")");
		}
	}
}
