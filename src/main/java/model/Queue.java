package model;

import java.awt.Color;
import java.awt.Graphics;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import save.BaseShape;

public class Queue implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private List<BaseShape> listOfShapes;
	private Color CurrColor;
	
	Queue(){
		listOfShapes = new ArrayList<BaseShape>();
		CurrColor=Color.black;
	}
	
	public void addShape(BaseShape shape) {
		listOfShapes.add(shape);
		this.getLast().setColor(CurrColor);
	}
	
	public void printTo(Graphics buffer) {
		for (BaseShape shape: listOfShapes) {
			if(!shape.isNull()) {
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

	public void removeLast() {
		listOfShapes.remove(listOfShapes.size()-1);
	}

	public List<BaseShape> getShapes() {
		return listOfShapes ;
	}
		
}
