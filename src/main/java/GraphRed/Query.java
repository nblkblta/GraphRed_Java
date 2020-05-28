package GraphRed;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import Shapes.BaseShape;

public class Query {

	private List<BaseShape> listOfShapes;
	private Color defaultColor;
	Query(){
		listOfShapes = new ArrayList<BaseShape>();
		defaultColor=Color.black;
	}
	
	public void addShape(BaseShape shape) {
		listOfShapes.add(shape);
		this.getLastShape().setColor(defaultColor);
	}
	public void printTo(Graphics g) {
		for (BaseShape shape: listOfShapes) {
			shape.drawShape(g);
		}	
	}
	public BaseShape getLastShape() {
		return listOfShapes.get(listOfShapes.size()-1);
	}
	public void setDefaultColor(Color color) {
		this.defaultColor=color;
	}
}
