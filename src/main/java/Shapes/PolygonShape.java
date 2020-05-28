package Shapes;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Shape;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.List;

public class PolygonShape extends BaseShape {
	private List<Point2D> coordinates;
	private Color shapeColor;
	private Shape shape;
	public PolygonShape(){
		this.coordinates = new ArrayList<Point2D>();
	}
	@Override
	public void drawShape(Graphics g) {
		// TODO Автоматически созданная заглушка метода
		
	}

	@Override
	public Color getColor() {
		// TODO Автоматически созданная заглушка метода
		return null;
	}

	@Override
	public void setColor(Color color) {
		// TODO Автоматически созданная заглушка метода
		
	}

	@Override
	public Shape getShape() {
		// TODO Автоматически созданная заглушка метода
		return null;
	}

	@Override
	public void setShape(Shape shape) {
		// TODO Автоматически созданная заглушка метода
		
	}

	@Override
	public void addCoordinates(Point2D point) {
		// TODO Автоматически созданная заглушка метода
		
	}

	@Override
	public void addCurrCoordinates(Point2D point) {
		// TODO Автоматически созданная заглушка метода
		
	}

}
