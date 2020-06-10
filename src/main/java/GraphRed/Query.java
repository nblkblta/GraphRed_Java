package GraphRed;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

import Shapes.BaseShape;


public class Query implements Observed{
	private List<Observer> listOfObservers;
	private List<BaseShape> listOfShapes;
	private Color CurrColor;
	private BufferedImage buf;
	private Graphics buffer;
	private Settings settings;
	
	Query(Settings settings){
		listOfShapes = new ArrayList<BaseShape>();
		listOfObservers = new ArrayList<Observer>();
		CurrColor=Color.black;
		this.settings=settings;
		buf=new BufferedImage(this.settings.getDimension().width,this.settings.getDimension().height, BufferedImage.TYPE_INT_ARGB);
		buffer=buf.getGraphics();
		buffer.setColor(Color.white);
		buffer.fillRect(0, 2*this.settings.getButtonSize(), this.settings.getDimension().width, this.settings.getDimension().height);
	}
	
	public void addShape(BaseShape shape) {
		listOfShapes.add(shape);
		this.getLast().setColor(CurrColor);
	}
	public void printTo() {
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
		notifyObservers();
	}

	public BufferedImage getBuf() {
		printTo();
		return buf;
	}

	@Override
	public void addObserver(Observer observer) {
		listOfObservers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		listOfObservers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for (Observer observer: listOfObservers) {
			observer.handleEvent();
	}
	}
		
}
