package GraphRed;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

import Shapes.BaseShape;

public class Model implements Observed{
	private List<Observer> listOfObservers;
	private Query query;
	private BufferedImage buf;
	private Graphics buffer;
	private Settings settings;
	
	Model(Settings settings){
		query = new Query(settings);
		listOfObservers = new ArrayList<Observer>();
		this.settings=settings;
		buf=new BufferedImage(this.settings.getDimension().width,this.settings.getDimension().height, BufferedImage.TYPE_INT_ARGB);
		buffer=buf.getGraphics();
		buffer.setColor(Color.white);
		buffer.fillRect(0, 2*this.settings.getButtonSize(), this.settings.getDimension().width, this.settings.getDimension().height);
	}
	
	public void refresh() {
		this.query.refresh();
		notifyObservers();
	}
	
	public BaseShape getLast() {
		return query.getLast();
	}
	
	public void addShape(BaseShape shape) {
		query.addShape(shape);
	}
	
	public void setCurrColor(Color color) {
		query.setCurrColor(color);
		notifyObservers();
	}

	public BufferedImage getBuf() {
		query.printTo(buffer);
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
