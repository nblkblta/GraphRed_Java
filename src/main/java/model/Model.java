package model;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.geom.Point2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;

import shapes.BaseShape;

public class Model implements Observed{
	private List<Observer> listOfObservers;
	private Query query;
	private BufferedImage buf;
	private Graphics buffer;
	private Settings settings;
	
	public Model(Settings settings){
		query = new Query();
		listOfObservers = new ArrayList<Observer>();
		this.settings=settings;
		buf=new BufferedImage(this.settings.getDimension().width,this.settings.getDimension().height, BufferedImage.TYPE_INT_ARGB);
		buffer=buf.getGraphics();
		buffer.setColor(Color.white);
		buffer.fillRect(0, this.settings.getPanelCount()*this.settings.getButtonSize(), this.settings.getDimension().width, this.settings.getDimension().height);
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
	
	public void addCoordinates(Point2D point) {
		if(point.getY()>settings.getButtonSize()*this.settings.getPanelCount()) {
		query.getLast().addCoordinates(point);
		notifyObservers();
		}
	}
	
	public void addCurrCoordinates(Point2D point) {
		if(point.getY()>settings.getButtonSize()*this.settings.getPanelCount()) {
		query.getLast().addCurrCoordinates(point);
		notifyObservers();
		}
	}
	
	public void setCurrColor(Color color) {
		query.setCurrColor(color);
		notifyObservers();
	}

	public BufferedImage getBuf() {
		buffer.setColor(Color.white);
		buffer.fillRect(0, this.settings.getPanelCount()*settings.getButtonSize(), settings.getDimension().width, settings.getDimension().height);
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

	public void savePng() throws IOException {
		File outputfile = new File("image.png");
		ImageIO.write(buf, "png", outputfile);
	}

	public void save() throws IOException {
		 FileOutputStream outputStream = new FileOutputStream("save.ser");
	     ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
	     objectOutputStream.writeObject(query);
	     objectOutputStream.close();
	}

	public void load() throws IOException, ClassNotFoundException {
		FileInputStream fileInputStream = new FileInputStream("save.ser");
	    try (ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
			query = (Query) objectInputStream.readObject();
			notifyObservers();
		}
	    
	}
		
}
