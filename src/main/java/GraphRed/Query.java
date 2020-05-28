package GraphRed;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import Shapes.BaseShape;
import Shapes.RectShape;

public class Query {

	private List<BaseShape> listOfShapes;
	private Color defaultColor;
	Query(){
		listOfShapes = new ArrayList<BaseShape>();
		listOfShapes.add(new RectShape());
		defaultColor=Color.black;
	}
	
	public void addShape(BaseShape shape) {
		if(this.getLast().getShape()==null) {
			listOfShapes.add(listOfShapes.size()-1, shape);
		}else{
		listOfShapes.add(shape);
		}
		this.getLast().setColor(defaultColor);
	}
	public void printTo(Graphics g) {
		for (BaseShape shape: listOfShapes) {
			shape.drawShape(g);
		}	
	}
	public BaseShape getLast() {
		return listOfShapes.get(listOfShapes.size()-1);
	}
	public void setDefaultColor(Color color) {
		this.defaultColor=color;
	}
}
