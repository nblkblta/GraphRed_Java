/**
 * 
 */
package GraphRed;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;



/**
 * @author nblk
 *
 */
@SuppressWarnings("serial")
public class Canvas extends JPanel {
	private Query query;
	private Canvas me;
	
	public Canvas(Query query, Settings settings) {
		me=this;
		int width = settings.getDimension().width;
		int heigth = settings.getDimension().height;
		int buttonSize = settings.getButtonSize();
		this.query=query;
		this.setBounds(0, 2*buttonSize, width, heigth);
		this.repaint();
		this.addMouseListener(new MouseListener() {
			
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
				if (event.getY()>80) {
				query.getLast().addCoordinates(event.getPoint());	
				repaint();
				}
			}
			

			@Override
			public void mouseReleased(MouseEvent event) {
				if (event.getY()>80) {
				query.getLast().addCoordinates(event.getPoint());
				repaint();
				}
			}});
		this.addMouseMotionListener(new MouseMotionListener() {

			@Override
			public void mouseDragged(MouseEvent event) {	
				if (event.getY()>80) {
				query.getLast().addCurrCoordinates(event.getPoint());
				repaint();
				}
			}

			@Override
			public void mouseMoved(MouseEvent arg0) {
				
			}
			
		});
	}
	
	public void paint(Graphics g) {
		g.drawImage(query.getBuf(),0,0,me);
	}

}
