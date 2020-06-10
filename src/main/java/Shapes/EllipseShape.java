package Shapes;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.List;

public class EllipseShape extends BaseShape {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<Point2D> coordinates;
	private Color shapeColor;
	private Shape shape=null;
	public EllipseShape(){
		this.coordinates = new ArrayList<Point2D>();
	}
	@Override
	public void drawShape(Graphics g) {
		g.setColor(shapeColor);
		g.drawOval((int)(((Ellipse2D.Double)shape).x),(int)(((Ellipse2D.Double)shape).y), (int)(((Ellipse2D.Double)shape).width),(int)(((Ellipse2D.Double)shape).height));
	}

	@Override
	public Color getColor() {
		return shapeColor;
	}

	@Override
	public void setColor(Color color) {
		shapeColor = color;
	}

	@Override
	public Shape getShape() {
		return shape;
	}

	@Override
	public void setShape(Shape shape) {
		this.shape = (Ellipse2D)shape;
	}

	@Override
	public void addCoordinates(Point2D point) {
		coordinates.add(0, point);
	}

	@Override
	public void addCurrCoordinates(Point2D point) {
		coordinates.add(1, point);
		Ellipse2D elip = new Ellipse2D.Double();
		elip.setFrameFromDiagonal(coordinates.get(0), coordinates.get(1));
		shape=elip;
	}

}
