package Shapes;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

import java.awt.Shape;

import java.awt.geom.Point2D;


public class PolygonShape extends BaseShape {
	private Color shapeColor;
	private Polygon shape=null;
	public PolygonShape(){
		this.shape=new Polygon();
	}
	@Override
	public void drawShape(Graphics g) {
		g.setColor(shapeColor);
		g.drawPolygon(shape);
		
	}

	@Override
	public Color getColor() {
		return this.shapeColor;
	}

	@Override
	public void setColor(Color color) {
		this.shapeColor=color;
		
	}

	@Override
	public Shape getShape() {
		return this.shape;
	}

	@Override
	public void setShape(Shape shape) {
		this.shape=(Polygon) shape;
	}

	@Override
	public void addCoordinates(Point2D point) {
		shape.addPoint((int)point.getX(), (int)point.getY());
	}

	@Override
	public void addCurrCoordinates(Point2D point) {
		
	}	

}
