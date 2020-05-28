package Shapes;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.List;

public class RectShape extends BaseShape {
	private List<Point2D> coordinates;
	private Color shapeColor;
	private Shape shape;
	public RectShape(){
		this.shapeColor = Color.black;
		this.coordinates = new ArrayList<Point2D>();
	}
	
	@Override
	public void drawShape(Graphics g) {
		g.setColor(shapeColor);
		g.drawRect(((Rectangle)shape).x,((Rectangle)shape).y, ((Rectangle)shape).width,((Rectangle)shape).height);
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
		this.shape = (Rectangle)shape;
	}

	@Override
	public void addCoordinates(Point2D point) {
		coordinates.add(0, point);
	}

	@Override
	public void addCurrCoordinates(Point2D point) {
		coordinates.add(1, point);
		Rectangle rect = new Rectangle();
		rect.setFrameFromDiagonal(coordinates.get(0), coordinates.get(1));
		shape=rect;
	}

}
