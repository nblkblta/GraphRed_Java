/**
 * 
 */
package GraphRed;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import javax.swing.JPanel;

import Shapes.BaseShape;

/**
 * @author nblk
 *
 */
public class Canvas extends JPanel {
	Canvas me;
	private int width;
	private int heigth;
	private int buttonSize;
	private Query query;
	private BufferedImage buf;
	private Graphics buffer;
	public Canvas(int width,int heigth, Query query) {
		me=this;
		me.width=width;
		me.heigth=heigth-80;
		me.query=query;
		buf=new BufferedImage(me.width,me.width, BufferedImage.TYPE_INT_ARGB);
		buffer=buf.getGraphics();
		buffer.setColor(Color.white);
		buffer.fillRect(0, 80, me.width, me.heigth);
		
		me.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseClicked(MouseEvent event) {
				
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				
			}
			
			@Override
			public void mousePressed(MouseEvent event) {
				query.getLastShape().addCoordinates(event.getPoint());	
			}
			

			@Override
			public void mouseReleased(MouseEvent event) {
				query.getLastShape().addCoordinates(event.getPoint());
				paintToBuffer(buffer);
				repaint();
			}});
		this.addMouseMotionListener(new MouseMotionListener() {

			@Override
			public void mouseDragged(MouseEvent event) {	
				query.getLastShape().addCurrCoordinates(event.getPoint());
				paintToBuffer(buffer);
				repaint();
			}

			@Override
			public void mouseMoved(MouseEvent arg0) {
				
			}
			
		});
	}
	public void paintToBuffer(Graphics g) {
		buffer.setColor(Color.white);
		buffer.fillRect(0, 80, me.width, me.heigth);
		query.printTo(g);
	}

	public void paint(Graphics g) {
		g.drawImage(buf,0,0,me);
	}

}
