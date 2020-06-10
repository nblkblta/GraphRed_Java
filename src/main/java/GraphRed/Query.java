package GraphRed;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import Shapes.BaseShape;


public class Query{
	private List<BaseShape> listOfShapes;
	private Color CurrColor;
	private Settings settings;
	
	Query(Settings settings){
		listOfShapes = new ArrayList<BaseShape>();
		CurrColor=Color.black;
		this.settings=settings;
	}
	
	public void addShape(BaseShape shape) {
		listOfShapes.add(shape);
		this.getLast().setColor(CurrColor);
	}
	
	public void printTo(Graphics buffer) {
		buffer.setColor(Color.white);
		buffer.fillRect(0, 2*settings.getButtonSize(), settings.getDimension().width, settings.getDimension().height);
		for (BaseShape shape: listOfShapes) {
			if(shape.getShape()!=null) {
			shape.drawShape(buffer);
			}
		}	
	}
	public BaseShape getLast() {
		if(listOfShapes.size()==0) {
			return null;
		}
		return listOfShapes.get(listOfShapes.size()-1);
	}
	
	public void setCurrColor(Color color) {
		this.CurrColor=color;
	}
	
	public void refresh() {
		this.listOfShapes.clear();
	}
		
}
