package GraphRed;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import Shapes.BaseShape;

public class Query {

	private List<BaseShape> listOfShapes;
	
	Query(){
		listOfShapes = new ArrayList<BaseShape>();
	}
	
	public void addShape(BaseShape shape) {
		listOfShapes.add(shape);
	}
	public void printTo(Graphics g) {
		for (BaseShape shape: listOfShapes) {
			shape.drawShape(g);
		}	
	}
	public BaseShape getLastShape() {
		return listOfShapes.get(listOfShapes.size()-1);
	}
}
