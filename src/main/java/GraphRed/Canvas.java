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
	private Model model;
	private Canvas me;
	private int buttonSize;
	
	public Canvas(Model model, Settings settings) {
		me=this;
		int width = settings.getDimension().width;
		int heigth = settings.getDimension().height;
		this.buttonSize = settings.getButtonSize();
		this.model=model;
		this.setBounds(0, 2*buttonSize, width, heigth);
		this.repaint();
		this.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseClicked(MouseEvent event) {}
			@Override
			public void mouseEntered(MouseEvent arg0) {}
			@Override
			public void mouseExited(MouseEvent arg0) {}
			
			@Override
			public void mousePressed(MouseEvent event) {
				if (event.getY()>2*buttonSize) {
					if(model.getLast()!=null) {
						model.getLast().addCoordinates(event.getPoint());
						repaint();
						}
				}
			}
			
			@Override
			public void mouseReleased(MouseEvent event) {
				if (event.getY()>2*buttonSize) {
					if(model.getLast()!=null) {
						model.getLast().addCoordinates(event.getPoint());
						repaint();
						}
				}
			}});
		
		this.addMouseMotionListener(new MouseMotionListener() {

			@Override
			public void mouseDragged(MouseEvent event) {	
				if (event.getY()>2*buttonSize) {
					if(model.getLast()!=null) {
						model.getLast().addCurrCoordinates(event.getPoint());
						repaint();
					}
				}
			}

			@Override
			public void mouseMoved(MouseEvent arg0) {}
		});
	}
	
	public void paint(Graphics g) {
		g.drawImage(model.getBuf(),0,0,me);
	}

}
