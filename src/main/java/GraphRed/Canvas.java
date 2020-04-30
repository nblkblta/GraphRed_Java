/**
 * 
 */
package GraphRed;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 * @author nblk
 *
 */
public class Canvas extends JPanel {
	Canvas me;
	private int mode;//Состояние текущего инструмента, 1 - карандаш, 2 - прямоугольник
	public int width;
	public int heigth;
	public int buttonSize;
	ArrayList<Point> listOfPoints = new ArrayList<Point>();
	ArrayList<Rectangle> listOfRects = new ArrayList<Rectangle>();
	public Canvas(int width,int heigth, int buttonSize) {
		setMode(1); 
		me=this;
		this.width=width;
		this.heigth=heigth;
		this.buttonSize=buttonSize;
		this.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseClicked(MouseEvent event) {
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Автоматически созданная заглушка метода
				
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Автоматически созданная заглушка метода
				
			}
			
			
			@Override
			public void mousePressed(MouseEvent event) {
				switch(mode) {
				case 1 :
				{
						listOfPoints.add(event.getPoint());
						Rectangle rec = new Rectangle();
						rec.setFrameFromDiagonal(listOfPoints.get(listOfPoints.size()-1), listOfPoints.get(listOfPoints.size()-1));
						listOfRects.add(rec);
						listOfPoints.remove(listOfPoints.size()-1);
						repaint();
						
				}
				case 2 :
				{
					listOfPoints.add(event.getPoint());
				}
				}
			}

			@Override
			public void mouseReleased(MouseEvent event) {
				switch(mode) {
				case 2 :
					{ 
					listOfPoints.add(event.getPoint());
					Rectangle rec = new Rectangle();
					rec.setFrameFromDiagonal(listOfPoints.get(listOfPoints.size()-2), listOfPoints.get(listOfPoints.size()-1));
					listOfRects.add(rec);
					listOfPoints.remove(listOfPoints.size()-1);
					listOfPoints.remove(listOfPoints.size()-1);
					repaint();
					}
				}
				
			}});
		this.addMouseMotionListener(new MouseMotionListener() {

			@Override
			public void mouseDragged(MouseEvent event) {
				switch(mode) {
				case 1 :
				{
						listOfPoints.add(event.getPoint());
						Rectangle rec = new Rectangle();
						rec.setFrameFromDiagonal(listOfPoints.get(listOfPoints.size()-1), listOfPoints.get(listOfPoints.size()-1));
						listOfRects.add(rec);
						listOfPoints.remove(listOfPoints.size()-1);
						repaint();
						
				}
				}
				
			}

			@Override
			public void mouseMoved(MouseEvent arg0) {
				// TODO Автоматически созданная заглушка метода
				
			}
			
		});
	}

	public int getMode() {
		return mode;
	}

	public void setMode(int mode) {
		this.mode = mode;
	}

	public void paint(Graphics g) {
		g.setColor(Color.WHITE);
		g.fillRect(buttonSize, 0, width-buttonSize, heigth);
		g.setColor(Color.BLACK);
		for(Rectangle rect: listOfRects) {
			g.drawRect(rect.x, rect.y, rect.width, rect.height);
		}
	}

}
