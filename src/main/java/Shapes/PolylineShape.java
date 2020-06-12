package shapes;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Shape;
import java.awt.geom.Point2D;
import java.util.List;


public class PolylineShape extends BaseShape {
	
	private Color shapeColor;
	private Polyline shape=null;
	public PolylineShape(){
		this.shape = new Polyline();
	}
	@Override
	public void drawShape(Graphics g) {
		g.setColor(shapeColor);
		g.drawPolyline(shape.getX(),shape.getY(),shape.size());
	}
	
	@Override
	public Color getColor() {
		// TODO Автоматически созданная заглушка метода
		return null;
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
		this.shape=(Polyline) shape;
	}

	@Override
	public void addCoordinates(Point2D point) {
		this.shape.addCoordinates(point);
	}

	@Override
	public void addCurrCoordinates(Point2D point) {
		this.shape.addCurrCoordinates(point);
	}
	@Override
	public List<Point2D> getPoints() {
		return shape.getPoints();
	}
	@Override
	public String getType() {
		return "Polyline";
	}
	@Override
	public void setCoordinates(List<Point2D> points) {
		for(int i = 0 ;i < points.size()-1;i++) {
			addCoordinates(points.get(i));
		}
		addCurrCoordinates(points.get(points.size()-1));
	}
	
	
}
