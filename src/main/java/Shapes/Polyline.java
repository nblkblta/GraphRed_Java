package shapes;


import java.awt.geom.Point2D;
import java.awt.geom.Point2D.Double;
import java.util.ArrayList;
import java.util.List;

public class Polyline{

	private List<Point2D> coordinates;
	
	Polyline(){
		this.coordinates = new ArrayList<Point2D>();
		this.coordinates.add(new Point2D.Double(0,0));
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
	
	public List<Point2D> getPoints() {
		return coordinates;
	}

}
