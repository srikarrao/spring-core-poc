package org.poc.techs.spring.core1.programs;

public class TriangleInnerBean {
	private Point pointAInner;
	private Point pointBInner;
	private Point pointCInner;

	public Point getPointAInner() {
		return pointAInner;
	}

	public void setPointAInner(Point PointAInner) {
		this.pointAInner = PointAInner;
	}

	public Point getPointBInner() {
		return pointBInner;
	}

	public void setPointBInner(Point PointBInner) {
		this.pointBInner = PointBInner;
	}

	public Point getPointCInner() {
		return pointCInner;
	}

	public void setPointCInner(Point PointCInner) {
		this.pointCInner = PointCInner;
	}

	public void draw() {
		System.out.println("PointAInner : (" + getPointAInner().getX() + ","
				+ getPointAInner().getY() + ")");

		System.out.println("PointBInner : (" + getPointBInner().getX() + ","
				+ getPointBInner().getY() + ")");

		System.out.println("PointCInner : (" + getPointCInner().getX() + ","
				+ getPointCInner().getY() + ")");
	}
}
