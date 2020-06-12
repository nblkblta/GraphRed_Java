package shapes;

import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.PathIterator;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.List;

public class Polyline implements Shape{

	private List<Point2D> coordinates;
	
	Polyline(){
		this.coordinates = new ArrayList<Point2D>();
	}
	public int[] getX() {
		int[] m = new int [this.coordinates.size()];
		for(int i=1;i<this.coordinates.size();i++) {
			m[i-1]=(int) this.coordinates.get(i).getX();
		}
		m[this.coordinates.size()-1]=(int) this.coordinates.get(0).getX();
		return m;
	}
	
	public int[] getY() {
		int[] m = new int [this.coordinates.size()];
		for(int i=1;i<this.coordinates.size();i++) {
			m[i-1]=(int) this.coordinates.get(i).getY();
		}
		m[this.coordinates.size()-1]=(int) this.coordinates.get(0).getY();
		return m;
	}
	
	public int size() {
		return this.coordinates.size();
	}
	
	public void addCoordinates(Point2D point) {
		this.coordinates.add(point);
	}

	public void addCurrCoordinates(Point2D point) {
		if(this.coordinates.size()<2) {
			this.coordinates.add(point);
		}
		this.coordinates.set(0, point);
	}
	
	
	
	@Override
	public boolean contains(Point2D p) {
		// TODO Автоматически созданная заглушка метода
		return false;
	}

	@Override
	public boolean contains(Rectangle2D r) {
		// TODO Автоматически созданная заглушка метода
		return false;
	}

	@Override
	public boolean contains(double x, double y) {
		// TODO Автоматически созданная заглушка метода
		return false;
	}

	@Override
	public boolean contains(double x, double y, double w, double h) {
		// TODO Автоматически созданная заглушка метода
		return false;
	}

	@Override
	public Rectangle getBounds() {
		// TODO Автоматически созданная заглушка метода
		return null;
	}

	@Override
	public Rectangle2D getBounds2D() {
		// TODO Автоматически созданная заглушка метода
		return null;
	}

	@Override
	public PathIterator getPathIterator(AffineTransform at) {
		// TODO Автоматически созданная заглушка метода
		return null;
	}

	@Override
	public PathIterator getPathIterator(AffineTransform at, double flatness) {
		// TODO Автоматически созданная заглушка метода
		return null;
	}

	@Override
	public boolean intersects(Rectangle2D r) {
		// TODO Автоматически созданная заглушка метода
		return false;
	}

	@Override
	public boolean intersects(double x, double y, double w, double h) {
		// TODO Автоматически созданная заглушка метода
		return false;
	}
	public List<Point2D> getPoints() {
		return coordinates;
	}

}
