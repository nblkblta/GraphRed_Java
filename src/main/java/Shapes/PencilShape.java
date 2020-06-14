package shapes;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Shape;
import java.awt.geom.Point2D;
import java.util.List;

import save.BaseShape;

public class PencilShape extends BaseShape{
	
	private Color shapeColor;
	private Curve shape=null;
	public PencilShape(){
		this.shape = new Curve();
	}

	@Override
	public void drawShape(Graphics g) {
		g.setColor(shapeColor);
		for (Point2D s: shape.getCoordinates()) {
			g.drawRect((int)s.getX(), (int)s.getY(), 1, 1);
		}
	}

	@Override
	public Color getColor() {
		return shapeColor;
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
		this.shape=(Curve) shape;
		
	}

	@Override
	public void addFirstCoordinates(Point2D point) {
		this.shape.addCurrCoordinates(point);	
	}
	
	@Override
	public void addSecondCoordinates(Point2D point) {
	}

	@Override
	public void addCurrCoordinates(Point2D point) {
		this.shape.addCurrCoordinates(point);
		
	}

	@Override
	public List<Point2D> getPoints() {
		return shape.getCoordinates();
	}

	@Override
	public String getType() {
		return "Pencil";
	}

	@Override
	public void setCoordinates(List<Point2D> points) {
		for(int i = 0 ;i < points.size();i++) {
			addFirstCoordinates(points.get(i));
		}	
	}

}
