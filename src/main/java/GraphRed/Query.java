package GraphRed;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import Shapes.BaseShape;


public class Query {

	private List<BaseShape> listOfShapes;
	private Color CurrColor;
	
	Query(){
		listOfShapes = new ArrayList<BaseShape>();
		CurrColor=Color.black;
		
	}
	
	public void addShape(BaseShape shape) {
		listOfShapes.add(shape);
		this.getLast().setColor(CurrColor);
	}
	public void printTo(Graphics g) {
		for (BaseShape shape: listOfShapes) {
			if(shape.getShape()!=null)
			shape.drawShape(g);
		}	
	}
	public BaseShape getLast() {
		return listOfShapes.get(listOfShapes.size()-1);
	}
	public void setCurrColor(Color color) {
		this.CurrColor=color;
	}
	public void refresh() {
		this.listOfShapes.clear();
	}
	public int getSize() {
		return this.listOfShapes.size();
	}
}
