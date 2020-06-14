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

import patterns.Observed;
import patterns.Observer;
import shapes.BaseShape;
import shapes.EllipseShape;
import shapes.PencilShape;
import shapes.PolygonShape;
import shapes.PolylineShape;
import shapes.RectShape;
import shapes.SaveShape;
import shapes.SaveShapeQueue;

public class Model implements Observed{
	private List<Observer> listOfObservers;
	private Queue queue;
	private BufferedImage buf;
	private Graphics buffer;
	private Settings settings;
	private static Model me;
	
	private Model(){
		queue = new Queue();
		listOfObservers = new ArrayList<Observer>();
		this.settings=Settings.getSettings();
		buf=new BufferedImage(this.settings.getDimension().width,this.settings.getDimension().height, BufferedImage.TYPE_INT_ARGB);
		buffer=buf.getGraphics();
		buffer.setColor(Color.white);
		buffer.fillRect(0, this.settings.getPanelCount()*this.settings.getButtonSize(), this.settings.getDimension().width, this.settings.getDimension().height);
	}
	
	public static Model getModel() {
		if(me==null) {
			me=new Model();
		}
		return me;	
	}
	
	public void refresh() {
		this.queue.refresh();
		notifyObservers();
	}
	
	public BaseShape getLast() {
		return queue.getLast();
	}
	
	public void addShape(BaseShape shape) {
		/*if(queue.getLast()!=null){
			if(queue.getLast().getShape()==null) {
				queue.removeLast();
			}
		}*/
		queue.addShape(shape);
	}
	
	public void addFirstCoordinates(Point2D point) {
		if(point.getY()>settings.getButtonSize()*this.settings.getPanelCount()) {
		queue.getLast().addFirstCoordinates(point);
		notifyObservers();
		}
	}
	public void addSecondCoordinates(Point2D point) {
		if(point.getY()>settings.getButtonSize()*this.settings.getPanelCount()) {
		queue.getLast().addSecondCoordinates(point);
		notifyObservers();
		}
	}
	
	public void addCurrCoordinates(Point2D point) {
		if(point.getY()>settings.getButtonSize()*this.settings.getPanelCount()) {
		queue.getLast().addCurrCoordinates(point);
		notifyObservers();
		}
	}
	
	public void setCurrColor(Color color) {
		queue.setCurrColor(color);
		notifyObservers();
	}

	public BufferedImage getBuf() {
		buffer.setColor(Color.white);
		buffer.fillRect(0, this.settings.getPanelCount()*settings.getButtonSize(), settings.getDimension().width, settings.getDimension().height);
		queue.printTo(buffer);
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
		SaveShapeQueue shapes = new SaveShapeQueue();
		for(BaseShape shape:queue.getShapes()) {
			shapes.addShape(new SaveShape(shape));
		}
		FileOutputStream outputStream = new FileOutputStream("save.ser");
	    ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
	    objectOutputStream.writeObject(shapes);
	    objectOutputStream.close();
	}

	public void load() throws IOException, ClassNotFoundException {
		SaveShapeQueue shapes = new SaveShapeQueue();
		FileInputStream fileInputStream = new FileInputStream("save.ser");
	    try (ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
			shapes = (SaveShapeQueue) objectInputStream.readObject();
			refresh();
			for (SaveShape saveShape:shapes.getShapes()) {
				setCurrColor(saveShape.getColor());
				if(saveShape.getType().equals("Ellipse")) {
					addShape(new EllipseShape());
				}else if (saveShape.getType().equals("Rectangle")) {
					addShape(new RectShape());
				}else if (saveShape.getType().equals("Pencil")) {
					addShape(new PencilShape());
				}else if (saveShape.getType().equals("Polygon")) {
					addShape(new PolygonShape());
				}else if (saveShape.getType().equals("Polyline")) {
					addShape(new PolylineShape());
				}else throw new RuntimeException("problem");
				if(saveShape.getPoints().size()!=0) {
					getLast().setCoordinates(saveShape.getPoints());
				}
			}
			notifyObservers();
		}
	    
	}
		
}
