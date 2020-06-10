package Shapes;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Shape;
import java.awt.geom.Point2D;
import java.io.Serializable;

@SuppressWarnings("serial")
public abstract class BaseShape implements Serializable{
	abstract public void drawShape(Graphics g);
	abstract public Color getColor();
	abstract public void setColor(Color color);
	abstract public Shape getShape();
	abstract public void setShape(Shape shape);
	abstract public void addCoordinates(Point2D point);
	abstract public void addCurrCoordinates(Point2D point);
}
